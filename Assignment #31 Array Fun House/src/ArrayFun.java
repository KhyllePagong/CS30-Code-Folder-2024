import java.util.Arrays;
import java.lang.Math;
public class ArrayFun {    
        // ARRAY NUMBER 1 ----------------------------------------
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
        int[] three = {};
            // Print the array for the user to view
        public void execute(){
                System.out.println(Arrays.toString(one));
    
                // Sum the values of positions listed (e.g. array[3] to array[6])
                System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
                System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));
                System.out.println("# of 4s  =  " + getCount(one,4));
                System.out.println("# of 9s  =  " + getCount(one,9));
        
                // Count the number of occurances of the number in the array
            }
            
         
            
        // ARRAY NUMBER TWO ---------------------------------------
    
    // METHODS/FUNCTIONS INSTEAD OF A SECOND FILE ----------------------------------------
        //instance variables and constructors could be used, but are not really needed
    
    
        //getSum() will return the sum of the numbers from start to stop, not including stop
        public static int getSum(int[] numArray, int start, int stop)
        {
            int sum = 0;
            for (int i = start; i <= stop ; i++){
                sum += numArray[i];
            }
            return sum;
        }
    
    
        //getCount() will return number of times val is present 
        public static int getCount(int[] numArray, int val)
        {
            int total = 0;
            for (int i = 0; i <= numArray.length;i++){
                if (numArray[i]==val){
                    total++;
                }
            }
            return total;
        }
    
        //Remove val will replace the instance of particular numbers.
        //Returns an entire array
        public static int[] removeVal(int[] numArray, int val)
        {
            return null;
        }
    }

