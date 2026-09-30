public class DayName {
    public static void main(String[] args) {
        int day = 4;
        String name;
        name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
            System.out.println("Day: " + name);
    }
}
