/**
CashPayment Class
This class derives from the payment class and processes 
cash payments. This class creates an object with the
total amount paid and then a specification of what
foreign currency was used, for example dollars, pesos,
yen, pounds, etc. The class overrides the Payment classes
paymentDetails method to include the type of currency
that is relevant to cash payments along with the amount.
**/

public class CashPayment extends Payment {
   //Declare Variables
   private String currencyType;
   
   /**
   Constructor
   @param amount The total amount of the payment
   @param type The type of currency used
   */
   public CashPayment(double amount, String type) {
      super.setPaymentAmount(amount);
      currencyType = type;  
   }
   
   /**
   getCurrencyType returns the type of currency used
   @return The type of currency used for the payment
   */
   public String getCurrencyType() {
      return currencyType;
   }

   /**
   setCurrencyType sets the currency type
   @param aType The type of currency used
   */   
   public void setCurrencyType(String aType) {
      currencyType = aType;
   }
   
   /**
   paymentDetails Creates a sentence that states the amount paid and what type of currency was used
   @return Sentence saying the amount paid and the type of currency used for the payment
   */
   @Override
   public String paymentDetails() {
      return "A payment of " + super.getPaymentAmount() + " was made in cash using " + getCurrencyType() + ".";
   }
   
   @Override
   public String toString() {
      return paymentDetails();
   }
   
   
}