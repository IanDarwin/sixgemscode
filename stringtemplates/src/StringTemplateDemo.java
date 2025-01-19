

import java.time.LocalDate;
import java.time.Period;

import static java.lang.StringTemplate.STR;

public class StringTemplateDemo {
    public static void main(String[] args) {
        User user = new User("Ian", 100, LocalDate.now().minusDays(10));

        System.out.println(
                STR."Welcome \{user.name}.");

        double radius = 17.5; // cm
        System.out.println(
                STR."Your holdings are worth \{user.holdings * coinPrice} iancoin");

        if (user.lastLogin != LocalDate.now()) {
            System.out.println(
                    STR."We haven't seen you in \{
                            Period.between(user.lastLogin, LocalDate.now()).getDays()} days");
        }

    }

    // Definitions to make things compile

    // Following needs Java 16
    static record User(String name, int holdings, LocalDate lastLogin) {
    }
    static double coinPrice = 27.12;
}