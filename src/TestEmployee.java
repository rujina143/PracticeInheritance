
public class TestEmployee {
    public static void main(String[] args) {

        Employee1 emp = new Employee1("John Doe", 50000);
        System.out.println(emp);


        Manager1 manager = new Manager1("Jane Smith", 60000, "IT");
        System.out.println(manager);


        Executive exec = new Executive("Alice Johnson", 80000, "Finance");
        System.out.println(exec);
    }
}
