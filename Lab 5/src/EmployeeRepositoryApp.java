import java.sql.SQLOutput;

public class EmployeeRepositoryApp{
    public static void main(String[] args){
        EmployeeRepository er1 = new EmployeeRepository();
        Employee e1 = new Employee("nigger","1");
        Employee e2 = new Employee("nigger","2");
        Employee e3 = new Employee("nigger","3");
        Employee e4 = new Employee("nigger","4");
        Employee e5 = new Employee("nigger","5");
        er1.addEmployee(e1);
        er1.addEmployee(e2);
        er1.addEmployee(e3);
        er1.addEmployee(e4);
        er1.addEmployee(e5);
        System.out.println("Employees are:");
        er1.displayEmployee();
        System.out.println("Employees after removal: ");
        er1.removeEmployee(e3);
        er1.removeEmployee(e4);
        er1.displayEmployee();



    }
}