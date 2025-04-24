package day03.part03;

import java.time.LocalDate;

public class Programmer extends Employee{
    private double transportasi;

    public Programmer(String fullName, LocalDate hireDate, double salary, double transportasi) {
        super(fullName, hireDate, "PROGRAMMER", salary);
        this.transportasi = transportasi;
        setTotalSalary(salary+transportasi);
        setFullName("Kang");
    }

    public double getTransportasi() {
        return transportasi;
    }

    public void setTransportasi(double transportasi) {
        this.transportasi = transportasi;
        super.setTotalSalary(this.getSalary()+transportasi);
    }

    /*overloading */
    public double getTunjangan(double transportasi){
        return transportasi;
    }

    public double getTunjangan(double transportasi,LocalDate hireDate){
        return transportasi;
    }

    public LocalDate getTunjangan(LocalDate hireDate){
        return hireDate;
    }

    @Override
    public void setTotalSalary(double totalSalary) {
        super.setTotalSalary(totalSalary);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", transportasi "+transportasi;
    }
}
