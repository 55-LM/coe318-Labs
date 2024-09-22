/**
 *
 * @author Alvi Alam
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;  //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }

    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) { //Envokes boolean method by checking if the account number is already present within the system
        for(int x = 0; x < numAccounts; x++){ //For loop runs through every index of the accounts array and ends when it has reached the max number of numAccounts available
            if(accounts[x].getNumber() == accountNumber){
                return true;
            }
        }
        return false; //Fix this 
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        if(hasAccountNumber(account.getNumber())){ //Invokes the previous boolean method by checking if the account number is already present within the system and if it is the return is false and a new account won't be added
            return false;
        } else {
            accounts[numAccounts] = account; //Adds the account if it was not already present
            numAccounts++;
        }
        return true; //Fix this
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}

