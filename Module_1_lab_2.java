import java.util.Scanner; 
public class Module_1_lab_2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;//start with zero by default
//can only print one type at a time
      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      System.out.print("You entered: ");
      System.out.println(userNum);
      System.out.print(userNum);
      System.out.print(" squared is ");
      int userNumSquared = userNum*userNum;//initialize the variable by squaring usernum
      int userNumCubed = userNumSquared*userNum;//use usernumsquared to initialize this variable
      System.out.println(userNumSquared);
      System.out.print("And ");
      System.out.print(userNum);
      System.out.print(" cubed is ");
      System.out.print(userNumCubed);
      System.out.println("!!");
      System.out.println("Enter another integer: ");
      int userNum2 = 0;
      userNum2 = scnr.nextInt();//take the next integer from the user
      int sum = 0;//initialize as integer at zero
      int product = 0;
      sum = userNum + userNum2;//set the sum to the sum of both user inputs
      product = userNum * userNum2;//do the same for product with multiplication
      System.out.print(userNum);
      System.out.print(" + ");
      System.out.print(userNum2);
      System.out.print(" is ");
      System.out.println(sum);
      System.out.print(userNum);
      System.out.print(" * ");
      System.out.print(userNum2);
      System.out.print(" is ");
      System.out.println(product);
      return;
   }
}