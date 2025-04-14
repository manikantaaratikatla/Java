package manitmf;

import java.util.*;

public class CustomerC extends Restaurant {
    private HashMap<String, Integer> order;
    private boolean isMember;
    private String couponCode;
    private final double gstRate = 18.0;
    private ArrayList<String> feedbackList;
    private ArrayList<String> orderHistory;
    private boolean isDelivery;
    private String paymentMethod;
    private boolean tableReserved;

    public CustomerC() {
        super();
        order = new HashMap<>();
        feedbackList = new ArrayList<>();
        orderHistory = new ArrayList<>();
        isMember = false;
        couponCode = "";
        isDelivery = false;
        paymentMethod = "Cash";
        tableReserved = false;

        // Sample initial order
        order.put("idli", 3);
        order.put("dosa", 2);
    }

    public void displayMenuToUser() {
        super.displayMenu();
    }

    public void displayOrder() {
        System.out.println("Food\tPrice\tQty\tTotal");
        int totalBill = 0;

        for (String item : order.keySet()) {
            int itemTotal = menu.get(item) * order.get(item);
            System.out.println(item + "\t" + menu.get(item) + "\t" + order.get(item) + "\t" + itemTotal);
            totalBill += itemTotal;
        }

        int membershipDiscount = isMember ? applyMembershipDiscount(totalBill) : 0;
        int couponDiscount = !couponCode.isEmpty() ? applyCouponDiscount(totalBill) : 0;

        int totalDiscount = membershipDiscount + couponDiscount;
        int amountBeforeGST = totalBill - totalDiscount;
        double gstAmount = calculateGST(amountBeforeGST);
        double finalBill = amountBeforeGST + gstAmount;

        System.out.println("Membership Discount: " + membershipDiscount);
        System.out.println("Coupon Discount: " + couponDiscount);
        System.out.println("Amount Before GST: " + amountBeforeGST);
        System.out.println("GST (@ " + gstRate + "%): " + gstAmount);
        System.out.println("Final Bill: " + finalBill);
        System.out.println("Delivery Option: " + (isDelivery ? "Delivery" : "Pickup"));
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Table Reserved: " + (tableReserved ? "Yes" : "No"));

        orderHistory.add("Order Total: " + finalBill);
    }

    private int applyMembershipDiscount(int total) {
        String level = "Gold";
        switch (level) {
            case "Gold": return (total * 15) / 100;
            case "Silver": return (total * 10) / 100;
            case "Bronze": return (total * 5) / 100;
            default: return 0;
        }
    }

    private int applyCouponDiscount(int total) {
        switch (couponCode) {
            case "SAVE10": return (total * 10) / 100;
            case "SAVE20": return (total * 20) / 100;
            default: return 0;
        }
    }

    private double calculateGST(int amount) {
        return (amount * gstRate) / 100;
    }

    public void setMembershipStatus(boolean status) {
        isMember = status;
    }

    public void setCouponCode(String code) {
        couponCode = code;
    }

    public void submitFeedback(String feedback) {
        if (feedback != null && !feedback.trim().isEmpty()) {
            feedbackList.add(feedback);
            System.out.println("Feedback submitted. Thank you!");
        } else {
            System.out.println("Feedback cannot be empty.");
        }
    }

    public void displayFeedback() {
        System.out.println("----- Customer Feedback -----");
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (int i = 0; i < feedbackList.size(); i++) {
                System.out.println((i + 1) + ". " + feedbackList.get(i));
            }
        }
    }

    public void displayOrderHistory() {
        System.out.println("----- Order History -----");
        if (orderHistory.isEmpty()) {
            System.out.println("No previous orders.");
        } else {
            for (String entry : orderHistory) {
                System.out.println(entry);
            }
        }
    }

    public void setDeliveryOption(boolean delivery) {
        isDelivery = delivery;
    }

    public void setPaymentMethod(String method) {
        paymentMethod = method;
    }

    public void reserveTable() {
        tableReserved = true;
        System.out.println("Table reserved successfully.");
    }
}