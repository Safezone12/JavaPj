import java.util.Scanner;

public class workclass10 {
    public static void main(String[] args) {
        
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("กรอกเลขคะแนนของเจ้าามา เดี๋ยวข้าจะแปลงเป็นเกรดให้");
            double studentScore = inputScanner.nextDouble();
           
            String studentGrade = calculateGrade(studentScore);
            System.out.println("เกรดของคุณคือ: " + studentGrade);
        }
    }

    public static String calculateGrade(double score) {
        if (isA(score)) {
            return "A";
        } else if (isBPlus(score)) {
            return "B+";
        } else if (isB(score)) {
            return "B";
        } else if (isCPlus(score)) {
            return "C+";
        } else if (isC(score)) {
            return "C";
        } else if (isDPlus(score)) {
            return "D+";
        } else if (isD(score)) {
            return "D";
        } else if (isF(score)) {
            return "F";
        } else {
            return "E";
        }
    }

    public static boolean isA(double score) {
        return score >= 80 && score <= 100;
    }

    public static boolean isBPlus(double score) {
        return score >= 75 && score < 80;
    }

    public static boolean isB(double score) {
        return score >= 70 && score < 75;
    }

    public static boolean isCPlus(double score) {
        return score >= 65 && score < 70;
    }

    public static boolean isC(double score) {
        return score >= 60 && score < 65;
    }

    public static boolean isDPlus(double score) {
        return score >= 55 && score < 60;
    }

    public static boolean isD(double score) {
        return score >= 50 && score < 55;
    }

    public static boolean isF(double score) {
        return score >= 40 && score < 50;
    }
}