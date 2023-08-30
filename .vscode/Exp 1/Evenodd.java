import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//Creating variables to count number of odd and even numbers and range
        int codd=0;
        int ceven=0;
        System.out.print("Enter the start of range: ");
        int a= sc.nextInt();
        System.out.print("\nEnter the End of range: ");
        int b= sc.nextInt();
        sc.close();
//Operation for even numbers
        System.out.print("\nEven numbers: ");
        for(int i=a;i<=b;i++)
        {
            if (i%2==0)
           {
            System.out.print(i+"  ");
            ceven++;
           }
        }
//Operation for Odd numbers
        System.out.print("\nOdd Numbers: ");
        for(int i=a;i<=b;i++)
        {
            if (i%2!=0)
            
            {
                System.out.print(i+"  ");
                codd++;
            }
        }
//Printing the Number of Odd and Even Numbers in the given Range
        System.out.print("\nThere are "+ceven+" Even numbers in the given range.");
        System.out.print("\nThere are "+codd+" Odd numbers in the given range.");
    }
    
}
