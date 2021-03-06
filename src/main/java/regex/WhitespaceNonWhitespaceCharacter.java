package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhitespaceNonWhitespaceCharacter {
    public static void main(String[] args) {

        Regex_T tester = new Regex_T();
        tester.checker("(\\S{2}\\s){2}\\S{2}"); // Use \\ instead of using \

    }
}

class Regex_T {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
