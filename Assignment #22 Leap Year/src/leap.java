import java.lang.Math;
import java.util.Scanner;

public class leap {
    Scanner keyboard = new Scanner (System.in);
    private int year;
    public void input(){
        System.out.print("Enter a year:: ");
        year = keyboard.nextInt();
    }
    public void check(){
        if (year % 400 == 0){
            System.out.println(year +" is a leap year");
        }
        else if (year % 100==0){
            System.out.println(year +" is not a leap year");
        }
        else{
            if (year%4==0){
                System.out.println(year +" is a leap year");
            }
            else {
                System.out.println(year+ " is not a leap year");
            }
        }

    }
}
