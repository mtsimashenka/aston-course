package lesson2_6;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
        System.out.println("Добавлен контакт: " + lastName + " - " + phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public void printAll() {
        System.out.println("\n ТЕЛЕФОННЫЙ СПРАВОЧНИК");
        if (phoneBook.isEmpty()) {
            System.out.println("Справочник пуст");
        }
    }

    public int size() {
        return phoneBook.size();
    }

    public Set<String> getAllLastNames() {
        return new HashSet<>(phoneBook.keySet());
    }
}

