package blocks;

/**
 * Demonstrate multi-line Strings, a.k.a. Text Blocks
 */
public class TextBlocksDemo {

    public static void main(String[] args) {

        var oldHelpText = "Help?\n" +
                "This help file will help you learn\n" +
                "to use our great new software package\n" +
                "LockInVar.";

        var newHelpText = """
                Help?
                This help file will help you learn
                to use our great new software package
                LockInVar.""";

        System.out.println("oldHelpText = " + oldHelpText);
        System.out.println("newHelpText = " + newHelpText);
        System.out.println(oldHelpText.equals(newHelpText));
    }
}
