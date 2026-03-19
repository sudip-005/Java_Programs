class ThisMethod {
    void show(){ System.out.println("Hello"); }
    void call(){ this.show(); }
    public static void main(String[] args){
        new ThisMethod().call();
    }
}