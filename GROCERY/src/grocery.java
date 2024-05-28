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
                        System.out.println(x+1 + " . "+items.get(x));
                    }
                    System.out.print("Press 5 to Update your grocery list \nPress 6 to Remove an item ");
                    int upd = keyboard.nextInt();
                    if (upd == 5){
            
                    }
                    else if (upd==6){
                        System.out.print("Enter the number of the item you would like to remove: ");
                        int remve = keyboard.nextInt();
                        items.remove(remve-1);
                        System.out.print("Enter 1 to replace the removed item ");
                        int rplce = keyboard.nextInt();
                        if (rplce == 1){
                            System.out.println("Replace the removed item with? ");
                            newitem = keyboard.nextLine();
                            items.add(remve-1,newitem);
                        }
                        System.out.println("Your Grocery list: ");
                         for (int x = 0; x < items.size();x++){
                        System.out.println(x+1 + " . "+items.get(x));
                        }
                    }
                }
            }
        }
    }
