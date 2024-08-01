import java.util.Scanner;

public class workclass4 {
    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("กรอกเลขคะแนนของเจ้าามา เดี๋ยวข้าจะแปลงเป็นเกรดให้");
            double studentScore = inputScanner.nextDouble();

            String studentGrade = calculateGrade(studentScore);
            System.out.println("เกรดของคุณคือ: " + studentGrade);
        }
    }

    public static String calculateGrade(double score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 75 && score < 80) {
            return "B+";
        } else if (score >=70 && score < 75) {
            return "B";
        } else if (score > 65 && score < 70) {
            return "C+";
        } else if (score > 60 && score < 65) {
            return "C";
        } else if (score > 55 && score < 60) {
            return "D+";
        } else if (score > 50 && score < 55) {
            return "D";
        } else if (score > 40 && score < 50) {
            return "F";
        } else {
            return "E";
        }
    }
}