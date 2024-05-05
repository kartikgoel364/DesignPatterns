package creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        System.out.println("<<<<-----------Using Builder Design Pattern----------->>>>");

        EmployeeWithBuilder employeeWithBuilder = new EmployeeWithBuilder.Builder()
                .withEmployeeName("Rohit Sharma")
                .withDepartment("Marketing")
                .withEmail("demo1@gmail.com")
                .withSalary(120.50)
                .withPhoneNumber("9999999999")
                .build();



        employeeWithBuilder.displayDetails();

        System.out.println("<<<<-----------Without Using Builder Design Pattern----------->>>>");

        EmployeeWithoutBuilder employeeWithoutBuilder = new EmployeeWithoutBuilder("Virat Kohli", "demo2@gmail.com", "Engineering", 200.90, "8999999999");
        employeeWithoutBuilder.displayDetails();

        System.out.println("<<<<----------Done---------->>>");
    }
}
