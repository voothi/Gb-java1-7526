package ru.voothi.lesson4.phw;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("FistName1 SecondName1 PatronymicName1", "Developer1", "9160010101", 1001, 31);
        Employee employee2 = new Employee("FistName2 SecondName2 PatronymicName2", "Developer2", "9160010102", 1002, 32);
        Employee employee3 = new Employee("FistName3 SecondName3 PatronymicName3", "Developer3", "9160010103", 1003, 43);
        Employee employee4 = new Employee("FistName4 SecondName4 PatronymicName4", "Developer4", "9160010104", 1004, 54);
        Employee employee5 = new Employee("FistName5 SecondName5 PatronymicName5", "Developer5", "9160010105", 1005, 55);

        System.out.println("~~~ Ex 4 ~~~");

        System.out.println(employee1.getFullName());
        System.out.println(employee1.getPosition());

        System.out.println("~~~ Ex 5 ~~~");

        Employee[] employeeArr1 = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employeeArr1.length; i++) {
            if (employeeArr1[i].getAge() > 40) {
                System.out.println(employeeArr1[i].getFullName());
                System.out.println(employeeArr1[i].getAge());
                System.out.println(employeeArr1[i].getPosition());
            }
        }

        System.out.println("~~~ Ex 6 ~~~");

        for (int i = 0; i < employeeArr1.length; i++) {
            if (employeeArr1[i].getAge() > 45) {
                System.out.println(employeeArr1[i].getFullName());
                System.out.println(employeeArr1[i].getSalary());
                employeeArr1[i].salaryIncrease(5000);
                System.out.println(employeeArr1[i].getSalary());
            }
        }
    }
}
