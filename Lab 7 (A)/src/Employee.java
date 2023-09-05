public class Employee {
    private int id;
    private String name;
    private String post;
    private int salary;
    static int w_emp;   //Working Employee

    public Employee(int id, String name, String post, int salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
        w_emp = ++w_emp;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    public static int getW_emp() {
        return w_emp;
    }

    public static void getTotalEmployees() {
        System.out.println(Employee.getW_emp());

    }


    public void showInfo() {
        System.out.print(id);
        System.out.print("   " + name);
        System.out.print("   " + post);
        System.out.println("   " + salary);

    }
}

