
package com.mycompany.testperson;
public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("Nick Colby", 12543, "Mathematics");
        student.setID(44456); 
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        System.out.println();

        Lecturer lecturer = new Lecturer("Jane Miky", 73489, "Biology");
        lecturer.setProgramme("Chemistry"); 
        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}