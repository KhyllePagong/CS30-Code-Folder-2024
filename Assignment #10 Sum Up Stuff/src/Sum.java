public class Sum
{
	//instance variables
	private int one, two, sum;
	public void setNums(int one, int two)
	{
		one=2;
		two=6;
	}

	public void sum( )
	{
		sum = one + two;
	}

	public void print( )
	{
		System.out.println(one + " + " + two + " = " + sum);
	}
}
