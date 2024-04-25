import static java.lang.System.*;

public class Coolnumber
{
    private int z;
    private static boolean check;
	public static void isCoolNumber( int num )
	{
        int z = 0;
        for (int x = 6; x < num; x++){
            if (num % x == 1){
                z += 1;
            }
        }
        if (z == 4){
            check = true;
        }
        else {
            check = false;
        }
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
        int a = 0;
        if (check==true){
            a=1;
        }
		return a;
	}
}