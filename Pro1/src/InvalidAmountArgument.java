class InvalidAmountArgument extends Exception {
    public InvalidAmountArgument(double amount) {
        super("Invalid Amount Value " + amount + ". Amount can't be negative.");
    }
}
