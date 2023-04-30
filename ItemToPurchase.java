import java.util.Scanner;
public class ItemToPurchase extends ShoppingCartPrinter{
   //Private fields - itemName, itemPrice, and itemQuanity
   private static void ItemToPurchase(){
      String itemName = "none";
      int itemPrice = 0;
      int itemQuantity = 0;
   }
   //public member methods (mutators & accessors)
   public void setName(String productName){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter the item name:");
      String itemName=productName;
      scnr.close();
   }
   public String getName(String itemName){
      return itemName;
   }
   public void setPrice(int productPrice){
      System.out.println("Enter the item price:");
      Scanner scnr = new Scanner(System.in);
      int itemPrice=productPrice;
      scnr.close();
   }
   public int getPrice(int itemPrice){
      return itemPrice;
   }
   public void setQuantity(int productQuantity){
      System.out.println("Enter the item quantity:");
      Scanner scnr = new Scanner(System.in);
      int itemQuantity=productQuantity;
      scnr.close();
   }
   public int getQuantity(int itemQuantity){
      return itemQuantity;
   }
   //print item to purchase
   public void printItemPurchase(String itemName,int itemPrice,int itemQuantity){//int itemQuantity,String itemName,double itemPrice) {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
