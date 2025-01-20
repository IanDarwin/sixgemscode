import static java.io.IO.print;
import static java.io.IO.println;

public class ExpressionSwitch {
    enum Color { RED, AMBER, GREEN};

    public static void main(String[] args) {
        actionFromColorOld(Color.GREEN);
        println(actionFromColorNew(Color.GREEN));
    }

    static void actionFromColorOld(Color c) {
        switch(c) {
            case Color.RED:
                println("Stop");
                break;
            case Color.AMBER:
                println("Clear intersetion");
                break;
            case Color.GREEN:
                println("Full steam ahead!");
                break;
            default:
                throw new IllegalArgumentException("Unknown color!");
        }
    }

    // This switch *return a value* which the method simply returns
    static String actionFromColorNew(Color c) {
        return switch (c) {
            case Color.RED -> "Stop";
            case Color.AMBER -> "Clear intersection";
            case Color.GREEN -> "Full steam ahead!";
        };
    }
}
