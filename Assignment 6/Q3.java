interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Class B Method");
    }
}

class C extends B {

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
