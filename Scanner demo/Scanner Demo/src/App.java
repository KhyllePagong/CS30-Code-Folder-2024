import java.util.Scanner;  


public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Scanner key =  new Scanner(System.in);
        //int input
        System.out.println("Enter an Integer: ");
        int num = keys.nextInt();
        //senetence
       
        System.out.println("Enter a sentence: ");
        String sentence = key.nextLine();
        System.out.println(num + " " + sentence);
    }
}
