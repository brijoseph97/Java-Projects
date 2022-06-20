/**
CreditCardPayment Class
This class derives from the payment class and processes 
credit card payments. This class creates an object with the
total amount paid and then a specification of the name on
the card, the expiration date, and the card number. The class 
overrides the Payment classes paymentDetails method to include 
the card information along with the amount of the payment.
**/

public class CreditCardPayment extends Payment {
   //Declare Variables
   private String name;
   private String expirationDate; //Used string to accept the / or written dates
   private int creditCardNumber;
   
   /**
   Constructor
   @param amount The amount of the payment
   @param aName The name on the credit card
   @param aDate The expiration date of the card
   @param aNumber The credit card number
   */
   public CreditCardPayment(double amount, String aName, String aDate, int aNumber) {
      super.setPaymentAmount(amount);
      name = aName;
      expirationDate = aDate;
      creditCardNumber = aNumber;
   }
   
   /**
   getName returns the name on the credit card
   @return The name on the credit card
   */
   public String getName() {
      return name;
   }
   
   /**
   getExpirationDate returns the expiration date for the card
   @return The card's expiration date
   */
   public String getExpirationDate() {
      return expirationDate;
   }
   
   /**
   getCreditCardNumber returns the credit card number
   @return The credit card number
   */
   public int getCreditCardNumber() {
      return creditCardNumber;
   }

   /**
   setName sets the name on the credit card
   @param aName The name on the credit card
   */   
   public void setName(String aName) {
      name = aName;
   }

   /**
   setExpirationDate sets the expiration date of the card
   @param expires When the card expires
   */   
   public void setExpirationDate(String expires) {
      expirationDate = expires;
   }

   /**
   setCreditCardNumber sets the credit card number of the card
   @param creditCard The credit card number
   */   
   public void setCreditCardNumber(int creditCard) {
      creditCardNumber = creditCard;
   }

   /**
   paymentDetails Creates a sentence that states the amount paid and info about the credit
   card, including name, expiration date, and the credit card number.
   */   
   @Override
   public String paymentDetails() {
      return "A payment of $" + super.getPaymentAmount() + " was made with a credit card with the credit card number "
             + getCreditCardNumber() + ", which is under the name " + getName() + " and expires in " + getExpirationDate() + ".";
   }

   @Override 
   public String toString() {
      return paymentDetails();
   }
      
}