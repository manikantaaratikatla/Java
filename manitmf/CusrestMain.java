<<<<<<< HEAD
package manitmf;

public class CusrestMain {
    public static void main(String[] args) {
        CustomerC customer = new CustomerC();

        customer.displayMenuToUser();
        customer.setMembershipStatus(true);
        customer.setCouponCode("SAVE20");
        customer.setDeliveryOption(true);
        customer.setPaymentMethod("UPI");
        customer.reserveTable();

        customer.displayOrder();

        customer.submitFeedback("Great service and delicious food!");
        customer.submitFeedback("The delivery was a bit slow.");
        customer.displayFeedback();
        customer.displayOrderHistory();
    }
}
=======
package manitmf;



public class CusrestMain {

	public static void main(String[] args) {
       Restaurant rest = new Restaurant();
      //rest.dispaly();
       CustomerC cust = new CustomerC();
       cust.displayMenuToUser();
       cust.displayOrder();

    	        cust.setMembershipStatus(true);

    	        cust.setCouponCode("SAVE20");

    	        cust.displayOrder();
    	    }
  

}
>>>>>>> 1ab89ee424f48b7415b7552e9eb73fe20ddc0561
