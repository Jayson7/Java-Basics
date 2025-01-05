import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Input: Get marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total, average, and grade
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output: Display results
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
