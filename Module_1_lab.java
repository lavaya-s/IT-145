import java.util.Scanner;
public class Module_1_lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      char userChar = 0;
      String userString;
      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();
      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();
      System.out.println("Enter character: ");
      userChar = scnr.next().charAt(0);
      System.out.println("Enter string: ");
      userString = scnr.next();
      System.out.print(userInt+" ");
      System.out.print(userDouble+" ");
      System.out.print(userChar+" ");
      System.out.println(userString);
      System.out.print(userString+" ");
      System.out.print(userChar+" ");
      System.out.print(userDouble+" ");
      System.out.println(userInt);
      System.out.print(userDouble+" ");
      System.out.print("cast to an integer is ");
      System.out.print((int)userDouble);
      System.out.println();
      return;
   }
}