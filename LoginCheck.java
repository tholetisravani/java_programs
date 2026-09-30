public class LoginCheck {
  public static void main(String[] args) {
    String user = "admin";
    int pin = 4521;
    if (user.equals("admin")) {
      if (pin == 4521) {
        System.out.println("Access granted");
      } else {
        System.out.println("Wrong PIN.");
      if (pin == 1234) {
          } else {
          System.out.println("Not granted.");
        }
      }
    }
  }
}