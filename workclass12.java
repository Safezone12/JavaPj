import java.util.Scanner;

public class workclass12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("กรอกคะแนน (0-100): ");
            int score = sc.nextInt();
            
            String grade; 

            if (score < 0 || score > 100) {
                System.out.println("คะแนนต้องอยู่ในช่วง 0-100");
                return; 
            }

            
            if (score >= 80) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B+";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 65) {
                grade = "C+";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 55) {
                grade = "D+";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "E";
                System.out.println("================");
                System.out.println("Grade: " + grade + " | Grade not pass");
                System.out.println("================");
                return; 
            }

            
            System.out.println("================");
            System.out.println("Grade: " + grade);
            System.out.println("================");
        }
    }
}