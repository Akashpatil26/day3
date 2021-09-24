public class Attendance {
        public static void main(String[] args) {
                int IsFullTime = 1;
                double EmpCheck = Math.floor(Math.random() *10) % 2;
                if (EmpCheck==IsFullTime)
                        System.out.println("Emplyoee is present");
                else
                        System.out.println("Emplyoee is absent");
        }
}
