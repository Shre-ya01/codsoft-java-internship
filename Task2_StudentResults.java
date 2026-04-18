import java.util.Scanner;

public class Task2_StudentResults {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int subjects;
        int sum = 0;

        System.out.print("Enter total number of subjects: ");
        subjects = input.nextInt();

        int marks[] = new int[subjects];

        // Input marks with validation
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; // repeat same subject
                continue;
            }

            sum += marks[i];
        }

        // Calculate average
        double avg = (double) sum / subjects;

        // Grade calculation
        String result;

        if (avg >= 90) {
            result = "Excellent (Grade A)";
        } else if (avg >= 75) {
            result = "Very Good (Grade B)";
        } else if (avg >= 60) {
            result = "Good (Grade C)";
        } else if (avg >= 50) {
            result = "Average (Grade D)";
        } else {
            result = "Fail (Grade F)";
        }

        // Display output
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + avg);
        System.out.println("Final Result: " + result);

        input.close();
    }
}