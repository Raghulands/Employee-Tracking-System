package servlet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
    @Id
    private int empId;

    private String empName;
    private String designation;
    private double empSalary;

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public double getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }
}