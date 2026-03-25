class A {

    A(int x) {
        System.out.println("Parent Constructor: " + x);
    }
}

class B extends A {

    B() {
        super(10);
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
