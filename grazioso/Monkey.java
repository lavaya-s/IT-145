/*In a new Java file, create the Monkey class, using the specification document as a guide. The Monkey class must do the following:
Inherit from the RescueAnimal class.*/
public class Monkey extends RescueAnimal{
    private double tailLength;
    private double height;
    private double bodyLength;
    private String species;
    public Monkey(double tailLength, double height,double bodyLength, String species, String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry){
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }
    public void setTailLength(double tailLength){
        this.tailLength = tailLength;
    }
    public void setHeight(double height){
        this.height = height;
    } 
    public void setBodyLength(double bodyLength){
        this.bodyLength = bodyLength;
    }  
    public void setSpecies(String species){
        this.species = species;
    }
    public double getTailLength(double tailLength){
        return tailLength;
    }
    public double getHeight(double height){
        return height;
    }
    public double getBodyLength(double bodyLength){
        return bodyLength;
    }
    public String getSpecies(String species){
        return species;
    }
/*Implement all attributes to meet the specifications.
Include a constructor. You may use a default constructor. 
To score “exemplary” on this criterion, 
you must include the more detailed constructor that takes all values for the attributes and sets them.
Refer to the constructor in the Dog class for an example.
Include accessors and mutators for all implemented attributes.*/
}
