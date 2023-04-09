import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    //arraylists to hold the animals data
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        //set a loop conditions for the program to run
        boolean loop = true;
        //initialize the lists
        initializeDogList();
        initializeMonkeyList();

        // a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        do{
            Scanner scnr = new Scanner(System.in);
            displayMenu();
            String switchCase = scnr.next();//take input for the options
            switch (switchCase){//use the option input for switch case
                case "1":
                    intakeNewDog(scnr);
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                 case "4":
                    printAnimals(switchCase);
                    break;
                case "5":
                    printAnimals(switchCase);
                    break;
                case "6":
                    printAnimals(switchCase);
                    break;
                case "q":
                    loop = false;//stops the program
                    break;
                }
        }while (loop == true);
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        try{
            Dog dog1Dog = new Dog(name,scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.nextBoolean(),scanner.next());
            dogList.add(dog1Dog);
        }catch (Exception inputMismatchException){
            System.out.println("Invalid input, Please try again");
            return;
        }
        return;
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("The method intakeNewMonkey needs to be implemented");
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        try{
            Monkey Monkey1 = new Monkey(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.next(),name,scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.next(),scanner.nextBoolean(),scanner.next());
            monkeyList.add(Monkey1);
        }catch (Exception inputMismatchException){
            System.out.println("Invalid input, Please try again");
            return;
        }
        return;
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }
        public static void printAnimals(String switchCase) {
            //System.out.println("The method printAnimals needs to be implemented");
            switch (switchCase){
                case "4":
                    System.out.println(dogList);
                    break;
                case "5":
                    System.out.println(monkeyList);
                    break;
                case "6":
                    System.out.println("this option needs to be implemented");
                    break;
            }
            return;
        }
}
