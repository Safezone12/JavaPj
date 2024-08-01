
public class workclass13 {
    public static void main(String[] args) {
    	
        int score = 76;
        String grade="Test";
        System.out.println("__Calc_Grade__");
        System.out.println("Score is :> "+score );

        if ((score >= 80)&&(score <= 100)) {
            grade = "A";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        } 
        else if ((score >= 75)&&(score <= 79)) {
            grade = "B+";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        } 
        else if ((score >= 70)&&(score <= 74)) {
            grade = "B";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        } 
        else if ((score >= 65)&&(score <= 69)) {
            grade = "C+";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        } 
        else if ((score >= 60)&&(score <= 64)) {
            grade = "C";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        }
        else if ((score >= 55)&&(score <= 59)) {
            grade = "D+";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        }
        else if ((score >= 50)&&(score <= 54)) {
            grade = "D";
            System.out.println("score : "+score +"|"+"grade:> "+grade+"|");
            System.out.println("-------------------");
        }
        else {
            grade = "E";
            System.out.println("คะแนนไม่ผ่าน | " +score + " | " + grade);
            System.out.println("-------------------");
        }
        System.out.println("Grade = " + grade);	 
        System.out.println("-------------------");
	    	
    }
}