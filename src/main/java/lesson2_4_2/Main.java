package lesson2_4_2;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0, "красный", "черный"),
                new Rectangle(4.0, 6.0, "синий", "зеленый"),
                new Triangle(3.0, 4.0, 5.0, "желтый", "фиолетовый")
        };

        String[] shapeNames = {"КРУГ", "ПРЯМОУГОЛЬНИК", "ТРЕУГОЛЬНИК"};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapeNames[i] + ":");
            shapes[i].displayInfo();
        }

        Circle circle = new Circle(3.0, "оранжевый", "коричневый");
        System.out.println("Круг (радиус = " + circle.getRadius() + "):");
        System.out.println("Площадь: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Длина окружности: " + String.format("%.2f", circle.calculatePerimeter()));

        Rectangle rectangle = new Rectangle(5.0, 3.0, "розовый", "серый");
        System.out.println("\nПрямоугольник (" + rectangle.getWidth() + " x " + rectangle.getHeight() + "):");
        System.out.println("Площадь: " + String.format("%.2f", rectangle.calculateArea()));
        System.out.println("Периметр: " + String.format("%.2f", rectangle.calculatePerimeter()));
    }
}
