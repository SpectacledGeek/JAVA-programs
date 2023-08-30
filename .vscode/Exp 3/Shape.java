/*Create a Class Area with length as data member. Create 2 constructors 
(No args and 2 args) and a methord to calculate circumference*/ 
//Importing required classes
import java.util.Scanner;
//Creating a constructor
class Area{
	int length;
	int breath;
//Constructor overloading with 1 parameter
	public Area(int x)
	{
		length=x;
		breath=x;
	}
//Constructor overloading with 2 parameter
	public Area(int x,int y)
	{
		length=x;
		breath=y;
	}
//Default Condition
	public Area()
	{
		System.out.print("PUT SOMETHING!!!");
	}
//Methord to calculate area
	public int area()
	{
		int area=length*breath;
		return area;
	}
}

public class Shape {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
//Taking length and breath as inputs
		System.out.println("Enter the length: ");
		a=sc.nextInt();
		System.out.println("Enter the breadth: ");
		b=sc.nextInt();
//Creating objects and constructors
		Area sq=new Area(a);
		Area rect=new Area(a,b);
//Display the area
		System.out.println("The area of the square is: " + sq.area());
		System.out.println("The area of the Rectangle is: " + rect.area());
        sc.close();
	}
}