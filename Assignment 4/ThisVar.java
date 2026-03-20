class ThisVar {
    int x;
    ThisVar(int x){ this.x=x; }
    void show(){ System.out.println(x); }
    public static void main(String[] args){
        new ThisVar(10).show();
    }
}