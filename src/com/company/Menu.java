package com.company;

import java.util.Scanner;

public class Menu {
    ListOfEmployees employees = new ListOfEmployees();
    Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        while (true) {
            int numMenu;
            do {
                System.out.println("=Employee base=");
                System.out.println("1 - Add new employee.");
                System.out.println("2 - Show the list of employees.");
                System.out.println("3 - Remove an employee.");
                System.out.println("4 - Load saved list of employees");
                System.out.println("0 - Save and Exit.");
                System.out.print("Enter your choice (0-4): ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Try again!");
                    scanner.next();
                }
                numMenu = scanner.nextInt();
                switch (numMenu) {
                    case 1:
                        employees.addNewEmployee(Employee.addNewEmployee());
                        break;
                    case 2:
                        employees.showListOfEmployees();
                        break;
                    case 3:
                        employees.showListOfEmployees();
                        employees.removeEmployee();
                        break;
                    case 4:
                        employees.readEmployeeFromFile();
                        break;
                    case 0:
                        employees.writeEmployeeToFile();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Your choice is not in range (0-4), try again!");
                }
            } while (numMenu < 0 || numMenu > 4);
        }
    }
}
