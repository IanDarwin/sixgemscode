///
/// Record Patterns - JEP 405
/// Deconstruct record values directly
///
public class RecordPatterns {
    record Customer(String firstname, String lastname) {}

    public static void main(String[] args) {
        Customer c = new Customer("Jessie", "Smythe");
        printPersonOld(c);
        printPersonNew(c);
    }

    static void printPersonOld(Object o) {
        if (o instanceof Customer) {
            Customer c = (Customer) o;
            String fName = c.firstname();
            String lName = c.lastname();
            System.out.println(fName + " " + lName);
        }
    }

    static void printPersonNew(Object o) {
        // Here, fName and lName are deconstructed matching the object fields
        if (o instanceof Customer(String fName, String lName)) {
            System.out.println(fName + " " + lName);
        }
    }
}
