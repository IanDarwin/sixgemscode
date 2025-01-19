/// The basic constructor is provided automatically.
/// It is officially called the "Canonical Constructor",
/// that is, the one that echos the param list of the record.
public class RecordWithConstructor {
    record Foo(String name) {}

    public static void main(String[] args) {
        // Use the canonical constructor
        Foo foo = new Foo("Testing 1 2 3");
        System.out.println("foo = " + foo);
    }

    // There may be more below...
















    void main2() {
        System.out.println(new Bar("Ivan"));
        // So how does this work?
        System.out.println(new Bar(123456));
    }

    /// Records may add a non-canonical constructor,
    /// but it must call the canonical one.
    record Bar(String name) {
        Bar(int i) {
            this(Integer.toString(i));
        }
    }

    /// Records can add final fields (which MUST be final)
    record Boo(String name) {
        static final String model = "xyzzy.stl";
    }

    /// Limitation: a record may not add any non-final fields
    record BooHoo(String name) {
        // String name2 = name; // Problematic; try making static...
    }
}
