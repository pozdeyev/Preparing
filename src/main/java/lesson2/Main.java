package lesson2;

public class Main {
    public static void main(String[] args) {

        SelfArrayList<Integer> arrayList = new SelfArrayList(5);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        Object[] arr = arrayList.toArray();
        System.out.println("Массив: ");
        for (Object obj: arr
        ) {
            System.out.println(obj);
        }

        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println("Удалили число с индексом 4: " + arrayList + ". Длина " + arrayList.size());

        arrayList.remove(9);
        System.out.println("Удалили число с индексом 9: " + arrayList + ". Длина " + arrayList.size());

        System.out.println("Индекс числа 5: " + arrayList.indexOf(3));

        System.out.println("Содержит число 8:" + arrayList.contains(7));

        arrayList.clear();
        System.out.println(arrayList);


        System.out.println("=======================================");

        SelfLinkedList<Integer> list = new SelfLinkedList<>();
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        System.out.println(list);
        System.out.println("Длина связанного списка " + list.size());

        System.out.println("Первый элемент " + list.getFirst() + ", последний элемент " + list.getLast());
        System.out.println("Значение элемента под индексом 8 = " + list.get(8));
        System.out.println("Содержит 4: " + list.contains(4));
        System.out.println("Содержит 31: " + list.contains(31));
        System.out.println("После удаления последнего элемента : " + list.removeLast() + " размер = " + list.size());
        System.out.println("После удаления первого элемента : " + list.removeFirst() + " размер = " + list.size());
        list.set(2, 44);
        System.out.println(list);
        System.out.println("Индекс числа 6 = " + list.indexOf(6));
        list.clear();
        System.out.println("Размер после очистки " + list.size());
        System.out.println(list);
    }
}
