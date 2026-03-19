class ConsOverload {
    ConsOverload(){ System.out.println("Default"); }
    ConsOverload(int a){ System.out.println(a); }
    public static void main(String[] args){
        new ConsOverload();
        new ConsOverload(10);
    }
}