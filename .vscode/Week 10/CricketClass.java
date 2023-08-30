/*Define a class Cricketer which has:-
Attributes:-
● player_name
● runs_hit
● innings_count
● not_out_count
● batting_avg
Methods:-get_avg
Make a cricket team with 11 cricketers. For each cricketer, find his batting
average. Handle all different errors while calculating this. Also, make a method
which will find the list of cricketers in ascending order of their batting average
and also display the cricketer stats in this order.
If the average of the batting average of the entire team is less than 20 runs then throw a user-defined exception.
Note:- handle errors like ArrayIndexOutOfBoundsException, ArithmeticException,ArrayStoreException, NumberFormatException, etc*/
import java.util.*;
//main class
public class CricketClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players in your team: ");
//taking number of players as input
        int n = sc.nextInt();
        sc.nextLine(); //consumes new line character
//making an objext array of cricket calss
        Cricket[] c = new Cricket[n];
//error handelling 
        try {
//taking input of each player 
            for (int i = 0; i < c.length; i++) {
                System.out.print("Enter the name of the player: ");
                String name = sc.nextLine();
                System.out.printf("Enter the total runs scored by %s: ",name);
                int runsHit = sc.nextInt();
                System.out.printf("Enter the total innings played by by %s: ",name);
                int noOfInnings = sc.nextInt();
                System.out.printf("Enter the not out count of %s: ",name);
                int notOutCount = sc.nextInt();
                sc.nextLine(); //consumes new line character
                System.out.println();
//passing the values to the constructor of cricket
                c[i] = new Cricket(name,runsHit,noOfInnings,notOutCount);
            }
            sc.close();

//sorting the players according to there batting average
            for(int i=0;i<c.length;i++) {
                for(int j=i;j<c.length;j++) {
                    if(c[i].getBattingAverage()<c[j].getBattingAverage()) {
                        Cricket temp;
                        temp = c[i];
                        c[i] = c[j];
                        c[j] = temp;
                    }
                }
            }

//print the information
            for (Cricket cricket : c) {
                System.out.println("-".repeat(30));
                System.out.println(cricket);
            }

//catching different types of errors
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Value of index exceeds the length\n" + e);
        } catch (ArrayStoreException e) {
            System.out.println("Wrong type of object is being stored in the array\n" + e);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        } catch (Exception e) {
            System.out.println(e);
        }

//for custom error
        try {
            double avg = 0;
            for (Cricket cricket : c) {
                avg += cricket.getBattingAverage();
            }
            avg /= c.length;
            if(avg<20) {
                throw new AvgLessThan20Exception();
            }
        } catch (AvgLessThan20Exception e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Cricket {
    private String name;
    private int runsHit,noOfInnings,notOutCount;
    private double battingAverage;

//constructor
    public Cricket(String name,int runsHit,int noOfInnings,int notOutCount) {
        this.name = name;
        this.runsHit = runsHit;
        this.noOfInnings = noOfInnings;
        this.notOutCount = notOutCount;
    }

    public double getBattingAverage() {
        try {
            battingAverage = ((double) runsHit) / noOfInnings;
            return battingAverage;
        } catch (ArithmeticException e) {
            System.out.println("Number of innings is 0, cannot calculate average.");
        }
        return -1;
    }

    @Override
//Display player information
    public String toString() {
        return String.format("%s\nRuns scored: %d runs\nInnings played: %d innings\nNot out count: %d\nBatting average: %.2f",name,runsHit,noOfInnings,notOutCount,getBattingAverage());
    }
}

//custom exception
class AvgLessThan20Exception extends Exception {
    @Override
    public String toString() {
        return "Average runs of the team is less than 20";
    }

    @Override
    public String getMessage() {
        return "Average runs of the team is less than 20";
    }
}