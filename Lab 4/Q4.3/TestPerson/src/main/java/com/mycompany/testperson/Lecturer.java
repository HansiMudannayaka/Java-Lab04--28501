package com.mycompany.testperson;
class Lecturer extends Person {
    private String LecProgramme;

    public Lecturer(String LecName, int LecId, String LecProgramme) {
        super(LecName, LecId);
        this.LecProgramme = LecProgramme;
    }

    public void setProgramme(String programme) {
        this.LecProgramme = LecProgramme;
    }

    public String getProgramme() {
        return LecProgramme;
    }
}
