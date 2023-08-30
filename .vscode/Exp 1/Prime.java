// PRIME NUMBERS
import java.util.*;
class Prime {
    public static void main(String[] args) {
        int a=0,b=0;
        int factor=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
//Taking Range as a input
        System.out.print("Enter the Start of the range: ");
        a=sc.nextInt();
        System.out.print("\nEnter the End of the range: ");
        b=sc.nextInt();
//Checking for Prime
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    factor++;
                }
            }
//Prime number has only 2 factors 1 and itself
            if(factor==0)
            {
                System.out.print(i+"  ");
                count++;
            }
//reseting factor variable
            factor=0;
        }
        System.out.println("\nThere are "+ count + " Prime numbers in the given range.");
        sc.close();
    }
}