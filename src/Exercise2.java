import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Inches : ");
        int inches = scn.nextInt();
        int miles = (inches-(inches%63360))/63360;
        int feet = ((inches-miles*63360)-(inches-miles*63360)%12)/12;
        int rInches = inches-(miles*63360)-(feet*12);

        System.out.println("\nMiles  : " + miles);
        System.out.println("Feet   : " + feet);
        System.out.println("Inches : " + rInches);
    }
}
