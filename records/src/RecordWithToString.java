public class RecordWithToString {

	// This is literally all you need for an immutable POJO,
	// which will have accessors, equals, hashCode, toString.
	record Customer(String firstName, String lastName, int customerId) {
		@Override
		public String toString() {
			return "Customer " + firstName + " " + lastName;
		}

		public String nameReversed() {
			return lastName + ", " + firstName;
		}
	}

    public static void main(String[] args) {
		var customer = new Customer("Ian", "Darwin", 123456);

        System.out.printf("Hello, %s!\n", customer.firstName());
		System.out.println("As String: " + customer);
		System.out.println("Name reversed is " + customer.nameReversed());
    }
}
