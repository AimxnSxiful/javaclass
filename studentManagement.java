class Student{
    private String name;
    private int[] scores;
    private double avgScores = 0.0;

    public Student(String name, int[] scores, double avgScores){
        this.name = name;
        this.scores = scores;
        this.avgScores = avgScores;
    }

    public String getName(){
        return name;
    }
    public int[] getScores(){
        return scores;
    }
    public double getAvgScores(){
        return avgScores;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setScores(int[] scores){
        this.scores = scores;
    }
    public void setAvgScores(double avgScores){
        this.avgScores = avgScores;
    }

    public void calculateAverage(){
        double Scores = 0;
        for(int i=0; i<scores.length; i++){
            Scores = Scores + scores[i];
        }
        avgScores = Scores / 3;
        System.out.println(avgScores);
    }

    public void assignGrade(){
        String grade = " ";

        if(avgScores>89){
            grade = "A";
        }else if(avgScores>79 && avgScores<90){
            grade = "B";
        }else if(avgScores>69 && avgScores<80){
            grade = "C";
        }else if(avgScores>59 && avgScores<70){
            grade = "D";
        }else if(avgScores<61){
            grade = "F";
        }
        System.out.println(grade);
    }

}

public class studentManagement {
    public static void main(String[] args) {

        int[][] scores= {
            {68, 77, 50},
            {55, 88, 67},
            {25, 45, 62},
            {96, 66, 70},
            {80, 72, 79},
        };

        String[] studName = {"Anas", "Luqman", "Anep", "Didi", "Syera"};

        Student student = new Student(null, null, 0);

        for(int row=0; row<scores.length; row++){
            student.setScores(scores[row]);
            student.setName(studName[row]);
            String subject = " ";

            System.out.println("Name " + student.getName());

            for(int col=0; col<scores[row].length; col++){
                int[] s = student.getScores();

                if(col == 0){
                    subject = "Math ";
                }else if(col == 1){
                    subject = "Science ";
                }
                else if(col == 2){
                    subject = "English ";
                }

                System.out.println(subject + s[col]);
            }
            System.out.print("Average Score: ");
            student.calculateAverage();
            System.out.print("Grade: ");
            student.assignGrade();
            System.out.println("-------------------------------");
        }
    }
}