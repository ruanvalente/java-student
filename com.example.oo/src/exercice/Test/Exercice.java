package exercice.Test;

import exercice.domain.Teacher;
import exercice.domain.Localization;
import exercice.domain.Seminary;
import exercice.domain.Student;

public class Exercice {
    public static void main(String[] args) {
        Localization localization = new Localization("Rua 13 de Maio");
        Student student = new Student("João", 23);
        Student student02 = new Student("Maria", 19);
        Student student03 = new Student("Ana", 20);

        Teacher teacher = new Teacher("Ricardo", "História");
        Student[] studentSeminary = { student, student02, student03 };

        Seminary seminary = new Seminary("História do Brasil", studentSeminary, localization);

        Seminary[] seminarsAvailable = { seminary };

        teacher.setSeminary(seminarsAvailable);

        teacher.outPut();

    }

}
