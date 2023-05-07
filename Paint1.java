import java.util.InputMismatchException;/*shows error saying this is never used. 
                                            It is in fact in the catch block*/
import java.util.Scanner;
/**/
public class Paint1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        int loop=0;//for input validation
        do{
            try{
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight>0){
                    loop++;
                }
            } 
            catch (Exception inputMismatchException) {
                System.out.println("input not valid");
                scnr.next();//take input but don't add it to anything
            }
        }
        while(loop<=0);//keep looping until user enters a positive number
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        loop--;
        do{
            System.out.println("Enter wall width (feet): ");
        //continue asking for input until user enters a positive number
            try{
                wallWidth = scnr.nextDouble();
            }
            catch (Exception InputMismatchException){
                System.out.println("input not valid");
                scnr.next();
            }
        if (wallWidth>0){
            loop++;
        }
        }
        while (loop<=0);
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");
        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        scnr.close();
    }
}
