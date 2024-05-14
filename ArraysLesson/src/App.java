public class App {
    public static void main(String[] args) throws Exception {
        
        // // Declaring Arrays
        // int[] highscore = null;
        // String[] names = null;

        // // Create the array
        // highscore = new int[5];
        // names = new String[5];

        // // Set initial values invidiually
        // highscore[0] = 99;
        // names[0] = "george";

        // Declare, Create, and intialize at the same time
        int[] highscore = {99,98,98,88,68};
        String[] names = {"g","fred","wolf","fox","sutter"};

        System.out.println("The length is: " + names.length);
        for (int i=highscore.length - 1; i>0;i-=1){
            System.out.println(names[i-1] +"'s highscore is "+highscore[i-1]);
        }
    }
}
