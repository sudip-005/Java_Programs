class Test {
    Test(ThisCons t){ System.out.println("Constructor called"); }
}
class ThisCons {
    ThisCons(){ new Test(this); }
    public static void main(String[] args){
        new ThisCons();
    }
}