
/*Write a program to extract a portion of character string and print the extracted string. Assume that m characters are 
  extracted, starting with the n th character. so take m and n as user input. No use of inbuild functions. */
//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;

//MAIN CLASS
public class Extract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// VARIABLES FOR THE START AND END OF EXTRACTION
		int m, n, length;
		System.out.println("Enter a String.");
		String s = sc.nextLine();
		System.out.println("Enter the starting index to trim from.");
		m = sc.nextInt();
		System.out.println("Enter the ending index to trim till.");
		n = sc.nextInt();
		length = s.length();
		// IF END IS OUT OF THE SCOPE OF THE STRING THEN RETURN INVALID...
		if (n <= length) {
			m -= 1;
			n -= 1;
			Substring(s, m, n, length);
		} else
			System.out.println("Please enter a valid limit...");
		sc.close();

	}

	// METHORD TO EXTRACT THE REQUIRED PART OF THE STRING
	public static void Substring(String x, int a, int b, int size) {
		// CONVERTING THE ENTERED STRING TO A CHARECTER ARRAY
		char[] cut = x.toCharArray();
		// NEW STRING OF SIZE B-A+1
		char[] extracted = new char[b - a + 1];
		// EXTRACTING THE STRING
		for (int i = a; i <= b; i++) {
			extracted[i - a] = cut[i];
		}
		// DISPLAY THE EXTRACTED STRING
		String display = new String(extracted);
		System.out.println(display);
	}

}
