/*Menue to ask what the peron want sto do
  switch case to access each methord
  single class  
 */
//IMPORING REQUIRED JAVA CLASSES
import java.util.Scanner;
//MAIN CLASS
public class StringFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//CREATING A SWITCH-CASE DRIVEN MENUE
        int a, check;
        String s, s2;
//MENUE
        do {
            System.out.println("1) String Capitalization");
            System.out.println("2) String Minimization");
            System.out.println("3) String Concatination");
            System.out.println("4) String Compare");
            System.out.println("5) String Search");
            System.out.println("6) String Extraction");
            System.out.println("7) String Replace");
            System.out.println("Enter the function you wnat to perform.");
            a = sc.nextInt();
//BUFFER CLEARANCE
            sc.nextLine();
            switch (a) {
                case 1:
                    //CAPITAL
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    capital(s);
                    break;
                case 2:
                    //SMALL
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    mini(s);
                    break;
                case 3:
                    //CONCATINATION
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    System.out.println("Enter Another String to operate on.");
                    s2 = sc.nextLine();
                    join(s, s2);
                    break;
                case 4:
                    //COMPARISION
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    System.out.println("Enter Another String to operate on.");
                    s2 = sc.nextLine();
                    compare(s, s2);
                    break;
                case 5:
                    //SEARCHING
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    System.out.println("Enter a String to find in the above string.");
                    s2 = sc.nextLine();
                    search(s, s2);
                    break;
                case 6:
                    //EXTRACTION
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    extract(s);
                    break;
                case 7:
                    //REPLACEMENT
                    System.out.println("Enter A String to operate on.");
                    s = sc.nextLine();
                    replace(s);
                    break;
                //IF A NUMBER GREATER THEN 7 OR LESS THEN 1 IS PUT
                default:
                    System.out.println("Enter a valid Number...");

            }
//KEEPING THE MENUE LOOPING TILL THE USER EXITS
            System.out.println("Enter 0 to exit");
            check = sc.nextInt();
        } while (check != 0);
        sc.close();
    }

    // ----------------------------------------------------------------------------------//
//USING BASIC STRING FUNCTIONS TO CREATE METHORDS TO BE CALLED BY SWITCH CASE
    public static void capital(String x) {
        x = x.toUpperCase();
        System.out.println("The Capitalized String is: " + x);
    }

    public static void mini(String x) {
        x = x.toLowerCase();
        System.out.println("The Minimized String is: " + x);
    }

    public static void join(String x1, String x2) {

        x1 = x1.concat(x2);
        System.out.println("The joined String is: " + x1);
    }

    public static void compare(String x1, String x2) {
        int same;
        same = x1.compareTo(x2);
        if (same == 0)
            System.out.println("The entered Strings are same");
        else if (same > 0)
            System.out.println("The Fist String is Bigger");
        else
            System.out.println("The Second String is Bigger");
    }

    public static void search(String x1, String x2) {
        boolean found;
        int index;
        found = x1.contains(x2);
        if (found) {
            System.out.println("The Second String is present in the First string.");
            index = x1.indexOf(x2);
            System.out.println("It is found at index " + index);
        } else
            System.out.println("String not found.");
    }

    public static void extract(String x) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start index of what you want to extract.");
        m = sc.nextInt();
        System.out.println("Enter the End index of what you want to extract.");
        n = sc.nextInt();
        if (n < x.length()) {
            x = x.substring(m, n);
            System.out.println("The Sub String is " + x);
        } else
            System.out.println("Enter a valid limit.");

    }

    public static void replace(String x) {
        Scanner sc = new Scanner(System.in);
        String replacement;
        System.out.println("Enter the substring u want to put in the original String");
        replacement = sc.nextLine();
        System.out.println("Enter the Substring u want to replace");
        String target = sc.nextLine();
        if (x.contains(target)) {
            x = x.replace(target, replacement);
            System.out.println("The modified String is " + x);
        } else
            System.out.println("The targeted substring not found.");
    }

}
