class Employee {

    int id;
    String name;
    double basic;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
}

class Manager extends Employee {

    Manager(int id, String name, double basic) {
        super(id,name,basic);
    }

    void salary() {
        double total = basic + 5000;
        System.out.println("Total Salary = " + total);
    }

    public static void main(String[] args) {

        Manager m = new Manager(101,"Rahul",20000);

        m.salary();
    }
}
