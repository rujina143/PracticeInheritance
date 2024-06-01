
public class BasicAccount1 extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccount1(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= getBalance()) {
            return super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds balance. Overdraft penalty applied.");
            super.withdraw(OVERDRAFT_PENALTY);
            return false;
        }
    }
}

