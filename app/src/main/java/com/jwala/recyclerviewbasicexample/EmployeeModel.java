package com.jwala.recyclerviewbasicexample;

public class EmployeeModel {

    private int id;
    private String name;
    private int image;

    public EmployeeModel(int id) {
        this.id = id;
    }

    public EmployeeModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeModel(int id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
