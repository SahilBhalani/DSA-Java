package Basic_Of_Java.Methods;

public class Check_String_values {
    public static void main(String[] args) {

        String name = "nitya";
        greet(name); // this will not return "naam" instead this will return "name". because of this namw will be call by pass by value.
        System.out.println(name);

    }

    static void greet(String naam){
        naam = "sahil";
    }
}
