package lesson1.builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder.firstName("Дмитрий")
                .lastName("Поздеев")
                .address("Санкт-Петербург")
                .country("Россия")
                .phone("+555")
                .gender("мужской")
                .age(38).build();

        System.out.println(person);
    }
}
