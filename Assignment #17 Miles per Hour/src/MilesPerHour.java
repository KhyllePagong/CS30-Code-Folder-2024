import java.lang.Math;
import java.util.Scanner;
public class MilesPerHour {
    private int distance,minutes,hour;
    private double avg;
    private double time;
    Scanner keybord = new Scanner(System.in);
    public void input (){
        System.out.print("Please input the\nDistance:");
        int distance = keyboard.nextInt();
        System.out.print("Hour:");
        int hour = keyboard.nextInt();
        System.out.print("Minutes: ");
        int minutes = keyboard.nextInt();
    }
    public void calculate(){
        time = hour + (minutes * 60);
        avg = distance / time;
    }
    public void print(){
        System.out.println("The average is "+avg+" miles/hour");
    }

}
