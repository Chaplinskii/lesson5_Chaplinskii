package model.DB;

import java.util.ArrayList;
import java.util.List;

import controller.StudentController;
import controller.StudyGroupController;
import controller.TeacherController;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;
//симулирует базу данных
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static final List<StudyGroup> STUDY_GROUP_LIST = new ArrayList<>();

    public static void fillDB(){
        StudyGroupController studyGroupController = new StudyGroupController();
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        for (int i = 0; i < 3; i++) {
            StringBuilder name = new StringBuilder("Grigorii_"+i);
            StringBuilder lastName = new StringBuilder("Petrov_"+i);
            StudyGroup studyGroup = studyGroupController.createStudyGroup();
            Teacher teacher = teacherController.createTeacher(name.toString(), lastName.toString());
            studyGroup.setTeacher(teacher);
            for (int j = 0; j < 3; j++) {
                StringBuilder name1 = new StringBuilder("Victor_"+j);
                StringBuilder lastName2 = new StringBuilder("Bobrov_"+j);
                Student student = studentController.createStudent(name.toString(), lastName.toString());
                studyGroup.setGroup(List.of(student));
            }
        }
//        Teacher teacher = new Teacher(1, "Вася", "Иванов");
//
//        teachersDB.add(teacher);
//        Student s1 = new Student(1, "Рикон", "Старк");
//        Student s2 = new Student(2, "Джофри", "Ланистер");
//        studentsDB.add(s1);
//        studentsDB.add(s2);
//        StudyGroup studyGroup = new StudyGroup(5);
//        studyGroup.setTeacher(teachersDB.getFirst());
//        studyGroup.setGroup(List.of(studentsDB.getFirst()));
//        STUDY_GROUP_LIST.add(studyGroup);
//        System.out.println(studyGroup);
        System.out.println(STUDY_GROUP_LIST);
    }
}
