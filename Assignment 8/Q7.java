class Demo {
    static void check() throws Exception {
        throw new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
