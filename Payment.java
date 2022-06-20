/**
Payment Class
This class stores the amount of a payment. This class
also runs the program by creating a for loop of the four
payments, two cash and two credit card, and displays the
information of each payment by calling the toString method
for each payment.
**/

public class Payment {
   
   //Declare Variables
   private double paymentAmount = 0.0;
   
   /**
   getPaymentAmount returns the amount that has been paid for each object
   @return The total payment
   */
   public double getPaymentAmount() {
      return paymentAmount;
   }
   
   /**
   setPaymentAmount sets the amount of the payment
   @param amount The amount of the payment
   */
   public void setPaymentAmount(double amount) {
      paymentAmount = amount;
   }
   
   /**
   paymentDetails returns the amount that has been paid in a sentence format
   @return Sentence saying how much has been paid
   */
   public String paymentDetails() {
      return "A payment of $" + paymentAmount + " has been made.";
   }
   
   @Override
   public String toString() {
      return paymentDetails();
   }
   //}
   
   public static void main(String args[]) {
      //Create array of payment objects
      Payment payments[] = new Payment[4];
      
      //Cash payments
      payments[0] = new CashPayment(45.45, "euros");
      payments[1] = new CashPayment(128.38, "pesos");
      //Credit Card Payments
      payments[2] = new CreditCardPayment(75.55, "Amy Smith", "09/21", 5475345);
      payments[3] = new CreditCardPayment(81.32, "Janet Boslin", "10/28", 678290);
      
      for (int index = 0; index < payments.length; index++) {
         System.out.println(payments[index].toString()); //Call toString method to print details for each payment
      }
   }
}