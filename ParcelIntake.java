import java.util.Scanner;
public class ParcelIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String recipient = sc.next();
        char size = sc.next().charAt(0);
        double weight = sc.nextDouble();
   //storage fee = size base + weight surchage (arithmetic + casting)
   // int base = (size== 'L') ? 30 : (size== "M") ? 20 : 10;
   // int surcharge = (int) Math.ceil(weight) * 2; // Rs 2 per rounded-up kg
   // int fee = base + surcharge;
    System.out.printf("Parcel: %s (%s)%n" , id , recipient);
    System.out.printf("Size: %c")



    }
}