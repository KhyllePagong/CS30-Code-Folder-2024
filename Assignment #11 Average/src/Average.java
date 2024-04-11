public class Average {
    private int one, div;
    public void setNums(int num1)
    {
       one=num1;
    }
    public void avg()
    {
        div = one/2;
    }
    public void print()
    {
        System.out.println(one + "/2= " + div);
    }
}
