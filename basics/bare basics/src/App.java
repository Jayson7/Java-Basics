public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int age = 25; // Integer
        double salary = 50000.50; // Double
        char grade = 'A'; // Character
        boolean isJavaFun = true; // Boolean

        // Reference Data Types
        String name = "John Doe"; // String

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        Operators operator = new Operators();
        System.out.println(operator);
    }
}
