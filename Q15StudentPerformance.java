import java.util.Scanner;

public class Q15StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][4];

        System.out.println("Enter marks for 5 students in 4 subjects:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Student  Total  Average  Grade");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += marks[i][j];
            }

            double avg = (double) total / 4;
            char grade;

            if (avg >= 80) grade = 'A';
            else if (avg >= 60) grade = 'B';
            else if (avg >= 40) grade = 'C';
            else grade = 'F';

            System.out.printf("%-8d %-6d %-8.2f %c%n",
                    i + 1, total, avg, grade);
        }

        sc.close();
    }

}
