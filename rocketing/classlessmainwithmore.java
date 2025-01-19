/// Classless main can have imports
import java.nio.file.*;

/// Instance main is a method so can have extends, implements, throws
void main() throws IOException {
	var lines = Files.readAllLines(Path.of("/etc/passwd"));
	System.out.printf("There are %d password entries\n", lines.size());
}
