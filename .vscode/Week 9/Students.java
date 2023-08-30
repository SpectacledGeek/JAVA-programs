/*Write an abstract class Course with an abstract method studentDetails().
Create 2 classes Comps and IT which inherits class Course and implements studentDetails().
The studentDetails() method should print the name, UID, and year (FE, SE, TE) of students of that Course. These details have to be taken from the user. Write a program that asks user to choose a course  and print the details of all students in that course in a sorted manner  as per the year( FE,SE,TE)*/
import java.util.Scanner;

abstract class Course
{
	public String name,uid,year;
	Course(String n, String u, String y)
	{
		name=n;
		uid=u;
		year=y;
	}
	abstract void studentDetails();	
}
class Comps extends Course
{
	public Comps(String name,String uid, String year)
	{
		super(name,uid,year);
	}
	public void studentDetails()
	{
		System.out.println("Comps: ");
		System.out.println(name);
		System.out.println(uid);
		System.out.println(year);
	}
}
class IT extends Course
{
	public IT(String name,String uid, String year)
	{
		super(name,uid,year);
	}
	public void studentDetails()
	{
		System.out.println("IT: ");
		System.out.println(name);
		System.out.println(uid);
		System.out.println(year);
	}
}
public class Students
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int i;
		System.out.print("Enter The number of Students: ");
		int studs = sc.nextInt();
		sc.nextLine();
		Course [] course= new Course[studs];
		String name,uid,year;
		int choice;
		for(i=0;i<studs;i++)
		{
			System.out.println("Enter the Name: ");
			name=sc.nextLine();
			System.out.println("Enter the UID: ");
			uid=sc.nextLine();
			System.out.println("Enter the Year: ");
			year=sc.nextLine();
			System.out.println("1) Comps");
			System.out.println("2) IT");
			System.out.println("press 1 for Comps and 2 for IT: ");
			choice= sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
				course [i] = new Comps(name,uid,year);
				// course[i].studentDetails();
				break;
				case 2:
				course [i] = new IT(name,uid,year);
				// course[i].studentDetails();
				break;
				default:System.out.println("Enter a valid number");
			}
			
		}
		System.out.println("The details of the Students are as follows: ");
		System.out.println("---------------------------------------------------------");
		for(i=0;i<studs;i++)
		{
			course[i].studentDetails();
			System.out.println("---------------------------------------------------------");
		}
		sc.close();
	}
}









