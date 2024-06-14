package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class Teacher extends User {
    private int idGroup;

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    //    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

//    public void addGroupId(int id) {//обязательно убрать в сервис (ошибка проектирования)
//        groups.add(id);
//    }

    @Override
    public String toString() {
        return super.toString()+", idGroup = "+ idGroup;
    }
}
