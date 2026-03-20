class LocalSuppress {
    int a;
    void set(int a){ this.a=a; }
    void show(){ System.out.println(a); }
    public static void main(String[] args){
        LocalSuppress obj=new LocalSuppress();
        obj.set(20);
        obj.show();
    }
}