package docs;



/** A placeholder class on which to hang the demo */
public class JavaDocSnippetDemo {
	/** The usual main method
	 * @param args Unused.
	 */
    public static void main(String[] args) {
        System.out.println("Welcome to JavaDoc");
    }

	/** Empty constructor to satisfy JavaDoc */
	JavaDocSnippetDemo() {
		// empty
	}

	/**
	 * A simple demo method. Typical usage:
	 * {@snippet lang="java" :
	 *  var demo = new JavadocDemo();
	 *  demo.demo(42); // or some other int
	 * }
	 * @param i The value to be processed.
	 */
	public void demo(int i) {
		System.out.printf("Demo value is %d\n", i);
	}
}
