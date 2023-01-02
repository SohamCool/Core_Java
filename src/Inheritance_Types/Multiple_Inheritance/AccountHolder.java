package Inheritance_Types.Multiple_Inheritance;

import java.nio.file.FileSystemAlreadyExistsException;

public class AccountHolder implements SavingAccount, SalaryAccount {

    @Override
    public void showSalaryAccount() {
        System.out.println("Salary account details: ");
        System.out.println("Account ID: " + SalaryAccount.accID);
        System.out.println("Bank name: " + SalaryAccount.bankName);
    }

    @Override
    public void showSavingAccount() {
        System.out.println("Saving account details: ");
        System.out.println("Account ID: " + SavingAccount.accID);
        System.out.println("Bank name: " + SavingAccount.bankName);
    }

    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.showSavingAccount();
        accountHolder.showSalaryAccount();
    }
}
