import java.util.Scanner;
public class Number_Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum;
        double secNum;
        try {
            System.out.print("Enter the first number: ");
            firstNum = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            secNum = scanner.nextDouble();
            if (firstNum == secNum) {
                System.out.println("The numbers are equal.");
            }
            else {
                double min = Math.min(firstNum, secNum);
                System.out.println("The smaller number is: " + min);
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
        finally {
            scanner.close();
        }
    }
}
