//Author: Ngô Văn Thức
//MSSV: 20215145
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");  // Print spaces to align the stars
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");  // Print stars
                }
                System.out.println();  // Move to the next line for the next row
            }
        } else {
            System.out.println("Please enter a positive integer for the height.");
        }
        
        scanner.close();
    }
}
