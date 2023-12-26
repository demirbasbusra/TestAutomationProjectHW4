package org.example;

public class IKCompanyDepartment {
    private String employeeName;
    private String employeeSurname;
    private String employeeDepartment;
    private int employeeSalaryy;

    public void employeeJob(){
        setEmployeeName("Büşra");
        setEmployeeSurname("Demirbaş");
        setEmployeeDepartment("Quality Assurance Department");
        setEmployeeSalaryy(5000);
        System.out.println(getEmployeeName() + " " + getEmployeeSurname() + " " + getEmployeeDepartment() + " " + getEmployeeSalaryy());
    }

    public void employeeRequests(){
        System.out.println("DÜZGÜN ZAM ORANLARI BEKLERİZ!!!!!!!!!!");
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeSalaryy() {
        return employeeSalaryy;
    }

    public void setEmployeeSalaryy(int employeeSalaryy) {
        this.employeeSalaryy = employeeSalaryy;
    }
}
