import java.util.Scanner;


public class animal {
    public static void main(String[] args) throws Exception{
        String type, answer;

        Scanner keyboard = new Scanner (System.in);

        animalrunner animals = new animalrunner();

        System.out.println("Dog or Cat? :)");

        type=keyboard.nextLine();
        answer=type.toUpperCase();

        if (answer=="CAT"){
            animals.cat();
        }
        System.out.println(answer);
    }
}
