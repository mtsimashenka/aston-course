package lesson2_5;

public class ArrayProcessor {
    public static void validateArraySize(String[][] array) throws MyArraySizeException {
        if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }
        if (array.length != 4) {
            throw new MyArraySizeException(
                    "Неверное количество строк. Ожидается 4, получено: " + array.length
            );
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException("Строка " + i + " не может быть null");
            }
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Неверное количество столбцов в строке " + i +
                                ". Ожидается 4, получено: " + array[i].length
                );
            }
        }
    }
        public static int processArrayAndCalculateSum (String[][]array)
            throws MyArraySizeException, MyArrayDataException {
            validateArraySize(array);
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(
                                "Невозможно преобразовать элемент в число: '" + array[i][j] + "'",
                                i, j
                        );
                    }
                }
            }
            return sum;
        }

    public static void demonstrateArrayIndexException() {
        System.out.println("\n ДЕМОНСТРАЦИЯ ArrayIndexOutOfBoundsException");

        int[] testArray = {1, 2, 3, 4, 5};

        try {
            System.out.println("Попытка получить элемент с индексом 10:");
            int value = testArray[10];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Массив имеет длину: " + testArray.length);
            System.out.println("Допустимые индексы: от 0 до " + (testArray.length - 1));
        }

        String[][] matrix = {
                {"a", "b"},
                {"c", "d"}
        };

        try {
            System.out.println("\nПопытка получить элемент [3][1] из матрицы 2x2:");
            String value = matrix[3][1];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Матрица имеет размеры: " + matrix.length + "x" + matrix[0].length);
        }
    }
}
