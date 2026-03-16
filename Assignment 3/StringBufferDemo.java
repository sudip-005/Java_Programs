class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        sb.append(" Lab");
        System.out.println(sb);
        System.out.println("Length: "+sb.length());
        System.out.println("Capacity: "+sb.capacity());
        sb.insert(4," Programming");
        System.out.println(sb);
    }
}