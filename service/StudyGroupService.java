package service;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;

import java.util.List;

public class StudyGroupService {
    private int idGroup = 1;

    public StudyGroup createStudyGroup() {// отвечает только за создание студента (чистый метод)

        StudyGroup studyGroup = new StudyGroup(idGroup);
        idGroup++;
        DataBase.STUDY_GROUP_LIST.add(studyGroup);
        return studyGroup;
    }

    public void addTeacher(int idGroup, int id) throws Exception {
        StudyGroup studyGroup = DataBase.STUDY_GROUP_LIST
                .stream()
                .filter(s -> s.getIdGroup() == idGroup)
                .findFirst()
                .orElse(null);
        if (studyGroup == null) {
            throw new Exception("Группа не найдена");
        }
        Teacher teacher = DataBase.teachersDB
                .stream()

                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (studyGroup == null) {
            throw new Exception("Учитель не найден");
        }
        if (studyGroup != null && teacher != null) {
            studyGroup.setTeacher(teacher);
        }

    }
    public void addStudent(int idGroup, int id) throws Exception {
        StudyGroup studyGroup = DataBase.STUDY_GROUP_LIST
                .stream()

                .filter(s -> s.getIdGroup() == idGroup)
                .findFirst()
                .orElse(null);
        if (studyGroup == null) {
            throw new Exception("Группа не найдена");
        }
        Student student = DataBase.studentsDB
                .stream()

                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (studyGroup == null) {
            throw new Exception("Учитель не найден");
        }
        if (studyGroup != null && student != null) {
            studyGroup.setGroup(List.of(student));
        }

    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB
                .stream()

                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null) {
            throw new Exception("Студент не найден");
        }
        return student;
    }

    public List<StudyGroup> getAllStudyGroup() {
        return DataBase.STUDY_GROUP_LIST;
    }
}
