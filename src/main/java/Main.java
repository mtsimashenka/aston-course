public class Main {

    public static void main(String[] args) {
        printTreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(3, 6));
        printNumberSign(-5);

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("\nМассив после инверсии:");
        printArray(array);

        System.out.println();

        int[] arrayAdd = new int[100];
        for (int i = 0; i < arrayAdd.length; i++) {
            arrayAdd[i] = i + 1;
        }
        System.out.println("Массив после заполнения:");
        for (int num : arrayAdd) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] arrayMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray(arrayMultiplication);
        for (int i = 0; i < arrayMultiplication.length; i++) {
            if (arrayMultiplication[i] < 6) {
                arrayMultiplication[i] *= 2;
            }
        }
        System.out.println("Массив после обработки:");
        printArray(arrayMultiplication);

        System.out.println();

        int size = 6;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Массив с главной диагональю, заполненной единицами:");
        printMatrix(matrix);

        System.out.println();

        int len = 5;
        int initialValue = 8;

        int[] result = createIntArray(len, initialValue);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 5;
        int b = 8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 44;
        int b = 32;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int number) {
        if (number <= 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[] createIntArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
