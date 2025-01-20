// Ability to switch on and unpack primitives - Java 24
public class SwitchOnPrimitives {
    public static void main(String[] args) {
        Object[] values = {1, Math.PI, Integer.valueOf(9), "Hello"};
        for (Object o : values) {
            switch (o) {

                // Which of these two lines will print? What is the other?
                case int i -> System.out.println("Int: " + i);
                case Integer j -> System.out.println("Integer: " + j);

                case long l -> System.out.println("Long: " + l);
                case double d -> System.out.println("Double: " + d);
                default -> System.out.println("Other: " + o);
            }
        }
    }
}