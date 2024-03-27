public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        int a = message1.indexOf(target1);
        //----------------------
        String message2 = "That was great - lol";
        String target2 = "lol";
        // ---------------------
        System.out.println(message1.substring(0,a-1)+ message1.substring(9,16));
        System.out.println(message2.replace(target2 , "laugh out loud"));

    }
}
