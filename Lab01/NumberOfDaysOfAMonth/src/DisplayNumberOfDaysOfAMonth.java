//Author: Ngô Văn Thức
//MSSV: 20215145
import java.util.Scanner;

public class DisplayNumberOfDaysOfAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInMonth = 0;

        System.out.print("Enter a month (full name, abbreviation, 3-letter, or number): ");
        String monthInput = scanner.nextLine();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        monthInput = monthInput.toLowerCase(); // Chuyển đổi thành chữ thường để so sánh không phân biệt hoa thường

        switch (monthInput) {
            case "january", "jan.", "jan", "1":
                daysInMonth = 31;
                break;
            case "february", "feb.", "feb", "2":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Năm thường
                }
                break;
            case "march", "mar.", "mar", "3":
                daysInMonth = 31;
                break;
            case "april", "apr.", "apr", "4":
                daysInMonth = 30;
                break;
            case "may", "may.", "5":
                daysInMonth = 31;
                break;
            case "june", "jun.", "jun", "6":
                daysInMonth = 30;
                break;
            case "july", "jul.", "jul", "7":
                daysInMonth = 31;
                break;
            case "august", "aug.", "aug", "8":
                daysInMonth = 31;
                break;
            case "september", "sep.", "sep", "9":
                daysInMonth = 30;
                break;
            case "october", "oct.", "oct", "10":
                daysInMonth = 31;
                break;
            case "november", "nov.", "nov", "11":
                daysInMonth = 30;
                break;
            case "december", "dec.", "dec", "12":
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month input. Please enter a valid month.");
                scanner.close();
                return;
        }

        if (year < 0) {
            System.out.println("Invalid year input. Please enter a non-negative year.");
        } else {
            System.out.println(daysInMonth + " days.");
        }

        scanner.close();
    }
}
