package lesson2_4_2;

interface Shape {

    String getFillColor();

    String getBorderColor();

    double calculateArea();

    default double calculatePerimeter() {
        return 0;
    }

    default void displayInfo() {
        System.out.println("Площадь: " + String.format("%.2f", calculateArea()));
        System.out.println("Периметр: " + String.format("%.2f", calculatePerimeter()));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
