package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForwardReferences {

    public static void main(String[] args) {
        Regrex_test tester = new Regrex_test();
        tester.checker("^tac(tac(tic)?)*$");
    }

}

class Regrex_test {
    public void checker(String Regex_Pattern) {
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}
