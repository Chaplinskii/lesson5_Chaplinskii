package model.impl;

import model.User;

public class Student extends User{

    private int idGroup;

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);

    }

    @Override
    public String toString() {
        return super.toString()+", idGroup = "+ idGroup;
    }
}
