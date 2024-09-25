import java.util.Scanner;

public class StudentManagementSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] student = new student[5];

        for(int i=0; i<student.length; i++){
			System.out.print("Enter the name  " + (i+1) + " : "); 
            String name = sc.nextLine();
            System.out.println("Enter Score for Math");
            String[] Score = sc.nextLine().split(" ");
            int [] scores = new int[3];
            for (int k=0;k<scores.length; k++){
                scores[k] = Integer.parseInt(Score);
            }
            student[i] = new student(name,scores);

            System.out.println("Name " + student.getName());
            System.out.print("Average Score: ");
            student.calculateAverage();
            System.out.print("Grade: ");
            student.assignGrade();
        
    
        }
    }
}
    

    class student{
        public int length;
        public Object setScores;
        private String name;
        private int[] scores;
        private double avgScores =0.0;

        public student(String name, int[] scores){
            this.name =name;
            this.scores =scores;
        }


        public String getName(){
            return name;

        }
        public void setName(String name){
            this.name =name;
        }
        public int[] getScores(){
            return scores;

        }
        public void setScores(int[] scores){
            this.scores =scores;
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

            if (avgScores >90){
                System.out.println("A");
            }
            else if (avgScores >90 && avgScores<79){
                System.out.println("B");
            }
            else if (avgScores >80 && avgScores<69){
                System.out.println("C");
            }
            else if (avgScores >70 && avgScores<59){
                System.out.println("D");
            }  
            else if (avgScores<60){
                System.out.println("F");
            }
    
    
        }
    }






