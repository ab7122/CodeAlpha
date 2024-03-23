import java.util.*;

public class Task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter The Grades For Each Student (Enter -1 to Finish)");
        while(true){
            System.out.print("Enter The Grade : ");
            int grade = sc.nextInt();
            if(grade == -1){
                break;
            }
            grades.add(grade);
        }
        if(grades.isEmpty()){
            System.out.println("No Grade Entered.  Existing. ");
            return; 
        }
        //calculate sum, highest ,and Lowest Grades
        int sum=0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for(int grade : grades){
            sum = sum + grade;
            if(grade > highest){
                highest = grade;
            }
            if(grade < lowest){
                lowest = grade;
            }
        }

        double average = (double) sum/grades.size();
        System.out.println("Grades Entered: " + grades);
        System.out.println("Average: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

    }
}
