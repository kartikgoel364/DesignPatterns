package creational.builder;

import java.util.UUID;

public class EmployeeWithBuilder {
    private final String employeeId ;
    private String employeeName;
    private String email;
    private String department;
    private Double salary;
    private String phoneNumber;

    EmployeeWithBuilder(Builder builder) {
        this.employeeId = String.valueOf(UUID.randomUUID());
        this.employeeName = builder.employeeName;
        this.email = builder.email;
        this.department = builder.department;
        this.salary = builder.salary;
        this.phoneNumber = builder.phoneNumber;
    }

    public void displayDetails() {
        System.out.println("EmployeeId :- " + employeeId);
        System.out.println("EmployeeName :- " + employeeName);
        System.out.println("EmployeeEmail :- " + email);
        System.out.println("EmployeeDepartment :- " + department);
        System.out.println("EmployeeSalary :- " + salary);
        System.out.println("EmployeePhoneNumber :- " + phoneNumber);
    }

    // Static Builder Class
    public static class Builder {
        private String employeeName;
        private String email;
        private String department;
        private Double salary;
        private String phoneNumber;

        public Builder withEmployeeName(String employeeName) {
          this.employeeName = employeeName;
          return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder withSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeWithBuilder build() {
          return new EmployeeWithBuilder(this);
        }
    }
}
