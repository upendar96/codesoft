
import java.util.Scanner;
public class number_game
 {
    Scanner sc=new Scanner(System.in);
void guessing_generated_num()
{
     int generated_num=1+(int)(100*Math.random());
     int no_of_attempts=10;
     System.out.println("Welcome to number guessing game!!There are three chances to play game for winning a GIFT");
     System.out.println("Guess the number????????????????");
    for(int i=0;i<=no_of_attempts;i++)
    {
       int guess_num=sc.nextInt();
         if(i>=7)
         {
            System.out.println("you are left with "+(no_of_attempts-i)+ "chances only");
         }
        if(guess_num<generated_num)
        {
            System.out.println("The number you have guessed is less than generated number.");
            System.out.println("enter BIG NUMBER than your guessed number.");
        }
        if(guess_num>generated_num)
        {
            System.out.println("The number you have guessed is greater than generated number.");
            System.out.println("enter SMALL NUMBER than your guessed number.");
           
        }
        if(guess_num==generated_num)
        {
            System.out.println("Yayyyy Congrats!!! Your guessed number is absolutely right...");
            System.out.println("and the number is: "+generated_num);
             if(i<7)
                {
                    System.out.println("You have done a GREAT JOB with "+i+" attempts ");
                    System.out.println("You won the gift ");
                }
             else
                {
                    System.out.println("You have lost the gift as you took more attempts");
                }
             
         break;
        }
        if(i==no_of_attempts)
        {
           System.out.println("Oops..Sorryy...you have lost :( the generated number is: "+generated_num);
            break;
        }
    }
}
public static void main(String []args)
{
 Scanner sc1=new Scanner(System.in);
 number_game obj=new number_game();
  obj.guessing_generated_num();
 for(int i=0;i<=3;i++)
 {
    System.out.println("If you would love to play again....Press 1..If not press 0");
    int chance=sc1.nextInt();
    if(chance==1)
    {
        System.out.println("your another chance is here!!");
        obj.guessing_generated_num();
    }
    else
    {
    System.out.println("thankyou for playing!!!Have a nice day");
    break;
    }
 }
}
}