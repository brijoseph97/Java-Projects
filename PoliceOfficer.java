/**
PoliceOfficer class
Created a class that will provide the basic identification of a
police officer, their name and badge number. Including in this class
are methods to allow the police officer to check to see if a car
should be given a parking ticket, and then give that parking ticket
if necessary.
**/

public class PoliceOfficer {
   //Declare variables
   private String officerName;
   private int badgeNumber;
   private ParkingTicket ticket;
   
   /**
   Constructor
   @param aName The police officer's name
   @param aBadge The police officer's badge number
   */
   public PoliceOfficer(String aName, int aBadge) {
      officerName = aName;
      badgeNumber = aBadge;
   }
   
   //getter methods
   
   /**
   getOfficerName method returns the police officer's name
   @return The name of a police officer
   */
   public String getOfficerName() {
      return officerName;
   }
   
   /**
   getBadgeNumber method returns the police officer's badge number
   @return The badge number of a police officer
   */
   public int getBadgeNumber() {
      return badgeNumber;
   }
   
   //Setter methods
   
   /**
   setOfficerName method sets a police officer's name
   @param aName The police officer's name
   */
   public void setOfficerName(String aName) {
      officerName = aName;
   }
   
   /**
   setBadgeNumber method sets a police officer's badge number
   @param aNumber The police officer's badge number
   */
   public void setBadgeNumber(int aNumber) {
      badgeNumber = aNumber;
   }
   
   /**
   isTimeExpired method checks to see if the amount of time a car has been parked is longer than the purchased time
   */
   public boolean isTimeExpired(ParkedCar aParkedCar, ParkingMeter aParkingMeter) {
      if (aParkedCar.getMinutesParked() > aParkingMeter.getMinutesPurchased())
         return true;
      else
         return false;
   }
}