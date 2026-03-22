class A {
    final void show() {
        System.out.println("Final Method");
    }
}

class B extends A {
    public static void main(String[] args) {
        new B().show();
    }
}
