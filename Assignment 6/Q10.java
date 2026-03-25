abstract class Accounts {

    double balance = 1000;

    abstract void withdraw(double x);
    abstract void deposit(double x);

    void display() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends Accounts {

    double rateOfInterest = 5;

    void withdraw(double x) {
        balance = balance - x;
    }

    void deposit(double x) {
        balance = balance + x;
    }

    void calculateAmount() {
        balance = balance + (balance * rateOfInterest / 100);
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}
