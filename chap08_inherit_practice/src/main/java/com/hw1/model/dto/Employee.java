package com.hw1.model.dto;

public class Employee extends Person{
    private int salary;
    private String dept;
    public static int count = 0;

    public Employee() {
    }

    public Employee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        count++;
    }

    public String information() {
        return "이름 : " + name +
                " 나이 : " + getAge() +
                " 키 : " + getHeight() +
                " 몸무게 : " + getWeight() +
                " 급여 : " + salary +
                " 부서 : " + dept;
    }
}
