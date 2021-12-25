package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending e-mail to " + email), () -> {
                        System.out.println("cannot send email");
                });

        Optional.ofNullable("john@email.com")
                .ifPresent(email -> System.out.println("Sending e-mail to " + email));
    }
}
