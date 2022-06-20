/**
ParkedCar class
Created a class that will store a description of a parked car.
The description will include the make, model, color, license number
and the minutes the car has been parked. Class will be used as part
of a parking ticket program to compare the time that was bought
on the meter to the amount of time the car has been parked to determine
if the car should be given a parking ticket.
**/

public class ParkedCar {
   //Declare Variables
   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int minutesParked;
   
   /**
   Constructor
   @param aMake Make of the car object
   @param aModel Model of the car object
   @param aColor Color of the car object
   @param aLicenseNumber License Number of the car object
   @param numMinutesParked Number of minutes the car object has been parked
   */
   public ParkedCar(String aMake, String aModel, String aColor, String aLicenseNumber, int numMinutesParked) {
      make = aMake;
      model = aModel;
      color = aColor;
      licenseNumber = aLicenseNumber;
      minutesParked = numMinutesParked;
   }
   
   //Getter methods
   
   /**
   getMake method returns the make of the car
   @return Returns the make of a specific car
   */
   public String getMake() {
      return make;
   }
   
   /**
   getModel method returns the model of the car
   @return Returns the model of the specific car
   */
   public String getModel() {
      return model;
   }
   
   /**
   getColor method returns the color of the car
   @return Returns the color of the specific car
   */
   public String getColor() {
      return color;
   }
   
   /**
   getLicenseNumber method returns the license plate of the car
   @return Returns the license plate of the specific car
   */
   public String getLicenseNumber() {
      return licenseNumber;
   }
   
   /**
   getMinutesParked method returns the amount of time the car has been parked
   @return Returns the amount of time a specific car has been parked
   */
   public int getMinutesParked() {
      return minutesParked;
   }
   
   //Setter methods
   
   /**
   setMake method sets the make of a car object
   @param aMake The make of a car
   */
   public void setMake(String aMake) {
      make = aMake;
   }
   
   /**
   setModel method sets the model of a car object
   @param aModel The model of a car
   */
   public void setModel(String aModel) {
      model = aModel;
   }
   
   /**
   setColor method sets the color of a car object
   @param aColor The color of a car
   */
   public void setColor(String aColor) {
      color = aColor;
   }
   
   /**
   setLicenseNumber method sets the license plate number of a car object
   @param aLicenseNumber The license plate number of a car
   */
   public void setLicenseNumber(String aLicenseNumber) {
      licenseNumber = aLicenseNumber;
   }
   
   /**
   setMinutesParked method sets the amount of time a car object has been parked in minutes
   @param numMinutesParked The number of minutes a car has been parked
   */
   public void setMinutesParked(int numMinutesParked) {
      minutesParked = numMinutesParked;
   }
}