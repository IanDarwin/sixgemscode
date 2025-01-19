void main() {
	System.out.println("Ahoy from the bounding main(), mateys!");
	process();
}

// A classless main can call instance methods
void process() {
	System.out.println("Hello from process too.");
}
