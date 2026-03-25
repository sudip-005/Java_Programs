class Vehicle {

    String regNo = "WB01A1234";
    String brand = "Toyota";
}

class Engine extends Vehicle {

    int capacity = 1500;
}

class Car extends Engine {

    int distance = 300;
    int fuel = 20;

    void display() {

        int mileage = distance / fuel;

        System.out.println("Registration No: " + regNo);
        System.out.println("Brand: " + brand);
        System.out.println("Engine Capacity: " + capacity);
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.display();
    }
}
