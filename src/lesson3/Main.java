package lesson3;

/**
 * Created by Student09 on 10.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.accountNumber);

        myAccount.setBalance(50.4d);
        System.out.println("Balance = " + myAccount.balance);

        myAccount.setBalance(49.3d);
        System.out.println("New balance = " + myAccount.balance);

//        double doubleBalance = myAccount.getDoubleBalance();
//        System.out.println("Double balance = " + doubleBalance);
        System.out.println("Double balance = " + myAccount.getDoubleBalance());
        System.out.println("Current balance = " + myAccount.balance);

        System.out.println();
        System.out.println("*** Method signature ***");
        myAccount.setValue(30d);
        System.out.println("Rubles = " + myAccount.rubles + ", penny = " + myAccount.penny);

        myAccount.setValue(23d, 51d);
        System.out.println("Rubles = " + myAccount.rubles + ", penny = " + myAccount.penny);

    }

}
