import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.00");
        dFormat.setGroupingUsed(true);
        dFormat.setGroupingSize(3);

        System.out.print("Side : ");
        double sideLength = scn.nextDouble();

        double perimeter = sideLength*6;
        double area = ((Math.sqrt(3)*3)/2)*Math.pow(sideLength, 2);

        System.out.println("Area      : "+dFormat.format(area));
        System.out.println("Perimeter : "+dFormat.format(perimeter));
    }
}
