class Parent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child1 extends Parent {
    void display() {
        System.out.println("Child1 Class");
    }
}

class Child2 extends Parent {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.show();
    }
}
