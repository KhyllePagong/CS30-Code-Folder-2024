import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph,time;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
        distance=dist;
        hours = hrs;
        minutes=mins;

	}

	public void setNums(int dist, int hrs, int mins)
	{
        distance=dist;
        hours = hrs;
        minutes=mins;
	}

	public void calcMPH()
	{
        time = hours + (minutes * 60);   
        mph = distance / time;
    
	}

	public void print()
	{
        System.out.println(distance + " miles in " + hours + " hour(s) and " + minutes + " minute(s)= " + mph + " mph.");

	}
}