package creational.prototype;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();
        System.out.println("Employees List :- " + employees.getEmployeesList());

        Employees employeesClone = (Employees) employees.clone();
        System.out.println("Clone Employees List :- " + employeesClone.getEmployeesList());
    }
}
