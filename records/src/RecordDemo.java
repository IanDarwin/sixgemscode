public class RecordDemo {

	// This is literally all you need for an immutable POJO,
	// which will have accessors, equals, hashCode, toString.
	record Customer(String firstName, String lastName, int customerId) {}

    public static void main(String[] args) {
		var customer = new Customer("Ian", "Darwin", 123456);

        System.out.printf("Hello, %s!\n", customer.firstName());
		System.out.println("Full record: " + customer);
		System.out.printf("Equals + hashCode: %s %d\n",
			customer.equals(new Customer("Robin", "Williams", 678901)),
			customer.hashCode());
    }
}
