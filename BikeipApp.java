import java.util.Scanner;
class Bikeip {

    int engno;
    String brand;
    String color;
    float cost;
    
    void start(){
        System.out.println("bike is starting");
       
    }
    void stop(){
       System.out.println("bike is stop");
    }
    
}
 class BikeipApp {
    public static void main(String[]args)
    {
       Bikeip b = new Bikeip();
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter the EngNo : ");
       b.engno = scan.nextInt();
       System.out.println("Enter the brand : ");
       b.brand = scan.next();
       System.out.println("Enter the color : ");
       b.color = scan.next();
       System.out.println("Enter the cost : ");
       b.cost = scan.nextFloat();
       System.out.println("bike engno " +b.engno);
       System.out.println("bike brand is " +b.brand);
       System.out.println("bike color is " +b.color);
       System.out.println("bike cost is " +b.cost);
     
     
    }
}

