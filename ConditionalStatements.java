public class ConditionalStatements {

    public static void main(String[] args) {

        int time = 23;

        if (time >= 5 && time < 12) {
            System.out.println("Good morning");
        } else if (time >= 12 && time < 17) {
            System.out.println("Good afternoon");
        } else if (time >= 17 && time < 21) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }

    }

}
