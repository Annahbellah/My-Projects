package dev.decagon.model;


import dev.decagon.Enums.GENDER;

public abstract class Persons{
    private String fullName;
    private Integer age;
    private String email;
    private Integer id;
    private GENDER gender;

    public Persons() {
    }

    public Persons(String fullName, Integer age, String email, Integer id) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.id = id;

    }


    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "model.Persons{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
