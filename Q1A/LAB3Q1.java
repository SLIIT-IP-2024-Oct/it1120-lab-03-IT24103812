import java.util.Scanner;

          public class LAB3Q1{
          public static void main(String args[]){

          Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the price of 1kg pf rice:");
         double price = scanner.nextDouble();

         System.out.print("Enter the number of kilogram you want to buy:");
         double number = scanner.nextDouble();
 
         double totalamount = price * number;
         System.out.println("The total amount to pay is:"+ totalamount);
          scanner.close();
     
       }
}
