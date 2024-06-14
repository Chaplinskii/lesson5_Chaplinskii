package controller;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createStudyGroup() {
        return studyGroupService.createStudyGroup();
    }
    public List<StudyGroup> getAllStudyGroup() {
        return studyGroupService.getAllStudyGroup();
    }
    public Student getById(int id) {

        Student student = null;
        try {
            student = studyGroupService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }
    public void addTeacher(int idGroup, int id) throws Exception {
        studyGroupService.addTeacher(idGroup,id);
    }
    public void addStudent(int idGroup, int id) throws Exception {
        studyGroupService.addStudent(idGroup,id);
    }
}
