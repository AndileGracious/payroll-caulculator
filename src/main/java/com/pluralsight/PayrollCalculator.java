import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name; ");
        String name = myScanner.nextLine();
        System.out.println("Enter hours worked");
        float hours = myScanner.nextFloat();
        System.out.println("Enter the pay rate");
        float payRate = myScanner.nextFloat();
        float grossPay = hours * payRate;

    }
}
