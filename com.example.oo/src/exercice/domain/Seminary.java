package exercice.domain;

public class Seminary {
    private String title;
    private Student[] student;
    private Localization localization;

    public Seminary() {
    }

    public Seminary(String title) {
        this.title = title;
    }

    public Seminary(String title, Student[] student) {
        this.title = title;
        this.student = student;
    }

    public Seminary(String title, Student[] student, Localization localization) {
        this.title = title;
        this.student = student;
        this.localization = localization;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return this.student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Localization getLocalization() {
        return this.localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

}
