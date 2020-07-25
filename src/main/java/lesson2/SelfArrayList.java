package lesson2;

public class SelfArrayList<E> {

    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10; //начальный размер массива

    public SelfArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
    }

    public SelfArrayList(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Недопустимое значение емкости массива");
        this.array = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        boolean result = false;
        for (Object element : array) {
            if (element.equals(o))
                return true;
        }
        return result;
    }

    public Object[] toArray() {
        Object[] new_array = new Object[size];
        System.arraycopy(array,0,new_array,0,size);
        return new_array;
    }

    public void add(E e) {
        if (array.length == size) {
            resize(size * 2);
        }
        array[size++] = e;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        //сдвигаем элементы на один влево, начиная с удаляемого индекса
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        //если последний элемент
        //if (index == size - 1) {
        array[size-1] = null;
        size--;
        //}
        return true;
    }

    public boolean remove(Object o) {

        int index = indexOf(o);
        if (index == -1)
            return false;

        return remove(index);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Индекс за пределами возможных значений: " + size + ", длина массива " + size);
        return (E) array[index];
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            if (i>0)  builder.append(", ");
            builder.append(array[i]);

        }
        return builder.toString();
    }
}