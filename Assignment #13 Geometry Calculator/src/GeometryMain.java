import java.util.Scanner;
public class GeometryMain {
    public void MainThing(){
        String strOne;

        Geometry calculate = new Geometry();

        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("What formula would you like to use rectangle,circle, or cube? (input C to clear and E to end the code) ");
        strOne = keyboard.nextLine();

        if (strOne.equalsIgnoreCase("rectangle")){
            calculate.rectangle();
            MainThing();
        }

        else if (strOne.equalsIgnoreCase("cube")){
            calculate.cube();
            MainThing();
        }

        else if (strOne.equalsIgnoreCase("circle")){
            calculate.circle();
            MainThing();
        }

        else if (strOne.equalsIgnoreCase("E")){
            System.out.println("Goodbye!");
        }
        
        else if (strOne.equalsIgnoreCase("C")){
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            MainThing();
        }

        else{
            System.out.println("It seems that your input was either not in the choices given or is a typo.");
            MainThing();
        }
        
    }
}
