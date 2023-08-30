/*Take input of a 2D array of 3 regions and for 3 days making a 3X3 matrix.
Print the Hottest and Coldest day of each region and Throughout the matrix */
//IMPORTING REQUIRED JAVA CLASSES
import java.util.Scanner;
//MAIN CLASS
public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//TAKING INPUT OF EACH REGION ONE BY ONE
        int[][] region_temp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter the temp of region %d day %d:", i + 1, j + 1);
                region_temp[i][j] = sc.nextInt();
            }
            System.out.println();
        }
//DISPLAYING THE TABULATED DATA
        System.out.printf("%6s|City 1|City 2|City 3|\n","");
            for(int i=0; i<3; i++) {
               System.out.printf("Day %-2d|",i+1);
               for(int j=0; j<3; j++) {
                  System.out.printf("%4d°C|", region_temp[j][i]);
               }
               System.out.println();
            }
            System.out.println();
         
//CALLING EACH METHORD AND ASSIGING THERE RETUN VALUES TO VARIABLES     
        int OverAllMax = MaxOverall(region_temp);
        System.out.printf("\nThe maximum temprature among all the 3 regions is %d", OverAllMax);
        int OverAllMin = MinOverall(region_temp);
        System.out.printf("\nThe minimum temprature among all the 3 regions is %d", OverAllMin);
        MaxEach(region_temp);
        sc.close();
    }
//METHORD TO CALCULATE THE HOTTEST DAY IN ALL THE REGIONS
    public static int MaxOverall(int region_temp[][]) {
        int temp = region_temp[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (temp < region_temp[j][i])
                    temp = region_temp[j][i];
            }
        }
        return temp;
    }
//METHORD TO CALCULATE THE COLDEST DAY IN ALL THE REGIONS
    public static int MinOverall(int region_temp[][]) {
        int temp = region_temp[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (temp > region_temp[j][i])
                    temp = region_temp[j][i];
            }
        }
        return temp;
    }
//METHORD TO CALCULATE THE HOTTEST AND COLDEST DAY IN EACH OF THE REGIONS
    public static void MaxEach(int region_temp[][]){
		int [] max= new int[3];
        int [] min= new int[3];
		int temp;
		for(int i=0;i<3;i++){
		 temp=region_temp[i][0];
			for(int j=0;j<3;j++){
				if(temp<region_temp[i][j])
				temp=region_temp[i][j];
				}
			max[i]=temp;	
		}
        for(int i=0;i<3;i++){
            temp=region_temp[i][0];
               for(int j=0;j<3;j++){
                   if(temp>region_temp[i][j])
                   temp=region_temp[i][j];
                   }
               min[i]=temp;	
           }
		for(int i=0;i<3;i++){
		System.out.printf("\nThe minimum temprature of region %d is %d",i+1,min[i]);
		System.out.printf("\nThe maximum temprature of region %d is %d",i+1,max[i]);
        }
	}
}