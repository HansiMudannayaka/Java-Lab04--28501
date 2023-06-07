package com.mycompany.testperson;
class Person {
    private String pname;
    private int pid;

    public Person(String pname, int pid) {
        this.pname = pname;
        this.pid = pid;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public String getName() {
        return pname;
    }

    public void setID(int pid) {
        this.pid = pid;
    }

    public int getID() {
        return pid;
    }
}
