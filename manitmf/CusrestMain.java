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