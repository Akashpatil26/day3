public class Monthwage {
    public static void main(String[] args) {
        int workdays =20;
        int workhrs = 8;
        int wagehr = 20;
        int dailywage = workhrs*wagehr;
        System.out.println(dailywage);
        int monthlywage = dailywage*workdays;
        System.out.println(monthlywage+ "is the monthly wage");
    }
}
