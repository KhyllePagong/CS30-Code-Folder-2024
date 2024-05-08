import java.lang.Math;
public class NumComparerunner {
    public static void main(String[] args) throws Exception {
        NumCompare test = new NumCompare();
        for (int i=0; i<5; i++){
            double random = Math.random() * 1000;
            double random2 = Math.random()*1000;
            int a = (int) random;
            int b = (int) random2;
            System.out.println("Here are two random numbers: \n"+a+" and "+b);
            test.print(a,b);
        }
    }
}

//pwewerwerwer