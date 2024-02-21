import java.util.Scanner;
import java.util.Random;

public class Dclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        
        	System.out.print("How many sides does dice one have?: ");
        	int Dice1 = scan.nextInt();
        	System.out.print("How many sides does dice two have?: ");
        	int Dice2 = scan.nextInt();
        	
        Random random = new Random();
        
        int Dice1R1 = random.nextInt(Dice1);
        System.out.print("\n\nDice 1, first roll: " + Dice1R1 + "\n");
        int Dice1R2 = random.nextInt(Dice1);
        System.out.print("Dice 1, second roll: " + Dice1R2 + "\n");
        int Dice1R3 = random.nextInt(Dice1);
        System.out.print("Dice 1, third roll:" + Dice1R3 + "\n\n");
        

        
        int Dice2R1 = random.nextInt(Dice2);
        System.out.print("Dice 2, first roll: " + Dice2R1 + "\n");
        int Dice2R2 = random.nextInt(Dice2);
        System.out.print("Dice 2, second roll: " + Dice2R2 + "\n");
        int Dice2R3 = random.nextInt(Dice2);
        System.out.print("Dice 2, third roll: " + Dice2R3 + "\n\n");
        
        int Dice1Total = Dice1R1 + Dice1R2 + Dice1R3;
        System.out.print("Dice 1, total rolls: " + Dice1Total + "\n");
        int Dice1Average = Dice1Total / 3;
        System.out.print("Dice 1, average roll: " + Dice1Average + "\n");
        
        int Dice2Total = Dice2R1 + Dice2R2 + Dice2R3;
        System.out.print("Dice 2, total rolls: " + Dice2Total + "\n");
        int Dice2Average = Dice2Total / 3;
        System.out.print("Dice 2, average roll: " + Dice2Average + "\n");
	}

}
