package ru.voothi.lesson4.phw;

public class Employee {
    private String fullName;
    private String position;
    private int telephone;
    private int salary;
    private int age;

    Employee (String fullName, String position, int telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName () {
        return this.fullName;
    }

    public String getPosition () {
        return this.position;
    }

    public int getSalary () {
        return this.salary;
    }

    public int getTelephone () {
        return this.telephone;
    }

    public int getAge () {
        return this.age;
    }
}