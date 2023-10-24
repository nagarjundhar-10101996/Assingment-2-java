import java.util.Scanner;

class Test1
{
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Angle : ");
    double n  = sc.nextDouble();
    double x = n*(Math.PI/180);
    int m = -1;
    long b = 1;
    double a = 1, sum =1;
    for (int i = 1; i < 20; ++i) {
        a = a*x;
        b = b*i;
        if(i%2==0)
        {
            sum+=a/b*m;
            m = -m;
        }
    }
    System.out.printf("cos (%.1f%c) = %.3f" , n ,'\u00B0',sum);

   } 

   
   
}