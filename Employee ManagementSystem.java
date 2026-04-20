import java.util.*;
public class Main {
    static class Employee {
        int id;
        String name;
        String department;
        double salary;
        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        void display() {
            System.out.println(id + " | " + name + " | " + department + " | " + salary);
        }
    }
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: updateEmployee(); break;
                case 5: deleteEmployee(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice");
            }
        }
    }
    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        list.add(new Employee(id, name, dept, salary));
        System.out.println("Employee Added!");
    }
    static void viewEmployees() {
        if (list.isEmpty()) {
            System.out.println("No records found");
            return;
        }
        for (Employee e : list) {
            e.display();
        }
    }
    static void searchEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                e.display();
                return;
            }
        }
        System.out.println("Employee not found");
    }
    static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("Enter new name: ");
                e.name = sc.nextLine();
                System.out.print("Enter new department: ");
                e.department = sc.nextLine();
                System.out.print("Enter new salary: ");
                e.salary = sc.nextDouble();
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
