package view;

import controller.StudentController;
import controller.TeacherController;
import model.impl.Student;
import model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private TeacherController controller = new TeacherController();

    public void start(){
//        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать учителя");
            System.out.println("2 - найти учителя по id");
            System.out.println("3 - распечатать информацию о всех учителях");
            System.out.println("0 - выход");

            switch (scanner.nextInt()) {
                case 1 -> createTeacher();
                case 2 -> getById();
                case 3 -> getAllTeacher();
                case 0 -> {
                    return;
                }

                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        Teacher teacher = controller.createTeacher(name, lastName);
        System.out.println(teacher);
        return teacher;

    };
    private Teacher getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        Teacher teacher = controller.getById(id);
        System.out.println(teacher);
        return teacher;
    };
    private List<Teacher> getAllTeacher(){
        List<Teacher> teachers = controller.getAllStudents();
        System.out.println(teachers);
        return teachers;
    };
}
