/*A person is planting a Bomb in an enemy area. He is deciding the date and time 
of the explosion beforehand. Now calculate how many days are left for the explosion.*/
//Importing Required java classes
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//Main Class
public class Bomb{
	public static void main(String[] args){
//Setting Current date 
		LocalDate today=  LocalDate.now();
		Scanner sc= new Scanner(System.in);
//Setting Detonation date
		LocalDate detonation = LocalDate.of(2024,06,25);
//Finding Difference between the 2 dates
		Period gap= Period.between(today,detonation);
		int year= gap.getYears();
		int months= gap.getMonths();
		int days= gap.getDays();
//Printing the Time remaining
		System.out.println("Time left for detonation: ");
		System.out.print(year + " Years " + months + " Months " + days + " Days ");
        sc.close();
	}
}