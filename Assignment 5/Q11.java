import java.util.*;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter ID: ");
        e.emp_id = sc.nextInt();

        System.out.print("Enter Name: ");
        e.emp_name = sc.next();

        System.out.print("Enter Basic Salary: ");
        e.basic_salary = sc.nextDouble();

        double gross_salary = e.basic_salary + (0.2 * e.basic_salary);

        System.out.println("Gross Salary = " + gross_salary);
    }
}
