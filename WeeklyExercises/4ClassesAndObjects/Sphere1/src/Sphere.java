import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sphere radius:");
        double radius = scanner.nextDouble();

        scanner.close();

        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

        double SurfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        String pattern = "###0.####";
        DecimalFormat decfmt = new DecimalFormat(pattern);

        System.out.printf("Volume: " + decfmt.format(volume) + "\n");
        System.out.printf("Surface area: " + decfmt.format(SurfaceArea));
    }
}