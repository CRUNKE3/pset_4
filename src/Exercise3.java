import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Length   : ");
        double length = scn.nextDouble();
        System.out.print("Width    : ");
        double width = scn.nextDouble();
        System.out.print("Diameter : ");
        double diameter = scn.nextDouble();

        double totalArea = length*width;
        double radius = diameter/2;
        double circleArea = Math.PI*Math.pow(radius, 2);
        double surfaceArea = totalArea-circleArea;

        System.out.print("Surface Area : "+decimalFormat.format(surfaceArea));
    }
}
