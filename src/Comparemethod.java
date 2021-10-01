import java.util.Scanner;

public class Comparemethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p1 = scan.nextDouble();
        double p2 = scan.nextDouble();
        double q1 = scan.nextDouble();
        double q2 = scan.nextDouble();

        double r1 = scan.nextDouble();
        double r2 = scan.nextDouble();
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();

        Double d1=Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));
        Double d2=Math.sqrt(Math.pow(r2 - r1, 2) + Math.pow(s2 - s1, 2));
        if (Double.compare(d1, d2) == 0) {

            System.out.println("d1=d2");
        }
        else if (Double.compare(d1, d2) < 0) {

            System.out.println("d1<d2");
        }
        else {

            System.out.println("d1>d2");
        }
    }
}
