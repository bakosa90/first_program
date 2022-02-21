package com.company;

import java.util.Scanner;

public class Employee {

    private int id;
    private static int nextId = 1;
    private String surname;
    private String name;
    private String specialization;
    private String position;
    private int age;
    private String maritalStatus;
    private double currentExperience;

    public Employee() {

    }

    public Employee(String surname, String name, String specialization, String position, int age, String maritalStatus,
                    double currentExperience) {
        this.surname = surname;
        this.name = name;
        this.id = nextId;
        nextId++;
        this.specialization = specialization;
        this.position = position;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.currentExperience = currentExperience;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public double getCurrentExperience() {
        return currentExperience;
    }

    @Override
    public String toString() {
        return "id=" + id + ", surname=" + surname + ", name=" + name +
                ", specialization=" + specialization + ", position=" + position + ", age=" + age +
                ", maritalStatus=" + maritalStatus + ", currentExperience=" + currentExperience + "\n";
    }

    public static Employee addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname of employee: ");
        String surname = scanner.nextLine();

        System.out.print("Enter name of employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter specialization of employee (engineer or manager): ");
        String specialization = scanner.nextLine();

        System.out.print("Enter position of employee: ");
        String position = scanner.nextLine();

        System.out.print("Enter age of employee: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter marital status of employee: ");
        String maritalStatus = scanner.nextLine();

        System.out.print("Enter current experience of employee: ");
        double currentExperience = Double.parseDouble(scanner.nextLine());
        return new Employee(surname, name, specialization, position, age, maritalStatus, currentExperience);
    }
}
