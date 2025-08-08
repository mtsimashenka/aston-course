package lesson2_6;

import java.util.Iterator;
import java.util.Set;

public class StudentManager {

    public static void removeLowPerformingStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                System.out.println("Удален студент: " + student.getName() +
                        " (средний балл: " + String.format("%.2f", student.getAverageGrade()) + ")");
                iterator.remove();
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        System.out.println("\n ПЕРЕВОД СТУДЕНТОВ НА СЛЕДУЮЩИЙ КУРС");
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\n СТУДЕНТЫ " + course + " КУРСА");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на " + course + " курсе");
        }
    }

    public static void printAllStudents(Set<Student> students) {
        System.out.println("\n ВСЕ СТУДЕНТЫ");
        if (students.isEmpty()) {
            System.out.println("Нет студентов");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
