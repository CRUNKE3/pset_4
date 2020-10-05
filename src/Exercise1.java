import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Temperature : ");
        int temp = scn.nextInt();
        System.out.print("Wind Speed  : ");
        int windSpeed = scn.nextInt();

        double windChill = 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windSpeed, 0.16);

        System.out.print("\nWind Chill : "+decimalFormat.format(windChill));
    }
}
