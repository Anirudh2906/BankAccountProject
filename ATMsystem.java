public class ATMsystem {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Anirudh", 1234, 787895, 400);
        b1.axis();
        b1.deposit(500.0,1234);
        b1.withdraw(700,1234);
        b1.printbalance(1234);
        BankAccount b2 = new BankAccount("Revi",2929,756425,300);
        b2.axis();
        b2.deposit(100,2929);
        b2.withdraw(300,2929);
        b2.printbalance(2929);
        BankAccount b3 = new BankAccount("David",4545,453321,1500);
        b3.axis();
        b3.deposit(400,2233);
        b3.withdraw(200,4545);
        b3.printbalance(2323);
    }
}
