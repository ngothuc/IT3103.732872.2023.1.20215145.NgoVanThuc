//Author: Ngô Văn Thức
//MSSV: 20215145
import java.util.Scanner;
public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.print("Number of collumns: ");
        m = scanner.nextInt();
        System.out.print("Number of rows: ");
        n = scanner.nextInt();

        System.out.println("Result is : ");
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        int[][] sumMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input A[" + i + ", " + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input B[" + i + ", " + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}