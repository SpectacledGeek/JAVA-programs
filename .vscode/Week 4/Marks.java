/*Input Marks of 1 sutdents in a Arrayand then create a methord
to increase each mark by 2 and then return the whole array*/
//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;
//MAIN CLASS
public class Marks{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int [] Marks= new int[5];
//TAKING THE MARKS 
		for(int i=0;i<5;i++){
			System.out.printf("\nEnter the Marks of %d subject: ",(i+1));
			Marks[i]=sc.nextInt();
		}
        sc.close();
//PRINTING THE ARRAY ONCE 
		System.out.println("Before Editing");
		for(int i=0;i<5;i++){
			System.out.printf("\nThe Marks of %d subject is: %d",(i+1),Marks[i]);
			
		}
// CALLING THE METHORD
		Marks = Error(Marks);
		System.out.println("\nAfter Editing");
		for(int i=0;i<5;i++){
			System.out.printf("\nThe Marks of %d subject is: %d",(i+1),Marks[i]);		
		}
	}
//ADDING 2 TO EACH ELEMENT AND RETURNING THE WHOLE ARRAY
	public static int[] Error(int Marks[]){
		for(int i=0;i<5;i++){
			Marks[i]+=2;
		}
		return Marks;
	}
} 
