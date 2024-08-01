public class workclass11 {
    public static void main(String[] args) {
        int score = 30;
        String grade = getGrade(score);
        System.out.println("Score: " + score + ", Grade: " + grade);
    }

    public static String getGrade(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 75 && score < 79) {
            return "B+";
        } else if (score >= 70 && score < 75) {
            return "B";
        } else if (score >= 65 && score < 70) {
            return "C+";
        } else if (score >= 60 && score < 65) {
            return "C";
        } else if (score >= 55 && score < 60) {
            return "D+";
        } else if (score >= 50 && score < 55) {
            return "D";
        } else if (score >= 40 && score < 49) {
            return "F";
        } else {
            return "E";
        }
    }
}