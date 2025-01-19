import static java.util.FormatProcessor.FMT;

public class StringTemplateFmt {
    public static void main(String[] args) {
        System.out.println(FMT."Pi is very roughtly %4.2f\{Math.PI}");
    }
}
