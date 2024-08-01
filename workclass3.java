import java.util.Scanner;

public class workclass3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("จงกรอกเกรดของเจ้าซะนักศึกษาเอ๋ย");
            double score = scanner.nextDouble();

            String grade = evaluateGrade(score);
            System.out.println("เกรดของเจ้านั้นคือออออ: " + grade);
        } 
    }

    public static String evaluateGrade(double points) {
        if (points >= 80 && points <= 100) {
            return "A";
        } else if (points >= 75 && points < 80) {
            return "B+";
        } else if (points >= 70 && points < 75) {
            return "B";
        } else if (points >= 65 && points < 70) {
            return "C+";
        } else if (points >= 60 && points < 65) {
            return "C";
        } else if (points >= 55 && points < 60) {
            return "D+";
        } else if (points >= 50 && points < 55) {
            return "D";
        } else if (points >= 40 && points < 50) {
            return "F";
        } else {
            return "E";
        }
    }
}