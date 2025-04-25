package day03.part06;

import day03.part06.hr.Employee;
import day03.part06.hr.Programmer;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Programmer> employees);

    void generateSalary(List<Programmer> employees);
}
