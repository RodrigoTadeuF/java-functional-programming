package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@mail.com", "+01212121212", LocalDate.of(2000, 1, 1));

        //Using combinator pattern
         CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.IsEmailValid()
                .and(CustomerRegistrationValidator.phoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

        // System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db


    }
}
