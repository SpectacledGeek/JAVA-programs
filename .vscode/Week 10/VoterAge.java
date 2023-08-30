//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;
//MAIN CALSS
public class VoterAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//TAKING AGE AS A INPUT
        System.out.print("Enter your age: ");
//CHECKING FOR ANY EXCEPTIONS
        try
        {
            int age = sc.nextInt();
            sc.close(); 
            if(age<18)
            {
//THROW CUSTOM EXCEPTION
                throw new AgeExceptionError();
            }
            else System.out.println("You can Vote...");
        }
//ANYBASIC EXCEPTION OCCURED
        catch(Exception e)
        {
            System.out.println(e);
        }
//CUSTOM EXCEPTION OCCURED
        catch(AgeExceptionError e)
        {
            System.out.println(e.toString());
        }
    }
}
//EXCEPTION HANDELING CLASS
class AgeExceptionError extends Error
{
    @Override
    public String toString()
    {
        return "Your are not elligible to vote.";
    }
}
