// CSC262 Programming in JAVA
// Mark Langston     5/9/2024
public class GPA_Converter {

    public static void main(String[] args) {
        // Program Description
        System.out.println("This program will convert a letter grade to it's corresponding");
        System.out.println("letter grade.");
        // Cosmetic line skip
        System.out.println();

        // Allows for letter grade input
        System.out.print("Enter the letter grade: ");
        String letterGrade = System.console().readLine();

        // Converts letter grade to GPA grade
        double gpaGrade = convertToGPA(letterGrade);

        // Displays the GPA grade or error message depending on input
        if (gpaGrade == -1.0) {
            System.out.println("ERROR, You did not enter a valid grade, program terminating!");
        } else {
            System.out.println("GPA grade: " + gpaGrade);
        }
    }

    public static double convertToGPA(String letterGrade) {
        double gpaGrade = -1.0; // Default value for an invalid letter grade

        switch (letterGrade) {
            case "A":
                gpaGrade = 4.0;
                break;
            case "A-":
                gpaGrade = 3.7;
                break;
            case "B+":
                gpaGrade = 3.3;
                break;
            case "B":
                gpaGrade = 3.0;
                break;
            case "B-":
                gpaGrade = 2.7;
                break;
            case "C+":
                gpaGrade = 2.3;
                break;
            case "C":
                gpaGrade = 2.0;
                break;
            case "C-":
                gpaGrade = 1.7;
                break;
            case "D+":
                gpaGrade = 1.3;
                break;
            case "D":
                gpaGrade = 1.0;
                break;
            case "D-":
                gpaGrade = 0.7;
                break;
            case "F":
                gpaGrade = 0.0;
                break;
            default:
                break;
        }

        return gpaGrade;
    }
}

