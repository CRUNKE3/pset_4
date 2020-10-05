import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Centimeters : ");
        int centi = scn.nextInt();

        int kilo = (centi-centi%100000)/100000;
        int meters = ((centi-100000*kilo)-(centi-100000*kilo)%100)/100;
        int rCenti = centi-(100000*kilo)-(meters*100);
        System.out.println("Kilometers  : "+kilo);
        System.out.println("Meters      : "+meters);
        System.out.println("Centimeters : "+rCenti);
    }
}
