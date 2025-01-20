// Ability to switch on and unpack primitives - Java 24
public class SwitchOnPrimitives {
    public static void main(String[] args) {
        Object num = 1;
        switch (num) {
            case int i    -> System.out.println("Int: " + i);
            case Integer j -> System.out.println("Integer: " + j);
            case long l   -> System.out.println("Long: " + l);
            case double d -> System.out.println("Double: " + d);
            default       -> System.out.println("Number: " + num);
        }

    }
}