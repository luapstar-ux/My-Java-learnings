public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
    }
}