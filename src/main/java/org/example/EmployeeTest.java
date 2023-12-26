package org.example;

public class EmployeeTest {
    public static void main(String[] args) {
        IKCompanyDepartment ikCompanyDepartment= new IKCompanyDepartment();

        ikCompanyDepartment.setEmployeeName("ADI TEST");
        ikCompanyDepartment.setEmployeeSurname("SOYADI TEST");
        ikCompanyDepartment.setEmployeeDepartment("DEPARTMANI TEEEST");
        ikCompanyDepartment.setEmployeeSalaryy(11000);

        System.out.println(ikCompanyDepartment.getEmployeeName() + " " + ikCompanyDepartment.getEmployeeSurname() + " "
                + ikCompanyDepartment.getEmployeeDepartment() + " " + ikCompanyDepartment.getEmployeeSalaryy());

        ikCompanyDepartment.employeeJob();
        ikCompanyDepartment.employeeRequests();

    }
}