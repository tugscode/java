public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.withDraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withDraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withDraw(100.0);
    }
}