import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating and array of object Play and hardcoding the values of the object arrays
        Play[] p = new Play[3];
        p[0] = new Play("One Piece","Toi Animations","Oda",50,500);
        p[1] = new Play("Gintama","Suhesha","Damon",40,750);
        p[2] = new Play("DBS","Goku","Vegeta",15,1000);

        //creating an array of object Musical and hardcoding the required values
        Musical[] m = new Musical[2];
        m[0] = new Musical("Spit","Satyam","Nishita","Tabish","Suryansh",100,250);
        m[1] = new Musical("Engineering","Sara","Shreya","Riva","Nirmitee",25,800);

        //making a responsive interface which asks the user which play/musical he wants to book seats for and how many
        while(true) {
            System.out.print("What do you want to watch?\n1. Play\t2. Musical\n");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Which Play?\n1."+p[0].getTitle() +"\n2."+ p[1].getTitle() +"\n3."+p[2].getTitle()+"\n");
                    int play = sc.nextInt();
                    System.out.print("There are " + p[play-1].getNoOfSeats() + " seats available. How many would you like to book: ");
                    int seats = sc.nextInt();
                    //if no of seats is less than booked it will show a message regarding the same
                    if(p[play-1].getNoOfSeats()-seats<0) {
                        System.out.print("Please enter seats less than the available amount\n");
                    }
                    else {
                        p[play - 1].setNoOfSeats(seats);
                        p[play - 1].setTotalCollection(seats * p[play - 1].getCostOfTickets());
                        System.out.println("Seats booked successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Which musical?\n1." + m[0].getTitle() +"\n2."+ m[1].getTitle() + "\n");
                    int musical = sc.nextInt();
                    System.out.print("There are seats " + m[musical-1].getNoOfSeats() + " available. How many would you like to book: ");
                    int seat = sc.nextInt();
                    if(m[musical-1].getNoOfSeats()-seat<0) {
                        System.out.print("Please enter seats less than available\n");
                    }
                    else {
                        m[musical-1].setNoOfSeats(seat);
                        m[musical-1].setTotalCollection(seat*p[musical-1].getCostOfTickets());
                        System.out.println("Seats booked successfully.");
                    }
            }
            System.out.print("Do want to book more seats? (Press 1 to continue): ");
            int proceed = sc.nextInt();
            System.out.println();
            if(proceed!=1) break;
        }

        //printing the amount each musical/play made and also printing the details about the musical/play
        System.out.println();
        for(int i=0;i<5;i++) {
            if(i<3) {
                System.out.println("Total box office collection of "+p[i].getTitle()+" is Rs."+p[i].getTotalCollection()+"\nDetails of the play are given below.");
                p[i].play = true;
                System.out.println(p[i]);
            } else {
                System.out.println("Total box office collection of "+m[i-3].getTitle()+" is Rs."+m[i-3].getTotalCollection()+ "\nDetails of the musical are given below.");
                System.out.println(m[i-3]);
            }
        }
    }
}

//creating a class Production
class Production {
    //creating private variables for data protection
    private String title, director, writer;
    private int totalCollection;

    //creating a constructor
    public Production(String title, String director, String writer) {
        //using this. to assign the values to the variables of this class
        this.title = title;
        this.director = director;
        this.writer = writer;
    }

    //overriding the toString() method in object class
    @Override
    //prints the details about the class
    public String toString() {
        return title + ", is directed by " + director + " and written by " + writer + "\n";
    }

    //creating setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public void setTotalCollection(int collection) {
        totalCollection += collection;
    }

    //creating getters
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getWriter() {
        return writer;
    }
    public int getTotalCollection() {
        return totalCollection;
    }
}

//creating a class Play which inherits all the properties of the class Production i.e. Production is the parent class of play
class Play extends Production {
    //creating a static variable so that it can keep a count of the no of performances
    private static int performance = 0;
    private int costOfTickets;
    private int noOfSeats,totalSeats;
    boolean play = false;

    //creating a constructor
    public Play(String title, String director, String writer,int noOfSeats,int costOfTicket) {
        //using super() to call the constructor of the parent class
        super(title,director,writer);
        this.noOfSeats = noOfSeats;
        this.costOfTickets = costOfTicket;
        totalSeats = noOfSeats;
    }

    //creating getters
    public int getPerformance() {
        return performance;
    }
    public int getCostOfTickets() {
        return costOfTickets;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }

    //creating setters
    public void setPerformance(int performance) {
        this.performance = performance;
    }
    public void setNoOfSeats(int n) {
        noOfSeats -= n;
    }

    @Override
    //overriding the toString() method of Production class
    public String toString() {
        //incrementing the variable performance
        performance++;
        return (totalSeats-noOfSeats) + "/" + totalSeats + " seats booked for #" + performance + " performance, of today. The " + (play? "Play " : "Musical ") + super.toString();
        //using super. to call the methods of the parent class
    }
}

//creating a class Musical which is a child class of Play class
class Musical extends Play {
    private String composer,lyricist;

    //creating a constructor
    public Musical(String title, String director, String writer, String composer, String lyricist,int noOfSeats,int costOfTickets) {
        //calling the constructor of the paren class
        super(title,director,writer,noOfSeats,costOfTickets);
        this.composer = composer;
        this.lyricist = lyricist;
    }

    //creating setters
    public void setComposer(String composer) {
        this.composer = composer;
    }
    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    //creating getters
    public String getComposer() {
        return composer;
    }
    public String getLyricist() {
        return lyricist;
    }

    @Override
    public String toString() {
        return composer + " is the composer and " + lyricist + " is the lyricist. " + super.toString();
    }
}
