package ThertyDaysOfCode;

import java.util.Scanner;

public class Day3IntrotoConditionalStatements {
    static Scanner scanner=new Scanner(System.in);
    static int number=scanner.nextInt();
    public static void main(String[] args) {
        System.out.println((number%2==1||number<=20&&number>=6)?"Weird":"Not Weird");
    }
}
