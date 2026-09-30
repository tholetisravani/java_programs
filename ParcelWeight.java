import java.util.Scanner;
public class ParcelWeight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter parcel weight:" );
            double weight = Double.parseDouble
            (sc.nextLine());
            System.out.println("Weight accepted:"+ weight +"kg");
            }
            catch (NumberFormatException e) {
                System.out.println (
                    "Invalid weight." + "Please enter a number."
                );
            }
            finally {
                System.out.println("Weight checking completed.");
                }
                sc.close();
    }
}