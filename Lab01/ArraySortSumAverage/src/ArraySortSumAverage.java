//Author: Ngô Văn Thức
//MSSV: 20215145
import java.util.Scanner;

public class ArraySortSumAverage {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;
        double average;
 
        int[] arr = new int[n];
        System.out.print("Input array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.print("Array is increased: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];

        }
        System.out.println();
        average = (double) sum / arr.length;
        System.out.println("Sum is: " + sum + "\n" + "Average is: " + average);
    }

    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}