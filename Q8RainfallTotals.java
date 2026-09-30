import java.util.Scanner;

public class Q8RainfallTotals {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rain = new int[3][4];

        System.out.println("Enter rainfall for 3 cities and 4 months:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                rain[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) sum += rain[i][j];
            System.out.println("City " + (i + 1) + " total = " + sum);
        }

        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) sum += rain[i][j];
            System.out.println("Month " + (j + 1) + " total = " + sum);
        }

        sc.close();
    }

}
