import java.util.Scanner;
public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity

   Scanner scnr = new Scanner(System.in);
   public ItemToPurchase(String itemName,double itemPrice,int itemQuantity){
      super();
         itemName = "none";
         itemPrice = 0;
         itemQuantity = 0;
      setName(itemName);
      setPrice(itemPrice);
      setQuantity(itemQuantity);
   }
   //public member methods (mutators & accessors)
   public void setName(String itemName){
      System.out.println("Enter the item name:");
      itemName = itemName;
      
   }
   public String getName(){
      return this.itemName;
   }
   public void setPrice(double itemPrice){
      System.out.println("Enter the item price:");
      itemPrice = itemPrice;
   }
   public double getPrice(){
      return this.itemPrice;
   }
   public void setQuantity(int itemQuantity){
      System.out.println("Enter the item quantity:");
      itemQuantity = itemQuantity;
   }
   public int getQuantity(){
      return this.itemQuantity;
   }
   //print item to purchase
   public void printItemPurchase(String itemName,double itemPrice,int itemQuantity){//int itemQuantity,String itemName,double itemPrice) {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
