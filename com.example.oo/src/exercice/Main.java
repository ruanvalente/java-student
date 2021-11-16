package exercice;

import exercice.domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();

        employee.setName("John");
        employee.setAge(26);
        employee.setSalary(3099.14, 1200, 1800.50);

        employee2.setName("Hana");
        employee2.setAge(29);
        employee2.setSalary(2400, 1500, 1000);

        employee.showEmployeeDetails();
        employee2.showEmployeeDetails();

        double employeeGetSalaryResult = employee.mediaSalary(employee.getSalary());
        double employee2GetSalaryResult = employee.mediaSalary(employee2.getSalary());

        System.out.println(String.format("%.2f", employeeGetSalaryResult));
        System.out.println(String.format("%.2f", employee2GetSalaryResult));
    }
}
 