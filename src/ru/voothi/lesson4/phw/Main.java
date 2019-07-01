package ru.voothi.lesson4.phw;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mishin Misha Michailovich", "Developer", "9160010101", 1000, 30);
        System.out.println(employee1.getFullName());
        System.out.println(employee1.getPosition());
    }
}
