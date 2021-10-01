import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates : ");
        //Line 1
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance1);
        //Line 2
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double distance2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println(distance2);


        Double line1= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double line2= Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        if (line1.equals(line2)) {
            System.out.println("Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");
        }
    }
}
