package ru.voothi.lesson4.phw;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {

    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private final Integer id;


    private String fullName;
    private String position;
    private String telephone;
    private int salary;
    private int age;

    Employee (String fullName, String position, String telephone, int salary, int age) {
        id = idGenerator.getAndIncrement();

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

    public String getTelephone () {
        return this.telephone;
    }

    public int getSalary () {
        return this.salary;
    }

    public int getAge () {
        return this.age;
    }

    public void salaryIncrease (int amount) {
        this.salary += amount;
    }

    public int getId() {
        return id;
    }
}