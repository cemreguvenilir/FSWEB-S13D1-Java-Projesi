import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle area");

        try {
            System.out.println("Enter first value: ");
            double val1 = scanner.nextDouble();
            System.out.println("Enter second value: ");
            double val2 = scanner.nextDouble();
            System.out.println("Area = " + area(val1, val2));

         } catch (Exception ex){

            System.out.println("Invalid value");
        }
        System.out.println("Circle area");
        try {
            System.out.println("Enter radius");
            double radius = scanner.nextDouble();
            System.out.println(area(radius));

        } catch (Exception ex) {
            System.out.println("Invalid value");
    }}

    public static boolean shouldWakeUp(boolean barking, int hour){
    if (hour < 0 || hour > 23) {
        return false;
    } else if (barking && (hour < 8 || hour > 20 )) {
        return true;
        } else {
        return false;
    }
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 >=13 && num1 <=19) ||
                (num2 >=13 && num2 <=19) ||
                (num3 >=13 && num3 <=19);
    }
    public static boolean isCatPlaying(boolean isSummer, int temp){
        if (isSummer){
            return temp > 25 && temp <= 45;
        }
        return temp > 25 && temp <= 35;
    }

    public static double area(double val1, double val2){
        if (val1 < 0 || val2 < 0){
            return -1;
        }
        return val1*val2;
    }
    public static double area(double radius){
        if (radius <0){
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
