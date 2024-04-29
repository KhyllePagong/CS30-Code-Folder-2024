public class Coolnumber
{
	public static boolean isCoolNumber( int num ){           
        if (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1){
        return true;
        }
        else {
        return false;
        }   
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
        int a = 0;
        for (int i = 6; i < stop; i++){
            if (isCoolNumber(i)){
                a+=1;
            }
        }
        return a;
	}
}