import java.util.Scanner;
public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      int cartTotal = 0;
      String productName = "none";
      int productPrice = 0;
      int productQuantity = 0;
      System.out.println("Item 1");
      ItemToPurchase item1 = new ItemToPurchase();
      productName=scnr.hasNext()?scnr.next():"";
      item1.setName(productName);
      productPrice=(scnr.hasNextInt())?scnr.nextInt():0;
      item1.setPrice(productPrice);
      productQuantity=(scnr.hasNextInt())?scnr.nextInt():0;
      item1.setQuantity(productQuantity);
      if (scnr.hasNextLine()){
         String extra = scnr.nextLine();
      }
      else{
         System.out.println();
      }
      System.out.println("Item 2");
      ItemToPurchase item2 = new ItemToPurchase();
      productName=(scnr.hasNext())?scnr.next():"0";
      item1.setName(productName);
      productPrice=(scnr.hasNextInt())?scnr.nextInt():0;
      item1.setPrice(productPrice);
      productQuantity=(scnr.hasNextInt())?scnr.nextInt():0;
      item1.setQuantity(productQuantity);
   /*
      Add costs of two items and print total
      cartTotal = item one price + item two price
      item one information
   */
      double total = 0;
      total = item1.getPrice(productPrice) + item2.getPrice(productPrice);
      // Total output
      item1.printItemPurchase(item1.getName(productName),item1.getPrice(productPrice),item1.getQuantity(productQuantity));
      item2.printItemPurchase(item2.getName(productName),item2.getPrice(productPrice),item2.getQuantity(productQuantity));
      System.out.print("Total: $");
      System.out.println(total);
      scnr.close();
      /*
      Add costs of two items and print total
      cartTotal = item one price + item two price
      Total Cost
      item one information
      item two information
      Total output
      */
      return;
   }
}