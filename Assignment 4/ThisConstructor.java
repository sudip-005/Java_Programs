class ThisConstructor {
    ThisConstructor(){ this(10); }
    ThisConstructor(int a){ System.out.println(a); }
    public static void main(String[] args){
        new ThisConstructor();
    }
}