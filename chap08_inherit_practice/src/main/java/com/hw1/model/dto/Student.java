package com.hw1.model.dto;

public class Student extends Person{
    private int grade;
    private String major;

    public Student(){

    }

    public Student(String name, int age, double height, double weight, int grage, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grage;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String information(){

        String information = "이름 : " + name + " 나이 : " + getAge()
                            + " 신장 : " + getHeight() + " 몸무게 : " + getWeight()
                            + " 학년 : " + grade + " 전공 : " + major;
        return information;
    }
}
