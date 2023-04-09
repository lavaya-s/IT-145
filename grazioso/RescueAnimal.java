
//TODO: delete the print staments in the methods
import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) {
		System.out.println("Enter animal type: ");
		this.animalType = animalType;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		System.out.println("Enter gender: ");
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		System.out.println("Enter age: ");
		this.age = age;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		System.out.println("Enter weight: ");
		this.weight = weight;
	}


	public String getAcquisitionDate() {
		return acquisitionDate;
	}


	public void setAcquisitionDate(String acquisitionDate) {
		System.out.println("Enter aquisition date: ");
		this.acquisitionDate = acquisitionDate;
	}


	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}


	public void setAcquisitionLocation(String acquisitionCountry) {
		System.out.println("Enter aquisition location: ");
		this.acquisitionCountry = acquisitionCountry;
	}


	public boolean getReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		System.out.println("Set reserved status [true/false]:");
		this.reserved = reserved;
	}


	public String getInServiceLocation() {
		return inServiceCountry;
	}


	public void setInServiceCountry(String inServiceCountry) {
		System.out.println("Enter service country: ");
		this.inServiceCountry = inServiceCountry;
	}




	public String getTrainingStatus() {
		return trainingStatus;
	}


	public void setTrainingStatus(String trainingStatus) {
		System.out.println("Enter training status: ");
		this.trainingStatus = trainingStatus;
	}
}
