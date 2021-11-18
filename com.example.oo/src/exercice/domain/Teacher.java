package exercice.domain;

import java.util.Objects;

public class Teacher {
    private String name;
    private String specialization;
    private Seminary[] seminarys;

    public Teacher() {
    }

    public Teacher(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Teacher(String name, String specialization, Seminary[] seminarys) {
        this.name = name;
        this.specialization = specialization;
        this.seminarys = seminarys;
    }

    public void outPut() {
        System.out.println("-------");
        System.out.println("Professor: " + this.name);

        if (Objects.isNull(this.seminarys)) {
            return;
        }

        System.out.println("---- Seminários Cadastrados ------");

        for (Seminary seminary : seminarys) {
            System.out.println("Título: " + seminary.getTitle());
            System.out.println("Endereço: " + seminary.getLocalization().getAddress());

            if (Objects.isNull(seminary.getStudent()) || Objects.isNull(seminary.getStudent().length == 0)) {
                continue;
            }

            System.out.println("---- Alunos ----");

            for (Student student : seminary.getStudent()) {
                System.out.println("Nome: " + student.getName() + "\nidade: " + student.getAge());
                System.out.println("--------------");
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Seminary[] getSeminary() {
        return this.seminarys;
    }

    public void setSeminary(Seminary[] seminarys) {
        this.seminarys = seminarys;
    }

}
