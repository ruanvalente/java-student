package example.Main;

import example.domain.Employee;

public class Heritage {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("João");
        employee.setAge(23);
        employee.setSalary(2400);

        System.out.println(employee.getSalary());
    }
}

