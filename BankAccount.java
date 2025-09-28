public class BankAccount {
    private String name;
    private int pin;
    private long accountNumber;
    private double balance;

    public void axis() {
        System.out.println("*** WELCOME TO AXIS BANK ****");
    }

    public BankAccount(String bname, int bpin, long baccountNumber, double bblance) {
        name = bname;
        pin = bpin;
        accountNumber = baccountNumber;
        balance = bblance;
    }
    public void deposit(double amount, int pinentered) {
        if (pinentered == pin) {
            if (amount > 0) {
                balance = amount + balance;
                System.out.println("Your current balance after depositing is : " + balance);
            }
        } else {
            System.out.println("INVALID PIN ");
        }
    }

    public void withdraw(double amount, int pinentered) {
        if (pinentered == pin) {
            if (amount > 0) {
                if (balance - amount >= 500) {
                    balance = balance - amount;
                    System.out.println("Your current balance after withdrawing is : " + balance);
                } else {
                    System.out.println("Cannot withdraw !! minimum balance of 500 must be maintained ");
                }
            } else {
                System.out.println("INVALID AMOUNT");
            }
        } else {
            System.out.println("INVALID PIN");
        }
    }
        public void printbalance ( int enteredpin){
            if (enteredpin == pin) {
                System.out.println("Your current balance is  : " + balance);
            } else {
                System.out.println("INVALID PIN");
            }
        }
}
