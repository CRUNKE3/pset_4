import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Diameter : ");
        double diameter = scn.nextDouble();
        double radius = diameter/2;
        double area = Math.PI*Math.pow(radius, 2);
        double circumference = diameter*Math.PI;

        System.out.println("Area          : "+decimalFormat.format(area));
        System.out.println("Circumference : "+decimalFormat.format(circumference));
    }
}
