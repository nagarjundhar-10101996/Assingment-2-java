import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.print("Enter the x axis :");
    double x = sc.nextDouble();
    System.out.print("Enter the y axis :"); 
    double y = sc.nextDouble();
    if(x == 0)
    {
        System.out.println("Y axis"); 
    }else if(y == 0)
    {
        System.out.println("X axis"); 
    }
    else
    {
        if(x > 0 && y > 0)
        {
            System.out.println("Q1"); 
        }
        else if(x < 0 && y < 0)
        {
            System.out.println("Q3"); 
        }
        else if(x > 0 && y < 0)
        {
            System.out.println("Q4"); 
        }
        else if(x < 0 && y > 0)
        {
            System.out.println("Q2"); 
        }
    }

    }
    
}
