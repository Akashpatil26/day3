import java.util.Scanner;

public class Conditionwage {

    private static void calculatingEmplyoeeWage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter days: ");
        int days =sc.nextInt();
        int wage = hours*days;
        if ( hours <100 && days <20 )
            //return wage;
            System.out.println("The total wage is "+wage);
        else if (hours>100 && days <20 )
            System.out.println("Invalid :Hours is more than 100");
        else if (hours<100 && days >20 )
            System.out.println("Invalid :Days is more than 20");
        else
            System.out.println("Enter valid details");

    }
    public static void main(String[] args) {
        calculatingEmplyoeeWage();



    }




}
