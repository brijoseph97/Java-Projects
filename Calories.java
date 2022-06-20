/**
Created program that shows how many calories a person would burn running 6 mph, playing basketball
and sleeping. This program is based off an 150 pound person, but could be changed for any other weight.
Calories burnt was calculated using this formula:
Calories/Minute = 0.0175 * MET * Weight(Kg)
**/

class Calories
{
      //Declare constant variables at class level
      public static final int METS_RUNNING = 10;
      public static final int METS_BASKETBALL = 8;
      public static final int METS_SLEEPING = 1;
      public static final double LBS_TO_KGS = 2.2;
      public static final int HRS_TO_MINS = 60;
      
      public static void main(String[] args)
      {
         double minutes; //Used double in case someone runs a fraction of a minute
         double weightInLbs = 150; // Used double so people can put in weight in decimals
         double weightInKgs = weightInLbs / LBS_TO_KGS; //Changes weight to Kgs for calorie burnt equation
         minutes = 30; //Time spent running and playing basketball
         
         /*
         Using doubles for all of the calorie calculations so that the calculations are as accurate
         as they can be.
         */
         
         //Calories Burnt Running
         double caloriesBurntRunningTotal = 0.0175 * METS_RUNNING * weightInKgs * minutes;
         double caloriesBurntRunningPerMin = caloriesBurntRunningTotal / minutes;
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntRunningTotal +
                            " calories if they ran 6 MPH for " + minutes + " minutes.");
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntRunningPerMin +
                           " calories per minute running 6 MPH.");
         
         //Calories Burnt Playing Basketball
         double caloriesBurntBasketballTotal = 0.0175 * METS_BASKETBALL * weightInKgs * minutes;
         double caloriesBurntBasketballPerMin = caloriesBurntBasketballTotal / minutes;
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntBasketballTotal +
                            " calories if they played basketball for " + minutes + " minutes.");
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntBasketballPerMin +
                           " calories per minute playing basketball.");
         
         //Calories burnt Sleeping
         double hours = 6; //Used Double for half hours
         minutes = hours * HRS_TO_MINS; //Convert Hours to minutes
         
         double caloriesBurntSleepingTotal = 0.0175 * METS_SLEEPING * weightInKgs * minutes;
         double caloriesBurntSleepingPerMin = caloriesBurntSleepingTotal / minutes;
         double caloriesBurntSleepingPerHr = caloriesBurntSleepingPerMin * 60;
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntSleepingTotal +
                            " calories if they slept for " + hours + " hours.");
         System.out.println("A " + weightInLbs + " lb person would burn " + caloriesBurntSleepingPerMin +
                           " calories per minute sleeping and " + caloriesBurntSleepingPerHr + " calories per hour.");
         
      }
}
