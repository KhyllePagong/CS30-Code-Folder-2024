import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall{
	public static void check( int a, int b )
	{
		if (a>b){
			System.out.println("Yes");
		}
		else if (a<b){
			System.out.println("No");
		}
		else{
			System.out.println("Equal");
		}
    }
}