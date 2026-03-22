class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    int r;

    Circle(int x, int y, int r) {
        p = new Point(x, y);
        this.r = r;
    }

    void area() {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(2,3,5);
        c.area();
    }
}
