package docs;

/**
 * OldJavaDocExample
 *
 * This is a traditional JavaDoc comment.
 * <ul>
 * <li>Item 1
 * <li>Item 2
 * </ul>
 */
class OldJavaDocExample {
    // Empty
}

/// # NewJavaDocExample
///
/// This is a **Markdown** comment.
///
/// - Item 1
/// - Item 2
///
class NewJavaDocExample {
    // Empty
}

/** A placeholder class on which to hang the demo */
public class JavaDocMDDemo {
	/** The usual main method
	 * @param args Unused.
	 */
    public static void main(String[] args) {
        System.out.println("Welcome to JavaDoc");
    }

	/** Empty constructor to satisfy JavaDoc */
	JavaDocMDDemo() {
		// empty
	}
}
