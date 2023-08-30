//Importing Required java classes
import java.lang.Math;
import java.util.Scanner;

//MAIN CLASS
public class ShapeTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TAKING SIDE AS A INPUT
        System.out.print("Enter value of side/radius: ");
        int side= sc.nextInt();
        // CREATING OBJECTS OF EACH SHAPE
        Shape circle = new Circle(side);
        Shape triangle = new Triangle(side);
        Shape pentagon = new Pentagon(side);

        //PRINTING THE DETAILS OF EACH SHAPE
        System.out.println("The details of the Circle are as follows:");
        System.out.printf("Area of the Circle: %.2f\n",circle.getArea());
        System.out.printf("Perimeter of the Circle: %.2f\n",circle.getPerimeter());
        System.out.printf("Radius of the Circle: %.2f\n",circle.getSide());
        System.out.println();

        System.out.println("The details of the Triangle are as follows:");
        System.out.printf("Area of the Triangle: %.2f\n",triangle.getArea());
        System.out.printf("Perimeter of the Triangle: %.2f\n",triangle.getPerimeter());
        System.out.printf("Side of the Triangle: %.2f\n",triangle.getSide());
        System.out.println();

        System.out.println("The details of the Pentagon are as follows:");
        System.out.printf("Area of the Pentagon: %.2f\n",pentagon.getArea());
        System.out.printf("Perimeter of the Pentagon: %.2f\n",pentagon.getPerimeter());
        System.out.printf("Side of the Pentagon: %.2f\n",pentagon.getSide());
        sc.close();
    }
}
//PARENT CLASS
class Shape{
    public double getArea(){
        return 0;
    }
    public  double getPerimeter(){
        return 0;
    }
    public  double getSide(){
        return 0;
    }
}

//DERIVED CLASS
class Circle extends Shape{
    private int r;
    public Circle(int r){
        this.r=r;
    }

    //OVERRIDEN METHORDS
    @Override
    public double getArea(){
        return Math.PI*r*r;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*r*2;
    }
    @Override
    public double getSide(){
        return r;
    }
}

//DERIVED CLASS
class Triangle extends Shape{
    private int side;
    public Triangle(int side){
        this.side=side;
    }

    //OVERRIDEN METHORDS
    @Override
    public double getArea(){
        return Math.sqrt(3)*0.5*side*side;
    }
    @Override
    public double getPerimeter(){
        return 3*side;
    }
    @Override
    public double getSide(){
        return side;
    }

}

//DERIVED CLASS
class Pentagon extends Shape{
    private int side;
    public Pentagon(int side){
        this.side=side;
    }

    //OVERRIDEN METHORDS
    @Override
    public double getArea(){
        return side*side*0.25*Math.sqrt(5*(5+2*Math.sqrt(5)));
    }
    @Override
    public double getPerimeter(){
        return 5*side;
    }
    @Override
    public double getSide(){
        return side;
    }
}