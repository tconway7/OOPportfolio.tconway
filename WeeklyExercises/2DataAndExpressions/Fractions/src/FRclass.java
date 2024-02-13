import java.util.Scanner;

public class FRclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter numerator: ");
        int numerator = scan.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scan.nextInt();

        System.out.println("Decimal value: " + ((double) numerator / denominator));

    }
}