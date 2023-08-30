/*Shopping Cart: Create a 3D array named as cart which stores the cost of items purchased. Each conveyor belt holds 3 carts at a time.
Each cart should contain Perishable and Non-perishable category items. Find out
a) Total cost of each cart
b) Find out all perishable items sold (on 3 carts)
c) Find out costliest non-perishable item sold*/
//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;
//MAIN CLASS
public class Shop {
    public static void main(String[] args) {
//INITIALIZING EACH CART AS AN OBJECT
        Cart[] cart = new Cart[3];
        for(int i=0;i<3;i++) {
            cart[i] = new Cart();
            System.out.println("Cart " + (i+1));
//TAKING INPUT OF EACH CART
            cart[i].input();
        }
//DOING CALCULATIONS ON EACH CART CONTENTS
        for(int i=0;i<3;i++) {
            cart[i].calculation(i+1);
        }
    }
}

class Cart {
    private int[][] price = new int[2][4];
    private static int max=0;
//TAKING INPUTS OF EACH CART
    public void input() {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++) {
            System.out.println((i==0?"Enter price(s) of non-perishable items":"Enter price(s) of perishable items"));
            for(int j=0;j<4;j++) {
                price[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    
    }
//CALCULATING FOR EACH CART
    public void calculation(int num) {
        int sum=0,pCount=0,maxNp;
        maxNp = price[0][0];
        for(int i=0;i<2;i++) {
            for(int j=0;j<4;j++) {
                sum += price[i][j];

                if (i != 0 && price[1][j] != 0) pCount++;

                if (price[0][j] > maxNp && i != 1) maxNp = price[0][j];
            }
        }
//DISPLAYING THE RESULT OF EACH ITTRATION
        System.out.println("The total cost of cart " + num + " is Rs." + sum);
        System.out.println("There is/are " + pCount + " perishable items in cart " + num + "\n");

        if(max < maxNp) max = maxNp;
        if(num==3) System.out.println("The costliest non-perishable item is for Rs." + max);
    }
}
