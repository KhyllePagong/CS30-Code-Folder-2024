public class CtoF {
    double f, sum1, c, sum2;
    public void setNums(double num1)
    {
        f=num1;
        
    }
    public void convert()
    {
        sum1 = f - 32;
        c= sum1 * 5/9;
    }
    public void print(){
        System.out.println(sum1 + c);
    }
}
