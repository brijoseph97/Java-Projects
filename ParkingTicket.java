/**
ParkingTicket class
Created a class that will issue a ticket if a parked car
has went over the amount of time parked. The parking ticket
program is run through the main method within this class,
where the user is asked to input the information to identify
the car and the officer, along with how long the car has been 
parked and the amount of time that was purchased on the meter.
If a ticket is necessary, the class calculates the total fine
that should be given to the car, for the first hour it's $25
and for every hour on top of that an extra $10 is added.
*/

import java.util.Scanner;

public class ParkingTicket {
   //Declare Variables
   private ParkedCar car;
   private ParkingMeter meter;
   private int fine = 0;
   private PoliceOfficer officer;
   
   /**
   Constructor Method
   @param An object of a parked car
   @param An object of a parking meter
   @param An object of a police officer
   */
   public ParkingTicket(ParkedCar aParkedCar, ParkingMeter aParkingMeter, PoliceOfficer aOfficer) {
      car = aParkedCar;
      meter = aParkingMeter;
      officer = aOfficer;
      
      //Calculate Fine
      if (officer.isTimeExpired(car, meter)) { //Checks if a fine should be given
         fine = 25;
         int timeSinceExpired = car.getMinutesParked() - meter.getMinutesPurchased();
         if (timeSinceExpired > 60) { //Checks if anything should be added to 25 base fine
            fine += (10 * (timeSinceExpired / 60));
         }
      }
   }
   
   //Getter methods
   /**
   getOfficerName method returns the officer's name
   @return The name of the officer
   */
   public String getOfficerName() {
      return officer.getOfficerName();
   }
   
   /**
   getBadgeNumber method returns the officer's badge number
   @return The badge number of the officer
   */   
   public int getBadgeNumber() {
      return officer.getBadgeNumber();
   }
   /**
   getFine method returns the amount of the fine to be given
   @return The amount of the fine
   */   
   public int getFine() {
      return fine;
   }
   
   /**
   printTicket method prints the statement that will be issued if the car
   has went over the purchased time.
   */
   public void printTicket() {
      System.out.println("The " + car.getColor() + " " + car.getMake() + " " + car.getModel() + 
                        " with the license plate number of " + car.getLicenseNumber() + " has received" 
                        + " a parking ticket with a fine of $" + fine + " issued by officer " +
                        officer.getOfficerName() + " with the badge number " + officer.getBadgeNumber());
   }
   
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Ask user input for car description
      //Make
      System.out.println("Enter the make of the car: ");
      String carMake = input.nextLine();
      //Model
      System.out.println("Enter the model of the car: ");
      String carModel = input.nextLine();
      //Color
      System.out.println("Enter the color of the car: ");
      String carColor = input.nextLine();
      //License Plate
      System.out.println("Enter the license plate number of the car: ");
      String carLicensePlate = input.nextLine();
      //Minutes parked
      System.out.println("Enter how many minutes the car has been parked: ");
      int carMinutesParked = input.nextInt();
      
      //Create a parked car object with user input
      ParkedCar aCar = new ParkedCar(carMake, carModel, carColor, carLicensePlate, carMinutesParked);
   
      //Ask user input for how long the meter was bought for
      System.out.println("Enter how many minutes were bought on the meter: ");
      int meterMinutes = input.nextInt();
      
      //Create parking meter object
      ParkingMeter aMeter = new ParkingMeter(meterMinutes);
      
      //Ask user input for police officer name and badge number
      //Badge Number
      System.out.println("Enter the officer's badge number: ");
      int policeBadge = input.nextInt();
      
      //Created a second scanner object because it wouldn't let me do another input statement
      //I'm guessing there's a max for how many time's you can use one scanner?
      Scanner input2 = new Scanner(System.in);
      //Name
      System.out.println("Enter the officer's name: ");
      String nameOfOfficer = input2.nextLine();
      
      //Create police officer object
      //PoliceOfficer officer1 = new PoliceOfficer(officersName, policeBadge);
      PoliceOfficer officer1 = new PoliceOfficer(nameOfOfficer, policeBadge);
      
      //Check to see if ticket should be issued
      if (officer1.isTimeExpired(aCar, aMeter)) { //Print's ticket if car has went over purchased amout
         ParkingTicket aTicket = new ParkingTicket(aCar, aMeter, officer1);
         aTicket.printTicket();
      } else { //Car is still within meter time
         System.out.println("No ticket is necessary at this time as the " + aCar.getMake() +
                           " has only been parked for " + aCar.getMinutesParked() + " minutes, " +
                           "which is less than the " + aMeter.getMinutesPurchased() + " minutes purchased.");
      }
   }
}