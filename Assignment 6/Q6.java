class A {
    int x = 10;
}

class B extends A {

    void show() {
        System.out.println("Value of x = " + super.x);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
