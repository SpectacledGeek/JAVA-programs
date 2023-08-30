// IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;

// MAIN CLASS
public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // CREATING ARRAY OF MAX 5 INPUTS FOR EACH DOG
        Labrador[] lab = new Labrador[5];
        GermanShepherd[] german = new GermanShepherd[5];

        // SETTING THE DEFAULT COUNT AS 0
        int noOfGerman = 0, noOfLabs = 0;

        // TAKING INPUT FROM THE USER
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter the details of your dog.");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("What is the breed of the dog?\n1. German Shepherd\n2. Labrador\n");
            int choice = sc.nextInt();

            // BUFFER CLEAR
            sc.nextLine();

            // SWITCH CASE FOR FURTHER DETAILS
            switch (choice) {
                case 1:
                    System.out.print("Height: ");
                    int height = sc.nextInt();
                    if (noOfGerman == 0) {
                        System.out.print("Lifespan: ");
                        int lifespan = sc.nextInt();
                        GermanShepherd.setLifespan(lifespan);
                    }
                    sc.nextLine();
                    german[noOfGerman] = new GermanShepherd("Animal", 4, name, age, height, noOfGerman);
                    noOfGerman++;
                    break;
                case 2:
                    System.out.print("Weight: ");
                    int weight = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Colour: ");
                    String colour = sc.nextLine();
                    lab[noOfLabs] = new Labrador("Animal", 4, name, age, colour, weight, noOfLabs);
                    noOfLabs++;
            }
        }

        // DISPLAY GERMAN SHEPHERD DETAILS
        for (int i = 0; i < noOfGerman; i++) {
            System.out.println(german[i].toString(i));
            System.out.println();
        }
        
        // DISPLAY AVERAGE HEIGHT OF GERMAN SHEPHERDS
        System.out.printf("The average height of german shepherd is %.2fm", GermanShepherd.calculateAvgHeight(noOfGerman));
        System.out.println("The life expectancy of german shepherd is " + Dog.lifeExpectancy(1));
        System.out.println();

        // DISPLAY LABRADOR DETAILS
        for (int i = 0; i < noOfLabs; i++) {
            System.out.println(lab[i].toString(i));
            System.out.println();
        }
        
        // DISPLAY AVERAGE WEIGHT OF LABRADORS
        System.out.printf("The average weight of labrador is %.2fKg\n", Labrador.calculateAvgWeight(noOfLabs));
        System.out.println("The life expectancy of labrador is " + Dog.lifeExpectancy(2));

        // DISPLAY MOST POPULAR BREED
        System.out.println("\nThe more popular breed is " + Dog.popular(noOfGerman, noOfLabs));
    }
}

//PARENT CLASS
class Mammal {
    private String category;
    private int noOfLegs;

//CONSTRUCTOR OF MAMMAL CLASS
	public Mammal(String category, int noOfLegs) {
        this.category = category;
        this.noOfLegs = noOfLegs;
    }

    public String toString() {
        return String.format("It belongs to the category %s, and it has %d legs", category, noOfLegs);
    }
}

//CHILD CLASS
class Dog extends Mammal {
    private String name;
    private int age;

	//CONSTRUCTOR OF CHILD CLASS
    public Dog(String category, int noOfLegs, String name, int age) {
        super(category, noOfLegs);
        this.name = name;
        this.age = age;
    }
	//RETURN LIFE EXPECTENCY BASED ON BREAD OF DOG
    public static int lifeExpectancy(int i) {
        return (i == 1) ? 9 : 12;
    }
	//RETURN THE BREED WITH A HIGHER COUNT
    public static String popular(int noOfGerman, int noOfLabs) {
        return (noOfGerman > noOfLabs) ? "German Shepherd" : (noOfGerman < noOfLabs) ? "Labrador" : "Both are equally popular";
    }

    @Override
    public String toString() {
        return String.format("The name of the dog is %s and its age is %d.\n%s", name, age, super.toString());
    }
}

//DERIVED CLASS FROM CHILD CLASS
class GermanShepherd extends Dog {
    private static int[] height = new int[5];
    private static int lifespan;

	//CONSTRUCTOR OF G.S CLASS
    public GermanShepherd(String category, int noOfLegs, String name, int age, int heights, int noOfGerman) {
        super(category, noOfLegs, name, age);
        height[noOfGerman] = heights;
    }
	//SETTER FOR LIFESPAN
    public static void setLifespan(int life) {
        lifespan = life;
    }
	//METHORD TO SPEAK
    public String speak() {
        return "GRUNT";
    }
	//METHORD TO CALCULATE AVG HEIGHT
    public static double calculateAvgHeight(int k) {
        double avg = 0;
        for (int i = 0; i < k; i++) {
            avg += height[i];
        }
        avg /= k;
        return avg;
    }

    public String toString(int i) {
        return String.format("The breed of the dog is german shepherd. Its height is %dcm and lifespan is %d years. It speaks %s.\n%s", height[i], lifespan, speak(), super.toString());
    }
}

class Labrador extends Dog {
    private String colour;
    private static int[] weight = new int[5];

	//CONSTRUCTOR OF LAB CLASS
    public Labrador(String category, int noOfLegs, String name, int age, String colour, int weights, int noOfLabs) {
        super(category, noOfLegs, name, age);
        this.colour = colour;
        weight[noOfLabs] = weights;
    }

	//METHORD TO SPEAK
    public String speak() {
        return "WOOF";
    }

	//METHORD TO CALCULATE AVG WEIGHT
    public static double calculateAvgWeight(int k) {
        double avg = 0;
        for (int i = 0; i < k; i++) {
            avg += weight[i];
        }
        avg /= k;
        return avg;
    }

    public String toString(int i) {
        return String.format("The breed of the dog is labrador. It's weight is %dKg and colour is %s. It speaks %s.\n%s", weight[i], colour, speak(), super.toString());
    }
}
