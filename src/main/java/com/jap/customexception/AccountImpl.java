/*
 *Author Name: Nikita Chauhan
 *Date: 02-09-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.jap.customexception;

public class AccountImpl {
    public static void main(String[] args) {
        Account account = new Account(6500);
        try{
            account.withdraw(5700);
        }
        catch (InsufficientFundException exception){
            System.out.println(exception.getMessage());
        }
    }
}
