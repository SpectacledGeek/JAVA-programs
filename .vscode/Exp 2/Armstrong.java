//ARMSTRONG NUMBERS
import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Start : ");
//Taking range as a input
		int a= sc.nextInt();
		System.out.print("Enter End : ");
		int b= sc.nextInt();
        sc.close();
		int digit=0;
		int num=0;
		int temp=0;
		int sum=0;
		System.out.println("The Armstrong numbers in the provided range are: ");
//Checking for Armstrong in the inputed range	
		for(int j=a;j<=b;j++)
		{
//Resetting required variables
			sum=0;
			digit=0;
			num=j;
//Calculating Number of digits
			while(num!=0)
			{												
				num=num/10;
				digit++;
			}
			num=j;
//Finding the sum of each digit raised to power of total digits
			for(int i=0;i<digit;i++)
			{									
				temp=num%10;
				num=num/10;
				sum+=Math.pow(temp,digit);
			}
//Print if Armstrong Number
			if (j==sum)
			{
				System.out.print(j+"  ");			
			}
	
		}
	}
}