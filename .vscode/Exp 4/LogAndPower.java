/*2) Create a Test class with a data double base, int power, int logBase, int argument.
Create a default, no-argument constructor which sets the default value of all variables to 2.
There are 2 overloaded functions:
1. double calculate (double base, int power)
This function returns the value when *base* is raised to *power*
For example: calculate (3.0, 2) returns the value of 3.0 raised to 2 i.e., 9.0
2. double calculate (int logBase, int argument)
This function returns the value of the log of *argument* to the base *logBase*.
For example: calculate (3, 9) returns log of 9 to the base 3 i.e., 2.0
Create a main method in a separate class to call the above functions with the following inputs:
1. calculate (2, 4)
2. calculate (2.0, 4.0)
Create a display() method which displays the output based on the type of Test object created.*/
//Importing required java classes
import java.lang.Math;
//Main Class
public class LogAndPower {
	public static void main(String[] args) {
		Test test = new Test();
//Constructor Overloading
		double power = test.calculate(2.0,4);
		test.display(power);
		double log = test.calculate(2,4);
		test.display(log);
	}
}

class Test {
	private double base;
	private int power;
	private int logBase;
	private int argument;
//Assigining values to variables
	public Test() {
		power=2;
		base=2;
		logBase=2;
		argument=2;
	}
//Calling with 1 double and 1 int parameter
	public double calculate(double base, int power) {
		System.out.print("The value when " + base + " is raised to " + power + " = ");
		return Math.pow(base,power);
	}
//Calling with 2 int parameter
	public double calculate(int logBase, int argument) {
		System.out.print("The value of the log of " + argument+ " to the base " + logBase + " = ");
		return (Math.log(argument)/Math.log(logBase));
	}
		
	public void display(double ans) {
		System.out.print(ans + "\n");
	}
}