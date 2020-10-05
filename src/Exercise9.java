import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("First name  : ");
        String firstName = scn.next();
        System.out.print("Middle name : ");
        String middleName = scn.next();
        System.out.print("Last name   : ");
        String lastName = scn.next();

        char ch1 = firstName.charAt(0);
        char ch2 = middleName.charAt(0);
        char ch3 = lastName.charAt(0);
        char Uch1 = toUpperCase(ch1);
        char Uch2 = toUpperCase(ch2);
        char Uch3 = toUpperCase(ch3);

        System.out.print("\n"+Uch1+Uch2+Uch3+".");
    }
}
