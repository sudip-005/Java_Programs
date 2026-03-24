interface Test {
    void show();
}

class Demo implements Test {

    public void show() {
        System.out.println("Interface Method Implemented");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
