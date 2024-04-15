public class CtoF {
    double fahren, sum1, celci;
    public void setNums(double num1)
    {
        fahren=num1;
        
    }
    public void convert()
    {
        sum1 = fahren - 32;
        celci= sum1 * 5/9;
    }
    public void print(){
        System.out.println("Fahrenheit is "+fahren+"F");
        System.out.println("When you convert it to Celcius, it is "+celci+"C");
    }
}
///-----------