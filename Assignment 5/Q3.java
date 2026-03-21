class Parent {
    void show() {
        System.out.println("Parent Class Method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
