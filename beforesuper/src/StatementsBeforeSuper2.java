import java.time.LocalDate;

public class StatementsBeforeSuper2 {
    final String firstName, lastName;
    final LocalDate recordCreated;

    public StatementsBeforeSuper2(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        recordCreated = LocalDate.now();
        // We did all that before the call to super!
        super();
        // Potential problems with setting inherited fields though.
    }

    @Override
    public String toString() {
        return "Customer({)" +
                "name='" + firstName + ' ' + lastName +
                "; recordCreated=" + recordCreated +
                ')';
    }

    public static void main(String[] args) {
        System.out.println(new StatementsBeforeSuper2("Tom", "Piper"));
    }
}
