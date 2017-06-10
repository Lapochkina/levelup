package lesson3;

/**
 * Created by Student09 on 10.06.2017.
 */
public class BankAccount {

    long accountNumber;
    double balance;

    double rubles;
    double penny;

    BankAccount() {
        System.out.println("Constructor executed...");
        accountNumber = 10L;
        balance = 20.9d;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    double getDoubleBalance() {
        // balance = balance * 2;
        // double doubleBalance = balance * 2;
        // return doubleBalance;
        return balance * 2;
    }

    void setValue(double newRubles) {
        setValue(newRubles, 0.0d);
    }

    void setValue(double newRubles, double newPenny) {
        rubles = newRubles;
        penny = newPenny;
    }

}
