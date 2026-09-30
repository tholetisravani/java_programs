import java.util.Scanner;
public class SmartLocker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter locker number:");
        int LockerNumber = sc.nextInt();

        System.out.print("Enter student ID:");
        String StudentID = sc.next();

        System.out.print("Enter student name:");
        String StudentName = sc.next();

        System.out.print("Enter access pin:");
        String AccessPin = sc.next();

        System.out.print("Is locker available? (true/false):");
        boolean IsLockerAvailable = sc.nextBoolean();

        System.out.println("\nLocker Number:" + LockerNumber);
        System.out.println("StudentID:" + StudentID);
        System.out.println("Student Name:" + StudentName);
        System.out.println("Access Pin:" + AccessPin);
        System.out.println("Is Locker Available?:" + IsLockerAvailable);

        sc.close();
        
    }
}