package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfEmployees {
    List<Employee> listOfEmployees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addNewEmployee(Employee employee) {
        listOfEmployees.add(employee);
        System.out.println("Employee added!");
        System.out.println("--------------");
    }

    public void removeEmployee() {
        System.out.print("Enter the id of the employee you want to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        int indexOfEmployee = -1;

        for (int i = 0; i < listOfEmployees.size(); i++) {
            Employee employee = listOfEmployees.get(i);
            if (employee.getId() == id) {
                indexOfEmployee = i;
            }
        }
        if (indexOfEmployee == -1) {
            System.out.println("Employee is not found!");
        } else {
            listOfEmployees.remove(indexOfEmployee);
            System.out.println("Employee removed!");
        }
        System.out.println("--------------");
    }

    public void showListOfEmployees() {
        if (listOfEmployees.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (Employee employee : listOfEmployees) {
                System.out.println(employee);
            }
        }
        System.out.println("--------------");
    }

    public void writeEmployeeToFile() {
        try {
            for (Employee employee : listOfEmployees) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("employees.txt", true));
                bw.write(employee + "\n");
                bw.close();
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    public void readEmployeeFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
