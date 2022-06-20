/**
Created program that converts a given Fahrenheit temperature (87.6) to Celsius and then
displayed both the fahrenheit temperature and the celsius temperature. 
Used (F - 32) * 5/9 to convert fahrenheit to celsius.
**/

class Temperature
{
   public static void main(String[] args)
   {
      //Declare and initiate variables
      
      /*
      Using floats for the temperature conversion instead of doubles because it is not as 
      necessary to have the accuracy after the decimal point a double provides for a temperature
      reading.The seven digits of accuracy will suffice.
      */
      
      float fahrenheit = 87.6F;
      float celsius;
      
      //Formula for F to C is (F - 32) * 5/9
      
      celsius = (fahrenheit - 32.0F) * (5.0F / 9.0F);
      
      //Display output
      System.out.println("Fahrenheit Temperature: " + fahrenheit);
      System.out.println("Celsius Temperature: " + celsius);
   }
}