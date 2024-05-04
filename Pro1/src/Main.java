//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account("John Doe");

        try {
            account.deposit(500);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            // This will throw an InsufficientBalance exception
            account.withdraw(400);
        } catch (InsufficientBalance | InvalidAmountArgument e) {
            System.out.println(e.getMessage());
        }

        try {
            // This will throw an InvalidAmountArgument exception
            account.deposit(-100);
        } catch (InvalidAmountArgument e) {
            System.out.println(e.getMessage());
        }
    }
}
