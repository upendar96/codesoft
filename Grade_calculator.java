
import java.util.Scanner;
public class Grade_calculator {
    Scanner sc=new Scanner(System.in);
   String meth(){
    //asking  the user to enter the number of students
    System.out.println("enter the number of subjects");
   int no_of_Subjects=sc.nextInt();
    System.out.println("enter the Student marks of " +no_of_Subjects+ " subjects");
    int marks[]=new int[no_of_Subjects];
    int sum_of_totalmarks=0;
    for(int i=0;i<marks.length;i++){
        //asking the user to enter the marks obtained by student one by one
       marks[i]=sc.nextInt();
        //Calculating the sum of total marks obtained by student in all the subjects
       sum_of_totalmarks+=marks[i];
    }
    System.out.println("The total marks obtained are:"+sum_of_totalmarks);
    //Calculating the average percentage  of marks student obtained
    int avg_percentage=(sum_of_totalmarks/no_of_Subjects);
    System.out.println("The average percentage marks obtained are:"+avg_percentage+"%");
    //Assigning grades based on the average percentage obtained
    if(avg_percentage>=95)
      return "A+";
    else if(avg_percentage>=80 && avg_percentage<95)
    return "A";
    else if(avg_percentage>=70 && avg_percentage<80)
    return "B+";
    else if(avg_percentage>=65 && avg_percentage<70)
    return "B";
    else if(avg_percentage>=60 && avg_percentage<65)
    return "C";
    else
      return "F";
    }
     public static void main(String[] args){
      String Grade=new Grade_calculator().meth();
      System.out.println("Grade:"+Grade);
}
    
}