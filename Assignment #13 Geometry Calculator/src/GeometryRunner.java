import java.util.Scanner;
public class GeometryRunner {
        public static void main (String[] args) throws Exception {
            Geometry calculate = new Geometry();
            
            String strOne;

            Scanner keyboard = new Scanner (System.in);

            System.out.println("What formula would you like to use? ");
            strOne = keyboard.nextLine();

            if (strOne.equalsIgnoreCase("rectangle")){
                calculate.rectangle();
            }

            else if (strOne.equalsIgnoreCase("cube")){
                calculate.cube();
            }

            else if (strOne.equalsIgnoreCase("circle")){
                calculate.circle();
            }

            else{
                System.out.println("It seems that you have either inputed a none geometric equation or a typo.");
            }
            
    }

}
