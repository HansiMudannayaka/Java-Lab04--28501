package com.mycompany.testperson;
class Student extends Person {
    private String Stcourse;

    public Student(String Stname, int Stid, String Stcourse) {
        super(Stname, Stid);
        this.Stcourse = Stcourse;
    }

    public void setCourse(String Stcourse) {
        this.Stcourse = Stcourse;
    }

    public String getCourse() {
        return Stcourse;
    }
}