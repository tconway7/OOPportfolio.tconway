import java.util.Scanner;

public class MultiSphere {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        Sphere sphere1 = new Sphere(7);
        Sphere sphere2 = new Sphere(11);

        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Sphere 2: " + sphere2 + "\n");

        System.out.print("Enter new, Sphere 1, diameter:");
        double newdiam = scanner.nextDouble();
        sphere1.setDiameter(newdiam);
        System.out.println("Sphere 1: " + sphere1 + "\n");
        
        System.out.print("Enter new, Sphere 2, diameter:");
        double newdiam2 = scanner.nextDouble();
        sphere1.setDiameter(newdiam2);
        System.out.println("Sphere 2: " + sphere2);
    }
}