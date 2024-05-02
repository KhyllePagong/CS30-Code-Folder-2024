import java.lang.System;
public class Loopstat {
    private int start, end;
    public Loopstat(int a, int b){

    }
    public void setNums(int beg, int stop){
       start = beg;
       end = stop; 
    }
    public int evencount(){
        int even=0;
        for (int i=start;i<=end;i++){
            if (i % 2 == 0){
                even++;
            }
        }
        return even;
    }
    public int oddcount(){
        int odd=0;
        for (int i=start;i<=end;i++){
            if (i % 2 != 0){
                odd++;
            }
        }
        
        return odd;
    }
    public int totalcount(){
        int total=0;
        for (int i=start;i<=end;i++){
            total += i;
        }
        return total;
    }
    public void test(){
        System.out.println(start + " " + end+ " " +oddcount()+ " " + evencount()+ " " + totalcount());
    }
}
