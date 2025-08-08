package lesson2_6;

import java.util.LinkedHashSet;
import java.util.Set;

import static lesson2_6.StudentManager.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();

        Student student1 = new Student("Иванов Иван", "Группа1", 1);
        student1.addGrade(4);
        student1.addGrade(3);
        student1.addGrade(5);
        student1.addGrade(4);

        Student student2 = new Student("Петров Петр", "Группа2", 2);
        student2.addGrade(2);
        student2.addGrade(2);
        student2.addGrade(1);
        student2.addGrade(3);

        Student student3 = new Student("Сидорова Мария", "Группа1", 1);
        student3.addGrade(5);
        student3.addGrade(4);
        student3.addGrade(5);
        student3.addGrade(5);

        Student student4 = new Student("Козлов Алексей", "Группа3", 3);
        student4.addGrade(3);
        student4.addGrade(2);
        student4.addGrade(4);
        student4.addGrade(3);

        Student student5 = new Student("Морозова Анна", "Группа2", 2);
        student5.addGrade(1);
        student5.addGrade(2);
        student5.addGrade(1);
        student5.addGrade(2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        printAllStudents(students);

        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);

        System.out.println("\n УДАЛЕНИЕ СЛАБЫХ СТУДЕНТОВ");
        removeLowPerformingStudents(students);

        printAllStudents(students);

        promoteStudents(students);

        printAllStudents(students);

        System.out.println("\n СТУДЕНТЫ ПОСЛЕ ПЕРЕВОДА");
        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
    }
}
