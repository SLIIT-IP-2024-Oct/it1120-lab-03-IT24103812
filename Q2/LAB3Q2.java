import java.util.Scanner;

class LAB3Q2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter monthly salary: ");
        double monthlysalary = scanner.nextDouble();

        System.out.print("Enter the numberof othour: ");
        double othour = scanner.nextDouble();

        System.out.print("Enter the hourly Rate:");
        double othourlyrate = scanner.nextDouble();

        double otAmount=othour * othourlyrate;
        double totalsalary=monthlysalary + otAmount;

        System.out.println("totaly Salary:"+totalsalary);

        scanner.close();
    }
}


