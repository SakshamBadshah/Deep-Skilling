class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add employee
    public static void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search employee by ID
    public static Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse employees
    public static void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].displayEmployee();
        }
    }

    // Delete employee by ID
    public static void deleteEmployee(int employeeId) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee deleted successfully.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Naman", "Java Developer", 45000));
        addEmployee(new Employee(102, "Rahul", "Tester", 35000));
        addEmployee(new Employee(103, "Priya", "HR Manager", 50000));
        addEmployee(new Employee(104, "Amit", "Full Stack Developer", 60000));

        System.out.println("\nAll Employees:");
        displayAllEmployees();

        System.out.println("\nSearching Employee ID 103:");
        Employee found = searchEmployee(103);

        if (found != null) {
            found.displayEmployee();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee ID 102:");
        deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        displayAllEmployees();
    }
}