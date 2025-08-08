package lesson2_5;

import static lesson2_5.ArrayProcessor.demonstrateArrayIndexException;
import static lesson2_5.ArrayProcessor.processArrayAndCalculateSum;

public class Main {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\n Test 1: Корректный массив");
        try {
            int sum = processArrayAndCalculateSum(correctArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println("\n Test 2: Неправильный размер");
        try {
            int sum = processArrayAndCalculateSum(wrongSizeArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        String[][] arrayWithText = {
                {"1", "2", "3", "4"},
                {"5", "abc", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\n Test 3: Неправильные данные");
        try {
            int sum = processArrayAndCalculateSum(arrayWithText);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        String[][] arrayWithEmpty = {
                {"1", "2", "", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\n Test 4: Пустые значения");
        try {
            int sum = processArrayAndCalculateSum(arrayWithEmpty);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке [" + e.getRow() + "][" + e.getCol() + "]: " + e.getMessage());
        }

        demonstrateArrayIndexException();
    }
}
