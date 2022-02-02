package two.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Locale,
 * ResourceBundle
 */
public class I18NDemo {
    public static void main(String[] args) {
        String language;
        String country;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Unesi kod jezika svog");
            language = scanner.nextLine();
            System.out.println("Unesi kod države iz koje dolaziš");
            country = scanner.nextLine();
            Locale locale = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", locale);
            String greeting = resourceBundle.getString("greetings");
            System.out.println(greeting);
            System.out.println(resourceBundle.getString("farewell"));
            System.out.println(resourceBundle.getString("inquiry"));
        }
    }
}
