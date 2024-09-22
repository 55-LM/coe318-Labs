package coe318.lab4;

/**
 *
 * @author Alvi Alam
 */
public class Account {
    //Instance variables 
    private String name;
    private int num;
    private double bal;
    
    //Constructor
    public Account(String name, int number, double initialBalance){ 
        this.name = name;
        this.num = number;
        this.bal = initialBalance;
    }
    
    //Returns the name of the account owner
    public String getName(){
        return this.name;
    }
    
    //Returns the current account balance
    public double getBalance(){
        return this.bal;
    }
    
    //Returns the account number
    public int getNumber(){
        return this.num;
    }
    
    //Returns true if deposit was successful, and returns false when amount is negative or 0  
    public boolean deposit (double amount){
        if (amount > 0) { //Checking if amount is greater than zero
            this.bal = bal + amount; 
            return true;
        } else {
            return false;
        }
    }
    
    //Returns true if withdrawal was successful, and returns false when balance is not large enough, or if withdrawal amount is negative or 0  
    public boolean withdraw (double amount){
        if (amount > 0 && this.bal - amount >= 0){ //Checking if the amount itself is greater than zero, and if the difference of the balance and amount is greater than or equal to zero
            this.bal = bal - amount;
            return true;
        } else {
            return false;
        }
    }
   
    
@Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
} 
}
