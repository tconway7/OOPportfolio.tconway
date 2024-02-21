import java.util.Random;
import java.util.Scanner;

public class Pin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a pin (4 digits): ");
		int pinN0 = scan.nextInt();
        String pininhex = Integer.toHexString(pinN0);
        
        Random random = new Random();
        int rand1 = random.nextInt(64536) + 1000;
        int rand2 = random.nextInt(64536) + 1000;
        
        String pinencrypt = Integer.toHexString(rand1) + pininhex + Integer.toHexString(rand2);
        System.out.println("Your encrypted pin number is " + pinencrypt);

    }

}
