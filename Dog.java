import java.util.Scanner;
//import Pet.java;
public class Dog {
	Scanner scnr = new Scanner(System.in);
	Dog(){
		String name = scnr.nextLine();
		setDogWeight();
		setDogSpaceNumber();
		setGrooming();
	}
	public static void main(String[] args) {
		/*init variables for dog*/
		int dogSpaceNumber = 0;//get space number
		double dogWeight = 0;//get dog weight
		boolean grooming = false;//set deafualt to false unless otherwise stated
	}
		public int getDogSpaceNumber() {
			return Pet.dogSpaceNumber;
		}
		private void setDogSpaceNumber() {
			Pet.dogSpaceNumber = scnr.nextInt();
		}
		public double getDogWeight() {
			return Pet.dogWeight;
		}
		private void setDogWeight() {
			this.dogWeight = scnr.nextDouble();
		}
		public boolean getGrooming() {
			return this.grooming;
		}
		private void setGrooming() {
			this.grooming = scnr.nextBoolean();
		}
}