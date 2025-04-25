package day03.part06;

import day03.part06.hr.Programmer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IEmployee empInf = new EmployeeImpl();

        var employees = empInf.initListEmployee();
        //generate salary
        empInf.generateSalary(employees);

        empInf.displayEmployees(employees);
    }
}
