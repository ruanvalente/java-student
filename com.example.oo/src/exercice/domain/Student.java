package exercice.domain;

public class Student {
    private String name;
    private int age;
    private Seminary seminary;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminary seminary) {
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminary getSeminary() {
        return this.seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }

}
