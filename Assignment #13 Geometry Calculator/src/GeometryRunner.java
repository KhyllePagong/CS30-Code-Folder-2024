import java.util.Scanner;
public class GeometryRunner {
        public static void main (String[] args) throws Exception {
            Geometry calculate = new Geometry();

            String strOne;

            Scanner keyboard = new Scanner (System.in);

            System.out.println("What formula would you like to use(rectangle,circle,cube)? ");
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
                System.out.println("It seems that your input was either not in the choices given or is a typo.");
            }
            
    }

}
