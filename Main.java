public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // Store numbers from 1 to 10
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }

        // Print the array in a single row
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}