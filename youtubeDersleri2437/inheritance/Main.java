package youtubeDersleri2437.inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.id = 2;
        Employee employee = new Employee();
        employee.id = 1;

        System.out.println(employee.id);
        System.out.println(customer.id);

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        employeeManager.Add();
    }
}
