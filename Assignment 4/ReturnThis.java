class ReturnThis {
    ReturnThis get(){ return this; }
    void show(){ System.out.println("Returned"); }
    public static void main(String[] args){
        new ReturnThis().get().show();
    }
}