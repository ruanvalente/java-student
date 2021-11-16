package exercice.domain;

import java.util.Objects;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public Employee() {
    }

    public Employee(String name, int age, double[] salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double[] getSalary() {
        return this.salary;
    }

    public void setSalary(double... salary) {
        this.salary = salary;
    }

    public void showEmployeeDetails(Employee employee) {
        System.out.println("{Name: " + employee.getName() + " Age: " + employee.getAge() + " Salary: "
                + String.format("%.2f", employee.mediaSalary(employee.getSalary())) + "}");
    }

    public double mediaSalary(double... salary) {
        if (salary != null) {
            double newSalary = 0;
            for (double salaryValue : salary) {
                newSalary += salaryValue;
            }
            newSalary /= salary.length;

            return newSalary;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && age == employee.age && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + ", salary='" + getSalary() + "'" + "}";
    }

}
