class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
