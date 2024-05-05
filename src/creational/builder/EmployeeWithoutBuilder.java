package creational.builder;

import java.util.UUID;

public class EmployeeWithoutBuilder {
    private String employeeId;
    private String employeeName;
    private String email;
    private String department;
    private Double salary;
    private String phoneNumber;

    EmployeeWithoutBuilder(String employeeName, String email, String department, Double salary, String phoneNumber) {
        this.employeeId = String.valueOf(UUID.randomUUID());
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayDetails() {
        System.out.println("EmployeeId :- " + getEmployeeId());
        System.out.println("EmployeeName :- " + getEmployeeName());
        System.out.println("EmployeeEmail :- " + getEmail());
        System.out.println("EmployeeDepartment :- " + getDepartment());
        System.out.println("EmployeeSalary :- " + getSalary());
        System.out.println("EmployeePhoneNumber :- " + getPhoneNumber());
    }

}
