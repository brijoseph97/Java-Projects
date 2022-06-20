/**
ParkingMeter class
Created a class that will store the amount of times
that was purchased on a parking meter. Will be used
for a parking ticket program, as the parking meter
time will be compared to the amount of time the car
has been parked to determine if the car at the meter
should be given a ticket.
**/

public class ParkingMeter {
   //Declare variables
   private int minutesPurchased;
   
   /**
   Constructor
   @param parkingMeterMinutes Will store the amount of minutes purchased on a parking meter
   */
   public ParkingMeter(int parkingMeterMinutes) {
      minutesPurchased = parkingMeterMinutes;
   }
   
   //Getter method
   
   /**
   getMinutesPurchased method Returns the amount of time purchased on a parking meter
   @return The amount of time purchased
   */
   public int getMinutesPurchased() {
      return minutesPurchased;
   }
   
   //Setter method
   
   /**
   setMinutesPurchased method sets the amount of time purchased on a parking meter
   @param minutes The amount of minutes purchased
   */
   public void setMinutesPurchased(int minutes) {
      minutesPurchased = minutes;
   }
}