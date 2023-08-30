/*Write a program which will read a string and rewrite it in the alphabetical
order. For example, the word STRIN should be written as GINRST*/

//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;

//MAIN CLASS
public class StringArrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a string: ");
		// TAKING STRING INPUT
		String test = sc.nextLine();
		// DISPLAY THE ORIGINAL STRING
		System.out.printf("The Entered String is: %s", test);
		// FINDING THE LENGTH OF THE INPUTED STRING
		int length = test.length();
		// CONVERT THE INPUTED STRING TO ALL LOWER CASE TO AVOID ANY MISSHAPS
		test = test.toLowerCase();
		// CALLING THE SWAP METHORD
		Swap(test, length);
		sc.close();
	}

	public static void Swap(String x, int length) {
		// TEMPORARY CHARECTER ARRAY TO REARANGE
		char[] temp = x.toCharArray();
		// TEMPORARY VARIABLE FOR SWAPING
		char temporary;
		// CHECKING THE FIRST CHARECTER WITH THE NEXT AND SOO ONN...
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// SWAPPING IF FIRST CHARECTER IS LARGER IN ASCI VALUE
				if (temp[i] >= temp[j]) {
					temporary = temp[i];
					temp[i] = temp[j];
					temp[j] = temporary;
				}
			}
		}

		// DISPLAYING THE REARRANGED STRING
		String s = new String(temp);
		System.out.printf("\nThe Final string after swapping in Alphabetical order is: %s", s);
		// DISPLAYING IT AFTER CAPITALISING
		s = s.toUpperCase();
		System.out.printf("\nAnd:%s", s);

	}
}