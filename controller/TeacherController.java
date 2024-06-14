package controller;

import model.impl.Student;
import model.impl.Teacher;
import service.StudentService;
import service.TeacherService;

import java.util.List;

public class TeacherController {
    private TeacherService service = new TeacherService();

    public Teacher createTeacher(String name, String lastName) {
        return service.createTeacher(name, lastName);

    }

    public Teacher getById(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> getAllStudents() {
        return service.getAllTeacher();
    }
}
