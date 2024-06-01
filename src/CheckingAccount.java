
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CheckingAccount extends BankAccount {
    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;

    private Map<Integer, Integer> overdraftsByMonth;

    public CheckingAccount(double balance) {
        super(balance);
        overdraftsByMonth = new HashMap<>();
    }

    @Override
    public boolean withdraw(double amount) {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();

        if (amount <= getBalance()) {
            return super.withdraw(amount);
        } else {
            if (overdraftsByMonth.containsKey(currentMonth)) {
                int overdraftCount = overdraftsByMonth.get(currentMonth);
                double penalty = (overdraftCount == 0) ? FIRST_OVERDRAFT_PENALTY : SUBSEQUENT_OVERDRAFT_PENALTY;
                System.out.println("Withdrawal amount exceeds balance. Overdraft penalty applied: $" + penalty);
                super.withdraw(penalty);
                overdraftsByMonth.put(currentMonth, overdraftCount + 1);
            } else {
                System.out.println("Withdrawal amount exceeds balance. First overdraft of the month. Overdraft penalty applied: $" + FIRST_OVERDRAFT_PENALTY);
                super.withdraw(FIRST_OVERDRAFT_PENALTY);
                overdraftsByMonth.put(currentMonth, 1);
            }
            return false;
        }
    }
}

