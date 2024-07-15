/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author Mohamed Khedr
 */
public class Account {
    private String name;
    private double balance;
    private int number;
    
    public Account ( String nme, int num, double bala) {
        name = nme;
        balance = bala;
        number = num;
    }
  
    String getName()
    {return name;}
double getBalance()
{return balance;}
int getNumber()
{
    return number;
}
boolean deposit(double amount)
{
    if (amount<=0)
    {
//System.out.println("Error: Deposit amount cannot be 0 or negative");
        return false;
    }
    else{
    balance = balance + amount;    
    return true;
    }

}
boolean withdraw(double amount)
{
   if (amount<=0 || amount> balance)
    {
       /* if(amount<=0 )
        { System.out.println("Error: Withdraw amount cannot be 0 or negative");}
        else {System.out.println("Error: Withdraw amount cannot be greater than the current balance");}
*/
    return false;
    }
    else{
    balance = balance - amount;    
    return true;
    }
}
    
    
@Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}
}
