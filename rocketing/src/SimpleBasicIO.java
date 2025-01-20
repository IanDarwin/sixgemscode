// Simple basic I/O
// On Java 24, in classless main, java.io.IO,* are statically imported
// This has three methods, print(), println() and readln()
// which delegate to standard java.io methods.

void main() {
        println("Hello world");
        String name = readln("Enter your name: ");
        println("Thank you, " + name);
}

