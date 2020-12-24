package by.learning.messanger.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 - eng\n2 - bel");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "US";
                language = "en";
                break;
            case '2':
                country = "BY";
                language = "be";
                break;
        }
        Locale locale = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("text", locale);
        String str1 = resourceBundle.getString("str1");
        System.out.println(str1);
        String str2 = resourceBundle.getString("str2");
        System.out.println(str2);
    }

}
