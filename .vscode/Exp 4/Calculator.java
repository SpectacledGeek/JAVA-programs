//Importing required java classes
import java.util.*;
//Main class
public class Calculator{
	public static void main(String[] args){
		int b=0;
		int s=0;
		int temp=0;
		Scanner sc=new  Scanner(System.in);
//Creating a object of the operation class
		operations op= new operations();
//Displaying menue options
		do
		{
        System.out.println("Enter a number");
        int p=sc.nextInt();
        System.out.println("Enter another number");
        int q=sc.nextInt();
//Sorting the Input numbers to larger and smaller
		if(p>q)
		{
			b=p;
			s=q;
		}
		else
		{
			b=q;
			s=p;
		}
		System.out.println("Press 1 to add the 2 numbers");
		System.out.println("Press 2 to subtract the 2 numbers");
		System.out.println("Press 3 to multiply the 2 numbers");
		System.out.println("Press 4 to Divide the 2 numbers");
		System.out.println("Press 5 to find the remainder the 2 numbers");
//Intializing Switch case
		int a=sc.nextInt(); 
		switch(a)
		{
			case 1:
			//ADDITION
				op.add(b,s);
				break;
			case 2:
			//SUBTRACTION
				op.sub(b,s);
				break;
			case 3:
			//MULTIPLICATION
				op.mult(b,s);
				break;
			case 4:
			//DIVISION
				op.div(b,s);
				break;
			case 5:
			//REMAINDER AFTER DIVISION
				op.rem(b,s);
				break;
			//For invalid input
			default : 
			System.out.println("Enter a valid number");
		}
		System.out.println("Press 1 to contineu: ");
		temp = sc.nextInt();
		}
		while(temp==1);
//Repeating till the user inputs any number other then 1
		sc.close();
	}
}
//Opration class consisting of all the arithmatic operations and displaying the results
class operations{
	public void add(int x,int y)
	{
		System.out.println("The Sum of the 2 numbers is: "+ (x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("The Magnitutde of Difference of the 2 numbers is: "+ (x-y));
	}
	public void mult(int x,int y)
	{
		System.out.println("The product of the 2 numbers is: "+ (x*y));
	}		
	public void div(double x,double y)
	{
		System.out.println("The Division of the 2 numbers is: "+ ((double)x/y));
	}
	public void rem(int x,int y)
	{
		System.out.println("The Remainder of the 2 numbers is: "+ (x/y));
	}
}
