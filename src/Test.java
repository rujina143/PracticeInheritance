
public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 50000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Base Salary: $" + employee.getSalary());


        Manager manager = new Manager("Jane Smith", 60000, 10000);
        System.out.println("\nManager Name: " + manager.getName());
        System.out.println("Manager Base Salary: $" + manager.getBaseSalary());
        System.out.println("Manager Bonus: $" + manager.getBonus());
        System.out.println("Manager Total Salary: $" + manager.getSalary());
    }
}

