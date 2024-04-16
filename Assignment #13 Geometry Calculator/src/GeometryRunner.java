import java.util.Scanner;
public class GeometryRunner {
        public static void main (String[] args) throws Exception {
            Scanner keyboard = new Scanner(System.in);
            GeometryMain calculator = new GeometryMain();
            System.out.println("Start calculator? ");
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("yes")){
                calculator.MainThing();
            }
            else if (input.equalsIgnoreCase("no")){
                System.out.println("okay, goodbye!");
            }
            else{
                System.out.println("your input is either not 'yes' or 'no,' or you may have mispelled it. Goodbye");
            }       
    }

}
