/*Consider two interfaces, Volume and SurfaceArea with methods getVolume() and getSurfaceArea() 
respectively. Class ‘Cylinder’ implements both Volume and SurfaceArea and implements their methods. 
The class contains their required dimensions as data members.
Write a program which inputs its dimensions and prints its volume and surface area. */
//IMPORTING REQUIRED JAVA CLASSES
import java.lang.Math;
import java.util.Scanner;

//MAKING REQUIRED INFERFACES 
interface Volume
{
    double getVolume();
}
interface SurfaceArea
{
    double getSurfaceArea();
}
//CLASS IMPLEMENTING THE ABOVE INTERFACES
class Cylinder implements Volume,SurfaceArea
{
    double r,l;
    //CONSTRUCTOR
    Cylinder(double r,double l)
    {
        this.r=r;
        this.l=l;
    }
    public double getVolume()
    {
        return Math.PI*r*r*l;
    }
    public double getSurfaceArea()
    {
        return (Math.PI*r*l*2 + Math.PI*r*r*2);
    }
}
//MAIN CLASS
public class VolumeArea
{    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        double r,l;
        //TAKING THE DIMENTIONS OF THE CYLINDER AS INPUT
        System.out.print("Enter the Radius of the cylinder: ");
        r=sc.nextInt();
        System.out.print("Enter the Height of the cylinder: ");
        l=sc.nextInt();
        //MAKING AN OBJECT OF THE CYLINDER CLASS
        Cylinder c= new Cylinder(r,l);
        //DISPLAY THE OUTPUT
        System.out.printf("------------------OUTPUT-------------------\n");
        System.out.printf("The Surface area of the Cylinder is: %.2f\n",c.getSurfaceArea());
        System.out.printf("The Volume of the Cylinder is: %.2f",c.getVolume());
        sc.close();
        }
}