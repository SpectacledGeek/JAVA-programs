/*A program to simulate a simple banking system in which the initial balance and rate of
 interest are read from the keyboard and these values are initialised using the constructor
  member function. The program consists of the following methods:
    -To initialise the balance amount and the rate of interest using constructor member function
    -To make deposit
    -To withdraw an amount for the balance
    -To find compound interest based on the rate of interest
    -To know the balance amount
    -To display the menu options
*/
//Importing required classes
import java.lang.Math;
import java.util.Scanner;
//Creating Main class
public class Bank { 
    public static void main(String[] args){
//Taking input from the user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the account balance: ");
        int b= sc.nextInt();
        System.out.println("Enter the intrest: ");
        int i= sc.nextInt();
//Creating a object of "information" class
        information acc= new information(b,i);
//Calling the menue function 
        acc.menue();
        sc.close();
    }
}

class information{
    Scanner sc= new Scanner(System.in);
    int balance;
    int intrest;
//Setting the balance and intrest
    public information(int x,int y)
    {
        balance=x;
        intrest=y;
    }
//Switch case for menue options
    public void menue()
    {
        System.out.println("Welcome to Our Bank!!!");
        System.out.println("Enter 1 for Viewing your Current balance.");
        System.out.println("Enter 2 for Depositing Money.");
        System.out.println("Enter 3 for Withdrawing Money.");
        System.out.println("Enter 4 for Calculating Compound intrest.");
        int a= sc.nextInt();
        int z;
            switch(a)
            {
                //View Balance
                case 1:
                    view();
                    break;

                //Deposit
                case 2:
                    deposit();
                    break;

                //Withdrawal
                case 3:
                    withdraw();
                    break;

                //Coumpound Intrest
                case 4:
                    System.out.println("Enter the Period for Intrest and its frequency: ");
                    int t=sc.nextInt();
                    int f= sc.nextInt();
                    compound_intrest(t, f);
                    break;

                default:
                    System.out.println("Enter a valid number.");
            }
//Recalling the switch case for further operations
            System.out.print("Enter 1 to manage your account: ");
            z= sc.nextInt();
            if (z==1) menue();
            else System.out.println("Thank you!!!");
    }
//Deposition methord
    public void deposit()
    {
        int d;
        System.out.println("Enter the amount to be deposited: ");
        d= sc.nextInt();
        balance+=d;
    }
//Withdrawal Methord
    public void withdraw()
    {
        int d;
        System.out.println("Enter the amount to be withdrawed: ");
        d= sc.nextInt();
        if(balance>=d)
        balance-=d;
        else
        System.out.println("Insuffficient funds.");
    }
//Methord to see current account balance
    public void view()
    {
        System.out.println("Your current acc balance is: " + balance );
    }
//calculate intrest amount on current account balance  
    public void compound_intrest(int t,int n)
    {
        double r = intrest/100.0;
        double a = (1+(r/n));
        double p = Math.pow(a,(n*t));
        double c = balance*p-balance;
        System.out.printf("The Compound intrest on your current balance for %d Years is %.2f\n" ,t,c);
    }

}
