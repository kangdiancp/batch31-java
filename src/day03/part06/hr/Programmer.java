package day03.part06.hr;

import day03.part05.Roles;
import day03.part06.ISalary;
import day03.part06.salary.Transportasi;

import java.time.LocalDate;

public class Programmer extends  Employee implements ISalary {

    private Transportasi transport;

    public Programmer(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Transportasi transport) {
        super(empId, fullName, hireDate, role, salary);
        this.transport = transport;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary()+ transport.getBensin()+ transport.getSpj()+ transport.getTransportasi());
    }
}
