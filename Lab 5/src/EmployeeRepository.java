import java.util.*;
public class EmployeeRepository {
    private HashSet<Employee> employeeSet;
    public EmployeeRepository(){
        employeeSet = new HashSet<Employee>();
    }
    public void addEmployee(Employee employee){
        employeeSet.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeeSet.remove(employee);
    }
    public void displayEmployee(){
        for(Employee employee: employeeSet){
            employee.printData();
        }
    }
}
