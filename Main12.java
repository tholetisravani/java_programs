import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85) return fee * 0.20;
        if (marks >= 70) return fee * 0.10;
        return 0;
    }

    double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: " + calculateFee());
        System.out.println("Scholarship: " + calculateScholarship());
        System.out.println("Final Fee: " + calculateFinalFee());
    }
}

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for course registration.");
        }

        sc.close();
    }
}
