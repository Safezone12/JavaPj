import java.util.Scanner;

public class workclass7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("จงกรอกเกรดของเจ้าซะนักศึกษาเอ๋ย");
            double score = scanner.nextDouble();
            
            String grade = evaluateGrade(score);
            System.out.println("เกรดของเจ้านั้นคือออออ: " + grade);
        }
    }

    public static String evaluateGrade(double points) {
        if (isA(points)) {
            return "A";
        } else if (isBPlus(points)) {
            return "B+";
        } else if (isB(points)) {
            return "B";
        } else if (isCPlus(points)) {
            return "C+";
        } else if (isC(points)) {
            return "C";
        } else if (isDPlus(points)) {
            return "D+";
        } else if (isD(points)) {
            return "D";
        } else if (isF(points)) {
            return "F";
        } else {
            return "E";
        }
    }

    public static boolean isA(double points) {
        return points >= 80 && points <= 100;
    }

    public static boolean isBPlus(double points) {
        return points >= 75 && points < 80;
    }

    public static boolean isB(double points) {
        return points >= 70 && points < 75;
    }

    public static boolean isCPlus(double points) {
        return points >= 65 && points < 70;
    }

    public static boolean isC(double points) {
        return points >= 60 && points < 65;
    }

    public static boolean isDPlus(double points) {
        return points >= 55 && points < 60;
    }

    public static boolean isD(double points) {
        return points >= 50 && points < 55;
    }

    public static boolean isF(double points) {
        return points >= 40 && points < 50;
    }
}