public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int refill = 1100;

        int totalaccountBalance;
        if (refill > 1000) {
            totalaccountBalance = (refill / 100 + accountBalance + refill);
        } else {
            totalaccountBalance = (accountBalance + refill);
        }
        System.out.println("Баланс Вашего счета: " + totalaccountBalance);
    }
}
