import java.time.LocalTime; // Import Java's time module

public class time_greeting {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now(); // Get the current system time
        int hour = currentTime.getHour(); // Extract the hour (24-hour format)

        System.out.println("Current Time: " + currentTime);

        if (hour >= 5 && hour < 12) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good afternoon");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }

}
