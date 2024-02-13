import java.util.Scanner;

public class MtoKclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of miles: ");
        double miles = scan.nextDouble();
        
        double kilometers = miles * 1.60935;
        
        System.out.println(miles + " miles is " + kilometers + " in kilometers.");
    }
}