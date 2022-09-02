package com.jap.customexception;

public class Account {

    private final int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter


    public int getAccountBalance() {
        return accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     */
    public int withdraw(int amount) throws InsufficientFundException {
        if (getAccountBalance() < amount) {
            throw new InsufficientFundException("Insufficient funds");
        } else if (getAccountBalance() > amount) {
            return getAccountBalance() - amount;
        }
        return getAccountBalance();
    }

}
