//Importing required classes
import java.util.Scanner;
//Creating a user class
class User {
  String name;
  int account_balance;
  int age;
//Metohrd to check wether one can watch the movie or not
  public boolean check(int AgeRis, int cost) {
    if (age >= AgeRis && account_balance >= cost) {

      return true;
    } else {
      return false;
    }
  }
//Methord to deduct the cost from the acc balance
  public void watch(boolean a, int cost) {
    account_balance = account_balance - cost;
    System.out.println("Amount of movie is paid .Please enjoy your movie");
    System.out.println("Have a great Experience");
  }
}
//Movie class
class Movie {
  String title;
  int AgeRistriction;
  int cost;
//Methords to display agerestriction and cost
  public int getAgeRis() {
    return AgeRistriction;
  }

  public int getCost() {
    return cost;
  }
}
//Main class
public class Buy_Stream {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//Creating objects of user and movie class
    User P1 = new User();
    Movie M1 = new Movie();
//Taking input of user's information
    System.out.println("Enter your name:");
    P1.name = sc.nextLine();
    System.out.println("Enter your account balance:");
    P1.account_balance = sc.nextInt();
    System.out.println("Enter your age:");
    P1.age = sc.nextInt();
    M1.title = "Final Destination";
    M1.AgeRistriction = 18;
    M1.cost = 200;
//calling methord check
    boolean check1 = P1.check(M1.AgeRistriction, M1.cost);
//Proceding according to the check condition 
    if (check1) {
      System.out.println("You can watch the movie.");
      System.out.println("If want to watch movie please enter 1 else enter 0.");
      int i = sc.nextInt();
      if (i == 1) {
        P1.watch(check1, M1.cost);
      }
    } else {
      System.out.println("You cant watch this movie.");
      if (M1.cost > P1.account_balance) {
        System.out.println("Due to Insufficient balance.\n Movie price:" + M1.cost);
      }
      if (M1.AgeRistriction > P1.age) {
        System.out.println("Due to Age ristriction on movie.\n Age ristriction on movie:" + M1.AgeRistriction);
      }
    }
    System.out.println("Your account balance is " + P1.account_balance);
    sc.close();
  }
}