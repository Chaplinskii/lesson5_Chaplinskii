package view;

import controller.StudentController;
import controller.StudyGroupController;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class StudyGroupView {
    private StudyGroupController studyGroupController = new StudyGroupController();

    public void start() throws Exception {
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать учебную группу");
            System.out.println("2 - добавить учителя в группу");
            System.out.println("3 - добавить студента в группу");
            System.out.println("4 - найти студента по id");
            System.out.println("5 - распечатать информацию о всех группах");
            System.out.println("0 - выход");

            switch (scanner.nextInt()) {
                case 1 -> createStudyGroup();
                case 2 -> addTeacher();
                case 3 -> addStudent();
                case 4 -> getById();
                case 5 -> getAllStudyGroup();
                case 0 -> {
                    return;// выход из приложения
                }

                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private StudyGroup createStudyGroup(){

        StudyGroup studyGroup = studyGroupController.createStudyGroup();

        return studyGroup;

    }
    public void addStudent() throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (StudyGroup s:DataBase.STUDY_GROUP_LIST){
            System.out.println("StudyGroup: idGroup = "+s.getIdGroup());
        }
        System.out.println("Введите idGroup группы: ");
        int idGroup = scanner.nextInt();
        for (Student s: DataBase.studentsDB){
            System.out.println("Student : id = "+s.getId());
        }
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        studyGroupController.addStudent(idGroup,id);

    }

    public void addTeacher() throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (StudyGroup s:DataBase.STUDY_GROUP_LIST){
            System.out.println("StudyGroup: idGroup = "+s.getIdGroup());
        }
        System.out.println("Введите idGroup группы: ");
        int idGroup = scanner.nextInt();
        for (Teacher s: DataBase.teachersDB){
            System.out.println("Teacher: id = "+s.getId());
        }
        System.out.println("Введите id учителя: ");
        int id = scanner.nextInt();
        studyGroupController.addTeacher(idGroup,id);

    }
    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        Student student = studyGroupController.getById(id);
        System.out.println(student);
        return student;
    }
    public List<StudyGroup> getAllStudyGroup(){
        List<StudyGroup> studyGroups = studyGroupController.getAllStudyGroup();
        System.out.println(studyGroups);
        return studyGroups;
    }

}
