class A {
    A() {
        System.out.println("Parent Constructor");
    }
}

class B extends A {
    B() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
