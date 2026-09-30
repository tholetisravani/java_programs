import java.util.Scanner;

public class Q14RectangularMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[3][2];
        int[][] c = new int[2][2];

        System.out.println("Enter Matrix A (2x3):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B (3x2):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("A x B (2x2):");
        for (int[] row : c) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }

}
