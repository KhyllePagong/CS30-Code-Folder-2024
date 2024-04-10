public class Sum
{
	//instance variables
	private int one, two, sum;
	public void setNums(int num1, int num2)
	{
		one=num1;
		two=num2;
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
