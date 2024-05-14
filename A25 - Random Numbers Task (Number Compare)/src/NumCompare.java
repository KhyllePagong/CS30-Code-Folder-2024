public class NumCompare {
    public void print(int a, int b){
        if (a > b){
            System.out.println("The smallest is "+ b);
            System.out.println("The biggest is "+ a);
        }
        else if (b > a){
            System.out.println("The smallest is "+ a);
            System.out.println("The biggset is "+ b);
        }
        else{
            System.out.println("Both numbers are equal, crazy!");
        }
    }
}
