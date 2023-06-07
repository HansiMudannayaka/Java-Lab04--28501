package com.mycompany.testemp;
public class TestEmp {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.setEmpID(1);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Manager");

        Employee bird = new Employee();
        bird.setEmpID(2);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Software Engineer");

        System.out.println("Details of the Employee:");
        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Details of the Employee:");
        System.out.println("Employee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
}
