package example.Main;

import example.domain.Teacher;
import example.domain.School;

public class SchoolTest {
    //Associação pt 02 - Associação unidirecional um para muitos
    public static void main(String[] args) {
        Teacher teacher01 = new Teacher("João");
        Teacher teacher02 = new Teacher("Ana");
        Teacher teacher03 = new Teacher("Marcio");
        Teacher[] teachers = { teacher01, teacher02, teacher03 };

        School school = new School("Santa Clara", teachers);

        school.showAllTeachersInSchool();
    }

}
