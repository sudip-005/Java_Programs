final class A {
    void show() {
        System.out.println("Final Class");
    }
}

class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
