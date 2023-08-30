/*Write a program to calculate the area of 4 rectangles, 5 squares and  2 circles.
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea'
is its side and that of 'CircleArea' is its radius.
Now create another class 'Area' containing all the three methods 'RectangleArea', '
SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.*/
import java.lang.Math;
import java.util.Scanner;
public class MultiShape
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Area [] area = new Area[11];
   double [] opsr = new double [11];
   for(int i =0 ;i<11;i++){
       if(i<4){
           System.out.printf("\nEnter the Lenght and breath of the %d Rectangle: ",i+1);
           int l=sc.nextInt();
           int b=sc.nextInt();
           area [i]=new Area();
           opsr[i]=area[i].RectangleArea(l,b);
       }
       else if(i<9){
           System.out.printf("\nEnter the side of the %d Square: ",i+1-4);
           int s=sc.nextInt();
           area[i]=new Area();
           opsr[i]=area[i].SquareArea(s);
       }
       else{
           System.out.printf("\nEnter the radius of the %d Circle: ",i+1-9);
           int r=sc.nextInt();
           area [i]=new Area();
           opsr[i]=area[i].CircleArea(r);
       }
   }
   System.out.printf("\n\n");
   for(int i =0 ;i<11;i++){
       if(i<4){
           System.out.printf("The area of the %d Rectangle is: %.2f\n",i+1,opsr[i]);
           
       }
       else if(i<9){
           System.out.printf("The Area of the %d Square: %.2f\n",i+1,opsr[i]);
           
       }
       else{
           System.out.printf("The area of the %d Circle: %.2f\n",i+1,opsr[i]);
     
       }
   }
}
}
abstract class Shape{
    abstract int RectangleArea(int l,int b);
    abstract int SquareArea(int s);
    abstract double CircleArea(int r);
}
class Area extends Shape{
    public int RectangleArea(int l, int b){
        return l*b;
    }
    public int SquareArea(int s){
        return s*s;
    }
    public double CircleArea(int r){
        return Math.PI*r*r;
    }
}
