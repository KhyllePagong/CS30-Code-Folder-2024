import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHourRunner{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
        for (int i = 0; i < 3;i++){
            System.out.print("Enter the distance :: ");
            int dist = keyboard.nextInt();
    
            System.out.print("Enter the hours :: ");
            int hrs = keyboard.nextInt();
    
            System.out.print("Enter the minutes :: ");
            int mins = keyboard.nextInt();
    
            MilesPerHour test = new MilesPerHour(dist, hrs, mins);
            test.calcMPH();
            test.print();
    
    
    
            test.setNums(0,0,0);
            System.out.print("Enter the distance :: ");
            dist = keyboard.nextInt();
    
            System.out.print("Enter the hours :: ");
            hrs = keyboard.nextInt();
    
            System.out.print("Enter the minutes :: ");
            mins = keyboard.nextInt();
    
            test.setNums(dist, hrs, mins);
            test.calcMPH();
            test.print();
        }

	}
}