import java.util.Scanner;

public class workclass2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("โปรดกรอกผลการเรียนนักศึกษา");
            double score = scanner.nextDouble();
            
            String grade = classifyGrade(score);
            System.out.println("เกรดของคุณคือ: " + grade);
        }
    }

    public static String classifyGrade(double score) {
        String grade;
        if (score > 79) {
            grade = "A";
        } else if (score > 74) {
            grade = "B+";
        } else if (score > 69) {
            grade = "B";
        } else if (score > 64) {
            grade = "C+";
        } else if (score > 59) {
            grade = "C";
        } else if (score > 54) {
            grade = "D+";
        } else if (score > 49) {
            grade = "D";
        } else {
            grade = "E";
        }
        return grade;
    }
}