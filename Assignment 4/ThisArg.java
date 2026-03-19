class ThisArg {
    void show(ThisArg obj){ System.out.println("Method called"); }
    void call(){ show(this); }
    public static void main(String[] args){
        new ThisArg().call();
    }
}