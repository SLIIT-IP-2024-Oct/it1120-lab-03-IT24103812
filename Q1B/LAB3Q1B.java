import java.util.Scanner;
public class LAB3Q1B{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice:");
        double price=scanner.nextDouble();

        System.out.print("Enter the number of kilogramyou want to buy:");
        double number=scanner.nextDouble();

        double totalAmount=price*number;
        double discount = totalAmount*0.1;
                double finalAmount = totalAmount-discount;


    System.out.println("totalAmount with discount:"+finalAmount);

        scanner.close ();
    }
}