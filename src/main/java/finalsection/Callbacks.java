package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
//        hello("John", "Montana", null);
            hello("John", null, value -> {
                System.out.println("No last name provided");
            });
    }

    static void hello(String fistName, String lastName, Consumer<String> callback) {
        System.out.println(fistName);
        if(lastName != null) System.out.println(lastName);
        else {
            callback.accept(fistName);
        }
    }
}
