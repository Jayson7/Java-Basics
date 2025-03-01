import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("you are " + age + "years old");

        scanner.close();
    }
}
