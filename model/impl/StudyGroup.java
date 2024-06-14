package model.impl;

import java.util.List;

public class StudyGroup {
    private int idGroup;
    private  Teacher teacher;
    private List<Student> group;
    public StudyGroup(int idGroup) {

        this.idGroup = idGroup;
    }

    public int getIdGroup() {
        return idGroup;
    }



    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.setIdGroup(idGroup);
    }

    public void setGroup(List<Student> group) {
        this.group = group;
        for (Student s: group){
            s.setIdGroup(idGroup);
        }
    }



    @Override
    public String toString() {

        return "\n"+"StudyGroup: "+"IdGroup = "+idGroup+"\n"+"TeacherGroup = "+ teacher+ "\n"+" StudentsGroup = "+ group;
    }
}
