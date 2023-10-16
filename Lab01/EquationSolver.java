//Author: Ngô Văn Thức
//MSSV: 20215145
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;
public class EquationSolver {
    public static void main(String[] args) {

        System.out.println("Equation Solver Menu:");
        System.out.println("1. Solve a first-degree equation (ax + b = 0)");
        System.out.println("2. Solve a system of first-degree equations (a11x1 + a12x2 = b1, a21x1 + a22x2 = b2)");
        System.out.println("3. Solve a second-degree equation (ax^2 + bx + c = 0)");
        System.out.println("Enter your choose: "); 
        Scanner scanner = new Scanner(System.in);
        int cmd = scanner.nextInt();

        if(cmd == 1){
            double a, b;
            System.out.print("a = "); a = scanner.nextDouble();
            if(a == 0){
                System.out.println("Please enter a != 0");
                System.exit(0);
            }
            System.out.print("b = "); b = scanner.nextDouble();
            double x =  -b / a;
            System.out.println("x = " + x);
        }

        if(cmd == 2){
            double a11, a12, a21, a22, b1, b2;
            System.out.print("a11 = "); a11 = scanner.nextDouble();
            System.out.print("a12 = "); a12 = scanner.nextDouble();
            System.out.print("a21 = "); a21 = scanner.nextDouble();
            System.out.print("a22 = "); a22 = scanner.nextDouble();
            System.out.print("b1 = "); b1 = scanner.nextDouble();
            System.out.print("b2 = "); b2 = scanner.nextDouble();

            double D, Dx, Dy;
            //a11x1 + a12x2 = b1
            //a21x1 + a22x2 = b2
            D = a11 * a22 - a12 * a21;
            Dx = b1 * a22 - b2 * a12;
            Dy = a11 * b2 - a21 * b1;

            if(D != 0){
                System.out.println("x = " + (Dx / D));
                System.out.println("y = " + (Dy / D));
            }else{
                if(Dx != 0 || Dy != 0) System.out.println("No solution");
                else System.out.println("Many solutions");
            }
           
        }

        if(cmd == 3){
            double a, b, c;
            System.out.print("a = "); a = scanner.nextDouble();
            if(a == 0){
                System.out.println("Please enter a != 0");
                System.exit(0);
            }
            System.out.print("b = "); b = scanner.nextDouble();
            System.out.print("c = "); c = scanner.nextDouble();
            double delta = b * b - 4 * a * c;
            if(delta < 0) System.out.println("No solution");
            else if(delta == 0) System.out.println("x = " + (-b / (2 * a)));
            else {
                double x1, x2;
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        scanner.close();
    }
}
