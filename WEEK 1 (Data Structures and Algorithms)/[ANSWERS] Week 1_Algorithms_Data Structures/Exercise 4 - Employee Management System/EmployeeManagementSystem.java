import java.util.Scanner;

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

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

public class EmployeeManagementSystem {
    private static Employee[] employees = new Employee[100];
    private static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add an Employee data");
            System.out.println("2. Search an Employee data");
            System.out.println("3. Display Employees data list");
            System.out.println("4. Delete an Employee data");
            System.out.println("5. Exit");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    searchEmployee();
                    break;
                case 3:
                    displayAllEmployees();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please try again.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        System.out.print("Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee Position: ");
        String position = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 

        employees[count++] = new Employee(employeeId, name, position, salary);
        System.out.println("Employee data added successfully.");
    }

    private static void searchEmployee() {
        System.out.print("Employee ID you want to search: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Not found.");
    }

    private static void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                employees[i] = employees[count - 1];
                employees[count - 1] = null;
                count--;
                System.out.println("Deleted successfully.");
                return;
            }
        }
        System.out.println("Not found.");
    }
}

/*
TIME COMPLEXITY:

1. Add Employee

This operation is performed in constant time O(1).

2. Search Employee

The search operation involves iterating through the array to find the employee with the specified ID
In the worst case, the employee might be at the end of the array or not present at all, requiring a complete traversal of the array.
Therefore Time Complexity : O(n)

3. Display All Employees

The traversal operation involves iterating through the entire array to display each employee.
The time complexity is O(n), where n is the number of employees.

4. Delete Employee

The deletion operation involves finding the employee with the specified ID, which is O(n) in the worst case.
Once found, the employee is removed by replacing it with the last employee in the array and decrementing the count.
Therefore, overall time complexity: O(n)

LIMITATIONS OF ARRAYS:

- Arrays have a fixed size defined at the time of their creation. Once the size is set, it cannot be changed.
- If the number of elements exceeds the array's capacity, you need to create a new larger array and copy the elements over, which is inefficient.
- Memory consumption can be higher than necessary.
- Inserting or deleting elements, especially in the middle of the array, requires shifting elements, which can be time-consuming.

WHEN TO USE ARRAYS:

- When the number of elements is known beforehand and does not change.
- When you need fast access to elements via indexing
- When memory overhead needs to be minimized.
- When dealing with a collection of elements of the same type.
- When you need a straightforward and easy-to-implement data structure.

*/