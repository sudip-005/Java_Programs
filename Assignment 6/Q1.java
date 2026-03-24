abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
