//IMPORTING REQUIRED JAVA CLASSES
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.lang.Math;

//MAIN CLASS
public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //assigning today's date to d1
        LocalDate d1 = LocalDate.now();

        //asking the user the amount he has deposited in different banks
        System.out.println("Enter the amount you have deposited in");
        System.out.print("SBI Bank: ");
        int sbi = sc.nextInt();
        System.out.print("ICICI Bank: ");
        int icici = sc.nextInt();
        System.out.print("AXIS Bank: ");
        int axis = sc.nextInt();

        //asking the user when does he want to end his maturity
        System.out.println("Enter the date of maturity.");
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Day: ");
        int day = sc.nextInt();
        //assigning the date of maturity to d2
        LocalDate d2 = LocalDate.of(year,month,day);

        //calculating the gap between d1 and d2 in terms of years, months and days
        Period gap = Period.between(d1,d2);
        //converting duration into days
        int duration = gap.getYears()*365+gap.getMonths()*30+gap.getDays();
        //setting the static variable days in the banks class
        Banks.setDays(duration);

        //printing the start and end date, also the duration in days
        System.out.print("\nStart date: " + d1 + "\nEnd date: " + d2);
        System.out.printf("\nThe duration for which amount is kept in the bank is %d days.\n",duration);


        //printing the roi and amount received after maturity of different banks
        SbiBank s = new SbiBank();
        System.out.printf("\nRate of interest in SBI is %.2f\n",s.getRateOfInterest());
        System.out.printf("Total amount received from SBI after maturity is Rs.%.2f\n",s.afterMaturity(sbi, s.getRateOfInterest()));

        IciciBank i = new IciciBank();
        System.out.printf("\nRate of interest in ICICI is %.2f\n",i.getRateOfInterest());
        System.out.printf("Total amount received from ICICI after maturity is Rs.%.2f\n",i.afterMaturity(icici, i.getRateOfInterest()));

        AxisBank a = new AxisBank();
        System.out.printf("\nRate of interest in AXIS is %.2f\n",a.getRateOfInterest());
        System.out.printf("Total amount received from AXIS after maturity is Rs.%.2f\n",s.afterMaturity(axis, a.getRateOfInterest()));
        
        sc.close();
    }
}

class Banks {
    //declaring a static variable days and setting it using setters
    protected static int days;
    public static void setDays(int duration) {
        days = duration;
    }

    public double getRateOfInterest() {
        return 2;
    }

    //calculating the amount one will get after maturity and then returning it
    public double afterMaturity(double amount,double roi) {
        amount = amount*Math.pow((1+roi*0.01),days/365.0);
        return amount;
    }
}

class SbiBank extends Banks {
    //overriding the parent class method and returning the roi based on the no of days the amount is kept in the bank
    @Override
    public double getRateOfInterest() {
        double roi;
        if(days>=7 && days<=45) {
            roi = 3;
        } else if(days>=46 && days<=90) {
            roi = 4.05;
        } else if(days>=91 && days<=180) {
            roi = 4.10;
        } else {
            roi = 5;
        }
        return roi;
    }
}

class IciciBank extends Banks {
    //overriding the parent class method and returning the roi based on the no of days the amount is kept in the bank
    @Override
    public double getRateOfInterest() {
        double roi;
        if(days>=7 && days<=14) {
            roi = 3.10;
        } else if(days>=15 && days<=30) {
            roi = 3.20;
        } else if(days>=31 && days<=45) {
            roi = 3.50;
        } else if(days>=46 && days<=90) {
            roi = 4.50;
        } else if(days>=91 && days<=120) {
            roi = 4.70;
        } else if(days>=121 && days<=180) {
            roi = 4.90;
        } else {
            roi = 5;
        }
        return roi;
    }
}

class AxisBank extends Banks {
    //overriding the parent class method and returning the roi based on the no of days the amount is kept in the bank
    @Override
    public double getRateOfInterest() {
        double roi;
        if(days>=7 && days<=30) {
            roi = 3.15;
        } else if(days>=31 && days<=45) {
            roi = 3.45;
        } else if(days>=46 && days<=90) {
            roi = 4.05;
        } else if(days>=91 && days<=120) {
            roi = 4.70;
        } else if(days>=121 && days<=180) {
            roi = 5;
        } else {
            roi = 5;
        }
        return roi;
    }
}