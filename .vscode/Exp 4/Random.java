//Importing required java classes
import java.lang.Math;
//Main Class
public class Random{
	public static void main(String[] args)
	{
//random() creates a doube between 0 and 1 so to get in range of 0to 20 we multiply it by 20 and then typecast it to int
		double rand= Math.random();
		System.out.println("The random number is: " + (int)(rand*20));
	}
}