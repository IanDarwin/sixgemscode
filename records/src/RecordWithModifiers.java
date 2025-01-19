
/// Of course records are immutable, but occasionally you need to update one
/// I prefer to use the "withXXX" pattern
public class RecordWithModifiers {

	record Customer(String firstName, String lastName, int customerId) {
		///  Create a new Customer with the lastname changed
		public Customer withLastName(String lastName) {
			return new Customer(firstName, lastName, customerId);
		}
		public String nameReversed() {
			return lastName + ", " + firstName;
		}
	}

    public static void main(String[] args) {
		var customer = new Customer("Ian", "Darwin", 123456);

        System.out.printf("Hello, %s!\n", customer.firstName());

		customer = customer.withLastName("Smythe"); // Pattern: x = x.withXXX(value);πµ

		System.out.println("Name reversed is " + customer.nameReversed());
    }
}
