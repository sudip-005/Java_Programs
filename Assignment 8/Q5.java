class Demo {
    public static void main(String[] args) {
        try {
            try {
                int a = 10/0;
            } catch(Exception e) {
                System.out.println("Inner Catch");
            }
        } catch(Exception e) {
            System.out.println("Outer Catch");
        }
    }
}
