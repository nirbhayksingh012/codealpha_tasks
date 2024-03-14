import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store students' grades
        ArrayList<Integer> grades = new ArrayList<>();

        // Get the number of students from the teacher
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input grades for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate and display average, highest, and lowest scores
        if (!grades.isEmpty()) {
            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } else {
            System.out.println("No grades entered. Exiting program.");
        }

        scanner.close();
    }

    // Method to calculate the average of grades
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest grade
    private static int findHighest(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    // Method to find the lowest grade
    private static int findLowest(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}
