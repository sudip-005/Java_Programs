interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A,B {

    public void show() {
        System.out.println("Method of Interface A");
    }

    public void display() {
        System.out.println("Method of Interface B");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}
