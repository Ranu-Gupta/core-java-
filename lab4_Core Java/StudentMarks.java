import java.util.*;


public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define arrays to store marks of English, Maths, and Science

        int[] englishMarks = new int[40];
        int[] mathsMarks = new int[40];
        int[] scienceMarks = new int[40];

        // Calculate and print average marks secured by each student
        System.out.println("Enter marks for English, Math and Science for each student: ");
        for(int i= 0; i<40; i++) {
            System.out.println("Enter marks for student "+(i+1)+":");
            englishMarks[i]=sc.nextInt();
            mathsMarks[i]=sc.nextInt();
            scienceMarks[i]=sc.nextInt();
        }
        // Calculate and print average marks secured by each student
        System.out.println("\nAverage marks of each student: ");
        for(int i =0;i<40;i++) {
            double averageMarks = (englishMarks[i]+mathsMarks[i]+scienceMarks[i])/3.0;
            System.out.println("Student " + (i + 1) + ": " + averageMarks);
        }

        // Calculate and print class average in each subject
        double englishClassAverage = calculateClassAverage(englishMarks);
        double mathsClassAverage = calculateClassAverage(mathsMarks);
        double scienceClassAverage = calculateClassAverage(scienceMarks);

        System.out.println("\nClass average in each subject:");
        System.out.println("English: " + englishClassAverage);
        System.out.println("Maths: " + mathsClassAverage);
        System.out.println("Science: " + scienceClassAverage);

        sc.close();
    }

    // Method to calculate class average for a particular subject
    private static double calculateClassAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 40.0;
    }
}
