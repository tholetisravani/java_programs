import java.util.Scanner;

public class Q12AttendanceAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        System.out.println("Enter Matrix A (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B (3x3):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("Combined attendance matrix:");
        for (int[] row : c) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }

}
 