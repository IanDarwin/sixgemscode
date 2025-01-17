package stringtemplate;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.StringTemplate.STR;

public class StringTemplateDemo2 {
    public static void main(String[] args) {

        // Following uses Text Blocks

        String title = "Signup Page";
        String namePrompt = "Enter your name";
        String webpage = STR."""
            <html>
              <head>
                <title>\{title}</title>
              </head>
              <body>
                <form>
                <p>\{namePrompt}</p>
                <input name="name" width=20"/>
                ...
                </form>
              </body>
            </html>
        """;
        System.out.println(webpage);
    }
}