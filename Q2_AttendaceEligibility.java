import java.util.Scanner;
    public class Q2_AttendaceEligibility {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Attendance Percentage:");
            double attendance = sc.nextDouble();

            if (attendance >= 75) {
                System.out.println("Elligible for semester exam");
            } else {
                System.out.println("Not elligible for semester exam");
            }
                sc.close();
        }
    }