class InsufficientBalance extends Exception {
    public InsufficientBalance(double currentBalance, double withdrawAmount) {
        super("Insufficient Balance. Current balance " + currentBalance + " is lower than the withdrawal amount " + withdrawAmount + ".");
    }
}
