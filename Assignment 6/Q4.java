interface A {
    void show();
}

interface B extends A {
    void display();
}

class Demo implements B {

    public void show() {
        System.out.println("Show Method");
    }

    public void display() {
        System.out.println("Display Method");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}
