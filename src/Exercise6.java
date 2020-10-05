import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#.00");
        dFormat.setGroupingUsed(true);
        dFormat.setGroupingSize(3);

        System.out.print("Length : ");
        double length = scn.nextDouble();
        System.out.print("Width  : ");
        double width = scn.nextDouble();

        double area = length*width;
        double perimeter = (length*2)+(width*2);
        double diagonalSquare = Math.pow(length, 2)+Math.pow(width, 2);
        double diagonalRoot = Math.sqrt(diagonalSquare);

        System.out.println("Area      : "+dFormat.format(area));
        System.out.println("Perimeter : "+dFormat.format(perimeter));
        System.out.println("Diagonal  : "+dFormat.format(diagonalRoot));
    }
}
