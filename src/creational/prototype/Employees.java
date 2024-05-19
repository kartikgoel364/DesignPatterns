package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeesList;

    public Employees(){
        employeesList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.employeesList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        employeesList.add("Pankaj");
        employeesList.add("Raj");
        employeesList.add("David");
        employeesList.add("Lisa");
    }

    public List<String> getEmployeesList() {
        return employeesList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>(this.getEmployeesList());
        return new Employees(temp);
    }
}
