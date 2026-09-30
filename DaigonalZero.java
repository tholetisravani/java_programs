public class DaigonalZero {
    public static void main(String[] args) {

        int[][] matrix = {
            {0, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 0, 12},
            {13, 14, 15, 0}
        };

        // Print the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
