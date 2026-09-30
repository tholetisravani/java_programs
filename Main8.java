class Phone {
    void call() {
        System.out.println("Calling...");
    }
}
class SmartPhone extends Phone {
    void browse() {
        System.out.println("Browsing the internet...");
    }
}
public class Main8 {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.call();    //inherited from Phone
        myPhone.browse();  // own method
    }
}