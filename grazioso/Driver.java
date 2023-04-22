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
                case "4"://allows fall through stwitchcases to the the print animals method
                case "5":
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
    public static void initializeMonkeyList() {
        Monkey monkey1Monkey = new Monkey(5, 5, 5, "monkey", "banana", "female", "five", "twenty", "1/1/2022", "america", "intermediate", false, "america");
        monkeyList.add(monkey1Monkey);
    }

    // input validation to check that the dog is not already in the list
    public static void intakeNewDog(Scanner scnr) {
        System.out.println(" Please enter all input without spaces!!!!");
        System.out.println("What is the dog's name?");
        String name = scnr.next();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)&&name!=null) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // instantiate a new dog and add it to the appropriate list
        try{
            System.out.println(" Please enter dog breed: ");//prompt the user for input
            String dogBreed = scnr.next();
            System.out.println(" Please enter dog gender: ");
            String dogGender = scnr.next();
            System.out.println(" Please enter dog age: ");
            String dogAge = scnr.next();
            System.out.println(" Please enter dog weight: ");
            String dogWeight =scnr.next();
            System.out.println(" Please enter aquisition date: ");
            String dogAquisitionDate = scnr.next();
            System.out.println(" Please enter country of aquisition: ");
            String dogAquisitionCountry = scnr.next();
            System.out.println(" Please enter training status of dog: ");
            String dogTrainingStatus = scnr.next();
            boolean dogReserve = false;
            System.out.println(" Please enter dog country: ");
            String dogCountry = scnr.next();
            Dog dog1Dog = new Dog(name,dogBreed,dogGender,dogAge,dogWeight,dogAquisitionDate,dogAquisitionCountry,dogTrainingStatus,dogReserve,dogCountry);
            dogList.add(dog1Dog);//add the new dog to the list
        }catch (Exception inputMismatchException){//executes if the user inputs an invalid entry
            System.out.println("Invalid input, Please try again");
            return;
        }
        return;
    }

	//Instantiate and add the new monkey to the appropriate list
    public static void intakeNewMonkey(Scanner scnr) {
        System.out.println("Please enter all entres without spaces!!!!!");
        System.out.println("What is the monkey's name?");
        String name = scnr.next();
        for(Monkey monkey: monkeyList) {//iterate over the monkeys in the list
            if(monkey.getName().equalsIgnoreCase(name) && name != null) {//check to make sure the name is not empty and not already taken. 
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        try{
            System.out.println(" Please enter length of the monkeys tail: ");
            double tailLength = scnr.nextDouble();
            System.out.println(" Please enter monkey height: ");
            double height = scnr.nextDouble();
            System.out.println(" Please enter monkey body length: ");
            double bodyLength = scnr.nextDouble();
            System.out.println(" Please enter monkey species: ");
            String species = scnr.next();
            System.out.println(" Please enter monkey gender: ");
            String gender = scnr.next();
            System.out.println(" Please enter monkey age: ");
            String age = scnr.next();
            System.out.println(" Please enter monkey weight: ");
            String weight =scnr.next();
            System.out.println(" Please enter aquisition date: ");
            String acqDate = scnr.next();
            System.out.println(" Please enter country of aquisition: ");
            String acqCountry = scnr.next();
            System.out.println(" Please enter training status of monkey: ");
            String trainingStatus = scnr.next();
            boolean reserved = false;
            System.out.println(" Please enter monkey country: ");
            String inServiceCountry = scnr.next();
            Monkey Monkey1 = new Monkey(tailLength,height,bodyLength,species,name,gender,age,weight,acqDate,acqCountry,trainingStatus,reserved,inServiceCountry);
            monkeyList.add(Monkey1);
        }catch (Exception inputMismatchException){
            System.out.println("Invalid input, Please try again");
            return;
        }
        return;
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scnr) {
            System.out.println("Would you like to reserve a dog or monkey?");
            String animal = scnr.next();//check to see which animal is being reserved
            boolean reserved = true;
            if (animal.equalsIgnoreCase("monkey")){
                System.out.print("Please enter the monkeys name: ");
                String name = scnr.next();
                for(Monkey monkey: monkeyList) {
                    if(monkey.getName().equalsIgnoreCase(name) && name != null) {//check to make sure the name is not empty and not already taken. 
                        (monkey).setReserved(reserved);//reserves the animal
                        System.out.println("Thank you for reserving this animal");
                        return; //returns to menu
                    }
                }
                System.out.println("This monkey is not in our system");
                return;
            }
            if (animal.equalsIgnoreCase("dog")){
                System.out.print("Please enter the dogs name: ");
                String name = scnr.next();
                for(Dog dog: dogList) {
                    if(dog.getName().equalsIgnoreCase(name) && name != null) {//check to make sure the name is not empty and not already taken. 
                        (dog).setReserved(reserved);
                        System.out.println("Thank you for reserving this animal");
                        return; //returns to menu
                    }
                }
                System.out.println("This dog is not in our system");
                return;
            }
            System.out.println("You must enter (dog/monkey)");
        }
        public static void printAnimals(String switchCase) {
            //System.out.println("The method printAnimals needs to be implemented");
            switch (switchCase){//continues from the previous switch cases based on the user input
                case "4":
                    for(Dog dog: dogList){
                        if (dog.getReserved()!=true){
                            String name = dog.getName();
                            String location = dog.getInServiceLocation();
                            System.out.format(name);
                            System.out.println(": "+location);
                        }
                    }
                    break;
                case "5":
                    for(Monkey monkey: monkeyList){
                        if (monkey.getReserved()!=true){
                            System.out.format(monkey.getName());
                            System.out.println(": "+monkey.getInServiceLocation());
                        }
                    }
                    break;
                case "6":
                    for(Monkey monkey: monkeyList){
                        if (monkey.getReserved()==true){
                            System.out.println(monkey.getName());
                        }
                    }
                    for(Dog dog: dogList){
                        if (dog.getReserved()==true){
                            System.out.println(dog.getName());
                        }
                    }
                    break;
            }
            return;
        }
}
