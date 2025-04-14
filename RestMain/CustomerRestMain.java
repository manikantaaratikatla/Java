package RestMain;

import java.util.*;

public class CustomerRestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerOrder customer = new CustomerOrder();

        customer.displayMenuToUser();
        customer.takeOrderFromUser(sc);

        System.out.print("Are you a member? (yes/no): ");
        String memberInput = sc.nextLine();
        customer.setMembershipStatus(memberInput.equalsIgnoreCase("yes"));

        System.out.print("Enter coupon code (or press Enter to skip): ");
        String coupon = sc.nextLine();
        customer.setCouponCode(coupon);

        System.out.print("Do you want delivery? (yes/no): ");
        customer.setDeliveryOption(sc.nextLine().equalsIgnoreCase("yes"));

        System.out.print("Enter payment method (Cash/UPI/Card): ");
        customer.setPaymentMethod(sc.nextLine());

        System.out.print("Do you want to reserve a table? (yes/no): ");
        if (sc.nextLine().equalsIgnoreCase("yes")) {
            customer.reserveTable();
        }

        customer.displayOrder();

        System.out.print("Would you like to give feedback? (yes/no): ");
        if (sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter your feedback: ");
            customer.submitFeedback(sc.nextLine());
        }

        customer.displayFeedback();
        customer.displayOrderHistory();
        sc.close();
    }
}