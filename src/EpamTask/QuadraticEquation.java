package EpamTask;
/* For the given quadratic equation coefficients (**ax<sup>2</sup> + bx + c = 0**),
return one or two roots of the equation if there is any in the set of real numbers.

Input value is given via `System.in`. Output value must be printed to `System.out`.

Output format is:
* *"x<sub>1</sub> x<sub>2</sub>"* (two roots in any order separated by space) if there are two roots,
* *"x"* (just the value of the root) if there is the only root,
* *"no roots"* (just a string value "no roots") if there is no root.

The `a` parameter is guaranteed to be not zero.*/

import java.util.Scanner;



import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println( r1 + " " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println(r1);
        }
        else
        {
            System.out.println("no roots");
        }


    }

}