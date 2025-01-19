public class SwitchOnPrimitives {
    public static void main(String[] args) {
        Object num = 1;
        switch (num) {
            case int i -> System.out.println("Int: " + i);
            case long l    -> System.out.println("Long: " + l);
            default        -> System.out.println("Number: " + num);
        }

    }
}