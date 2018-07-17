import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(4.5, 3.1, 2.0);
        Line line2 = new Line(2.2, -4.1, -2.0);

        //4.5x + 3.1y = 2
        //2.2x - 4.1y = -2

        double d = line1.getA()*line2.getB()-line1.getB()*line2.getA();
        double dx = line1.getC()*line2.getB()-line1.getB()*line2.getC();
        double dy = line1.getA()*line2.getC()-line1.getC()*line2.getA();
        if (d==0&&(dx==0&dy==0)){
            System.out.println("Линии совпадают");
        }else if (d==0){
            System.out.println("Линии паралельны");
        }else {
            double x = dx/d;
            double y = dy/d;
            System.out.println("Линии пересакаются в точке ("+x+", "+y+")");
        }

    }
}
