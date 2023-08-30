/*Ankit works at ABC Company. He noticed that different roles(positions) have different salaries and bonuses.
The 1st Role is an ‘Intern’ which has 3/4th of the base salary of an Employee.
Then there is ‘Clerk’ which has ½ of base salary.
And then there are ‘Manager’ who have twice the base salary of that of an employee.
Help him write a program in Java as follows.

Create a class ‘Employee’ which has a method named ‘getSalary’ which returns a base salary of Rs. 10,000. It also has methods named ‘getBonus’ which returns the bonus amount for that role(initially set to Rs. 0).
Make 3 subclasses for different roles which inherit the ‘Employee’ class and each has functions named ‘getSalary’ and ‘getBonus’.(You can assume values for ‘getBonus’ method)
Display the output for all cases. Also print the total salary received by each Employee after getting the bonus.
Note : Solve using method overriding*/
//Importing reuired java classes
import java.util.Scanner;

//Main class
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Check variable for switch case and looping
		int a;
        int loop = 1;
        
//taking the base salary input
		System.out.println("Enter base salary:");
		double BS = sc.nextDouble();
        
        // Set the base salary for all employees
        Employee.basesalary(BS);
        
//Looping
		do {
            System.out.println("1) INTERN");
            System.out.println("2) CLERK");
            System.out.println("3) MANAGER");
            System.out.println("Enter the person whose info you want:");
            a = sc.nextInt();
            
//Switch case
			switch (a) {
                case 1:
                    // Create an instance of the Intern class
                    Employee emp1 = new Intern();
                    // Print the base salary before adding bonus
					System.out.println("Base Salary: " + emp1.getsalary());
                    System.out.println("Bonus: " + emp1.getbonus());
					//Print the salary after bonus
                    System.out.println("Total Salary: " + emp1.getsalary());
                    break;
                
                case 2:
                    // Create an instance of the Clerk class
                    Employee emp2 = new Clerk();
					//Print the salary before bonus
                    System.out.println("Base Salary: " + emp2.getsalary());
                    System.out.println("Bonus: " + emp2.getbonus());
					//Print the salary after bonus
                    System.out.println("Total Salary: " + emp2.getsalary());
                    break;
                
                case 3:
                    // Create an instance of the Manager class
                    Employee emp3 = new Manager();
					//Print the salary before bonus
                    System.out.println("Base Salary: " + emp3.getsalary());
                    System.out.println("Bonus: " + emp3.getbonus());
					//Print the salary after bonus
                    System.out.println("Total Salary: " + emp3.getsalary());
                    break;
                
                default:
                    System.out.println("Enter a valid input...");
            }
            
            // Check variable for looping
			System.out.println("Enter 1 to continue...");
            loop = sc.nextInt();
        } while (loop == 1);
        sc.close();
    }
}

class Employee {
    double bonus = 0d;
    static double basesalary;
    
    // Set the base salary for all employees
    public static void basesalary(double x) {
        basesalary = x;
    }
    
    public double getsalary() {
        return basesalary;
    }
    
    public double getbonus() {
        return bonus;
    }
}
//Child Classes
//Class for Intern
class Intern extends Employee {
    double salary = basesalary * 0.75;
    double bonus = salary * 0.3;
    
    public double getsalary() {
        return salary;
    }
    
    public double getbonus() {
        salary += bonus;
        return bonus;
    }
}
//Class for Clerk
class Clerk extends Employee {
    double salary = basesalary * 0.5;
    double bonus = salary * 0.3;
    
    public double getsalary() {
        return salary;
    }
    
    public double getbonus() {
        salary += bonus;
        return bonus;
    }
}
//Class for Manager
class Manager extends Employee {
    double salary = basesalary * 2;
    double bonus = salary * 0.3;
    
    public double getsalary() {
        return salary;
    }
    
    public double getbonus() {
        salary += bonus;
        return bonus;
    }
}
