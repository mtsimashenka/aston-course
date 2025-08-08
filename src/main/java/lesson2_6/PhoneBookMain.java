package lesson2_6;

import java.util.List;

public class PhoneBookMain {
    public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

        System.out.println(" ДОБАВЛЕНИЕ ЗАПИСЕЙ");

        phoneBook.add("Иванов","+375(29)123-45-67");
        phoneBook.add("Петров","+375(29)234-56-78");
        phoneBook.add("Сидоров","+375(29)345-67-89");
        phoneBook.add("Иванов","+375(29)987-65-43");
        phoneBook.add("Петров","+375(29)876-54-32");
        phoneBook.add("Петров","+375(29)111-22-33");
        phoneBook.printAll();

        System.out.println("\n ПОИСК ПО ФАМИЛИИ");

    searchAndPrint(phoneBook, "Иванов");

    searchAndPrint(phoneBook, "Петров");

    searchAndPrint(phoneBook, "Сидоров");

    searchAndPrint(phoneBook, "Козлов"); // Фамилия отсутствует

        System.out.println("\n ДОПОЛНИТЕЛЬНЫЕ ОПЕРАЦИИ");

        System.out.println("Все фамилии в справочнике: "+phoneBook.getAllLastNames());
        System.out.println("Количество уникальных фамилий: "+phoneBook.size());
        phoneBook.add("Козлов","+375(29)555-66-77");
        System.out.println("После добавления Козлова:");

    searchAndPrint(phoneBook, "Козлов");
}

    private static void searchAndPrint(PhoneBook phoneBook, String lastName) {
        System.out.println("\nПоиск по фамилии: " + lastName);
        List<String> phones = phoneBook.get(lastName);

        if (phones.isEmpty()) {
            System.out.println("Фамилия " + lastName + " не найдена в справочнике");
        } else {
            System.out.println("Найдено " + phones.size() + " телефон(ов):");
            for (int i = 0; i < phones.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + phones.get(i));
            }
        }
    }
}
