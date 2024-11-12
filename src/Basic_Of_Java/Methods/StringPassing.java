package Basic_Of_Java.Methods;

public class StringPassing {
    public static void main(String[] args) {

        String Msg = greetings();
        System.out.println(Msg);
    }

    static String greetings(){
        String greet = "How are you";

        return greet;
    }
}
