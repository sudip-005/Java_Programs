class Employee {
    int id = 101;
    String name = "Rahul";
}
class Department extends Employee {
    String deptName = "IT";
    int deptCode = 10;
}
class Salary extends Department {
    double basic = 20000;
    double allowance = 5000;
    void display() {
        double total = basic + allowance;
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Total Salary: " + total);
    }
    public static void main(String[] args) {
        Salary s = new Salary();
        s.display();
    }
}
