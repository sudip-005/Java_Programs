class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        System.out.println("Count = " + count);
    }
}
