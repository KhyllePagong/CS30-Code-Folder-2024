public class Average {
    private double one, div;
    public void setNums(double num1)
    {
       one=num1;
    }
    public void avg()
    {
        div = one/2;
    }
    public void print()
    {
        System.out.println(one + "/2.0= " + div);
    }
}
