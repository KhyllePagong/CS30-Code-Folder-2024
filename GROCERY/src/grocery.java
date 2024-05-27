import java.util.Scanner;
import java.util.ArrayList;
public class grocery {
    public static void main(String[] args) throws Exception {
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i < 1;){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("What would you like to add? ");
                String newitem = keyboard.nextLine();
                items.add(newitem);
                System.out.print("Enter 1 to add more: ");
                int yn = keyboard.nextInt();
                if (yn !=1){
                    System.out.println("Your Grocery list: ");
                    for (int x = 0; x < items.size();x++){
                        System.out.println(items.get(x));
                    }
                    i++;
                }
            }
        }
    }
