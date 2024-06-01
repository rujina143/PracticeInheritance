public class BasicAccount extends BankAccount {

    public BasicAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= getBalance()) {
            return super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}