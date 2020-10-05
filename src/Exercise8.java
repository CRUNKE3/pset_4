import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Text : ");
        String text = scn.next();
        int len = text.length();
        String firstHalf = text.substring(0, len / 2), secondHalf = text.substring(len/2);

        System.out.print(secondHalf.toUpperCase()+firstHalf.toUpperCase()+".");


    }
}
