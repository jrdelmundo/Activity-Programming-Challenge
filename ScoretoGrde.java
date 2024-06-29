public class ScoretoGrde{
    public static String convertScoreToGrade(int score){
        if(score >= 90 && score <= 100 ){
            return "A";
        }else if(score >= 80 && score < 90){
            return "B";
        }else if(score >= 70 && score < 80){
            return "C";
        }else  if(score >= 60 && score < 70){
            return "D";
        }else if(score >= 0 && score < 60){
            return "F";
        }else{
            return "Invalid score";
        }

    }

    public static void main(String[] args) {
        
        int[] scores = {95, 82, 74, 60, 55, -1, 105};

        for (int score : scores) {
            System.out.println("Score: " + score + " -> Grade: " + convertScoreToGrade(score));
        }
    }
}

