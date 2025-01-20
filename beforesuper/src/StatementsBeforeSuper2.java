import java.time.LocalDate;

public class StatementsBeforeSuper2 {
    final String firstName, lastName;
    final LocalDate recordCreated;

    public StatementsBeforeSuper2(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        recordCreated = LocalDate.now();
        // We did all the above before the call to super!
        // However, we can NOT do the following before super()
        // String s = toString();
        super();
        // Potential problems with setting inherited fields though.
    }

    @Override
    public String toString() {
        return "Customer(" +
                "Name '" + firstName + ' ' + lastName +
                "; account created on " + recordCreated +
                ')';
    }

    public static void main(String[] args) {
        System.out.println(new StatementsBeforeSuper2("Tom", "Piper"));
    }
}
