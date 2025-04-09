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
