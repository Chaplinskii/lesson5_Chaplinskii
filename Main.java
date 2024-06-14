import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.Scanner;

public static void main(String[] args) throws Exception {

//    new StudentView().start();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("1 - работа с учениками");
        System.out.println("2 - работа с учителями");
        System.out.println("3 - работа с учебными группами");
        System.out.println("0 - выход");

        switch (scanner.nextInt()) {
            case 1 -> new StudentView().start();
            case 2 -> new TeacherView().start();
            case 3 -> new StudyGroupView().start();
            case 0 -> System.exit(0);// выход из приложения

            default -> System.out.println("Операция не поддерживается");
        }
    }
}