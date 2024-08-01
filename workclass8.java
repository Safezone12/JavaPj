import java.util.Scanner;

public class workclass8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("กรอกเกรดมาาาาาาา");
            double score = scanner.nextDouble();
           
            String grade = evaluateGrade(score);
            System.out.println("เกรดของแกที่ได้ในเททอมนี้นั้นคือออออ: " + grade);
        }
    }

    public static String evaluateGrade(double points) {
        if (isBetween(points, 80, 100)) {
            return "A";
        } else if (isBetween(points, 75, 79.99)) {
            return "B+";
        } else if (isBetween(points, 70, 74.99)) {
            return "B";
        } else if (isBetween(points, 65, 69.99)) {
            return "C+";
        } else if (isBetween(points, 60, 64.99)) {
            return "C";
        } else if (isBetween(points, 55, 59.99)) {
            return "D+";
        } else if (isBetween(points, 50, 54.99)) {
            return "D";
        } else if (isBetween(points, 40, 49.99)) {
            return "F";
        } else {
            return "E";
        }
    }

    public static boolean isBetween(double points, double min, double max) {
        return points >= min && points <= max;
    }
}