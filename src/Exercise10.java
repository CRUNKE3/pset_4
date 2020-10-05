import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("What's your favorite city? ");
        String city = scn.nextLine();
        int length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();

        System.out.println("\nText   : "+city);
        System.out.println("Length : " + length);
        System.out.println("Upper  : " + upper);
        System.out.println("Lower  : " + lower);
    }
}
