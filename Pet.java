import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
public class Pet {
    Scanner scnr = new Scanner(System.in);
    Pet(){
        getPetType();
        getPetName();
        getPetAge();
        getAmountDue();
        setPetType();
        setPetName();
        setPetAge();
        setCatSpaces();
        setDogSpaces();
        }public void Main(String[]args){
        String petType = "";
        String petName = "";
        int petAge = 0;
        ArrayList<Integer> catSpaces = new ArrayList<Integer>(12);
        ArrayList<Integer> dogSpaces = new ArrayList<Integer>(30);
        int daysStay = 0;
        double amountDue = 0;
        public String getPetType() {
            return this.petType;
        }public String getPetName() {
            return this.petName;
        }public int getPetAge() {
            return this.petAge;
        }public int getCatSpaces() {
            return this.catSpaces;
        }public int getDogSpaces() {
            return this.dogSpaces;
        }public int getDaysStay() {
            return this.daysStay;
        }public double getAmountDue() {
            return this.amountDue;
        }private void setCatSpaces() {
            catSpaces = scnr.nextInt();
        }private void setDogSpaces() {
            dogSpaces = scnr.nextInt();
        }private void setDaysStay() {
            daysStay = scnr.nextInt();
        }private void setAmountDue() {
            amountDue = scnr.nextDouble();
        }}}
