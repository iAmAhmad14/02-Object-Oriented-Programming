import java.io.FilterOutputStream;

public class Employee {
    String firstName;
    String lastName;
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void printData(){
        System.out.println(firstName+" "+lastName);
    }
}
