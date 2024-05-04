class Account {
    private String name;
    private double balance;

    // Constructor initializes the account name and sets the initial balance to 0
    public Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) throws InvalidAmountArgument {
        if (amount < 0) {
            throw new InvalidAmountArgument(amount);
        }
        balance += amount;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) throws InsufficientBalance, InvalidAmountArgument {
        if (amount < 0) {
            throw new InvalidAmountArgument(amount);
        }
        if (amount > balance) {
            throw new InsufficientBalance(balance, amount);
        }
        balance -= amount;
    }

    // Getters for name and balance
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
