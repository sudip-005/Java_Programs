class CallDemo {
    static void change(int x){ x=50; }
    static void changeArr(int[] a){ a[0]=50; }

    public static void main(String[] args) {
        int x=10; int[] a={10};
        change(x); changeArr(a);
        System.out.println(x+" "+a[0]);
    }
}