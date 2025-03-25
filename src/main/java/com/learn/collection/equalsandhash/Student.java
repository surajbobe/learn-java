package com.learn.collection.equalsandhash;

import java.util.Objects;

public class Student {

    private int id;
    private String name;

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

//   @Override
//    public boolean equals(Object object){
//        if(object == null || getClass() != object.getClass()) return false;
//        Student student = (Student) object;
//        return this.id == student.id && this.name.equals(student.name);
//    }
//
//    @Override
//   public int hashCode(){
//        return Objects.hash(id, name);
//   }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
