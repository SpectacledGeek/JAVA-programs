//MERSENNE PRIME
import java.lang.Math;
public class Mersenne 
{
    public  static void  main(String[] arg)
    {
        long temp=0l;
        int factor=0;
        System.out.println("THE MERSENNE NUMBERS ARE AS FOLLOWS: ");
//Checking for each power of 2
        for(int i=2;i<=31;i++)
        {
            temp=((long)Math.pow(2,i))-1;
//Calculating factors
            for(int j=2;j<temp/2;j++)
            {
                if(temp%j==0)
                {
                    factor++;
                }

            }
//Print if Prime
            if(factor==0)
            {
                System.out.println(temp+"  "+i);
            }
//Resetting factor variable
            factor=0;
        }
    }
}
