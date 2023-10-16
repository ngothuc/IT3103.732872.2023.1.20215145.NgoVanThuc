//Author: Ngô Văn Thức
//MSSV: 20215145
import javax.swing.JOptionPane;
public class Calculate{
    public static void main(String[] args){
        String strNum1, strNum2;
        String sumNotification = "Sum: ";
        String difNotification = "Difference: ";
        String proNotification = "Product: ";
        String quoNotification = "Quotient: ";

        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ","Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ","Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,sumNotification + (num1 + num2),
                    "Calculate", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,difNotification + (num1 - num2),
                    "Calculate", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,proNotification + (num1 * num2),
                    "Calculate", JOptionPane.INFORMATION_MESSAGE);
        if(num2 != 0)
        JOptionPane.showMessageDialog(null,quoNotification + (num1 / num2),
                    "Calculate", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Division by zero is not allowed.");

        System.exit(0);

    }
}