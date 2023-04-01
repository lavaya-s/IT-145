import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String itemName = "none";
      double itemPrice = 0;
      int itemQuantity = 0;
      int cartTotal = 0;
      
      System.out.println("Item 1");
      ItemToPurchase item1 = new ItemToPurchase(scnr.next(),scnr.nextDouble(),scnr.nextInt());
      if (scnr.hasNextLine()){
         String extra = scnr.nextLine();
      }
      else{
         System.out.println();
      }
      System.out.println("Item 2");
      ItemToPurchase item2 = new ItemToPurchase(scnr.next(),scnr.nextDouble(),scnr.nextInt());
      // Add costs of two items and print total
     
      // cartTotal = item one price + item two price
      // item one information
   
      double total = 0;
      total = item1.getPrice() + item2.getPrice();
      // Total output
      item1.printItemPurchase(item1.getName(),item1.getPrice(),item1.getQuantity());
      item2.printItemPurchase(item2.getName(),item2.getPrice(),item2.getQuantity());
      System.out.print("Total: $");
      System.out.println(total);
      scnr.close();
      
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      // Totoal Cost
      // item one information
      // item two information
      // Total output
      
      return;
   }
}