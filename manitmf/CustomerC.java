package manitmf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CustomerC extends Restaurant {

    HashMap<String, Integer> order = null;
    boolean isMember;  
    String couponCode; 
    final double gstRate = 18.0;  

    CustomerC() {
        order = new HashMap<String, Integer>(); 
        order.put("idli", 3);
        order.put("dosa", 2);
        this.isMember = false;  
        this.couponCode = "";   
    }

    void displayMenuToUser() {
        super.dispaly();
    }

    void displayOrder() { 
        System.out.println("food \t price \t quantity \t total");

        Set<String> s = new HashSet<>();
        s = order.keySet(); 
        int total = 0;
        int totalBill = 0;

        
        for (String foodName : s) {
            total = menu.get(foodName) * order.get(foodName);
            System.out.println(foodName + "\t " + menu.get(foodName) + "\t " + order.get(foodName) + "\t " + total);
            totalBill += total;
        }

        int membershipDiscount = 0;
        if (isMember) {
            membershipDiscount = applyMembershipDiscount(totalBill);
        }

        int couponDiscount = 0;
        if (!couponCode.isEmpty()) {
            couponDiscount = applyCouponDiscount(totalBill, couponCode);
        }

        int discount = membershipDiscount + couponDiscount;
        int amountBeforeGST = totalBill - discount;

        double gstAmount = calculateGST(amountBeforeGST);

        double finalBill = amountBeforeGST + gstAmount;

        System.out.println("Total Bill Amount: " + totalBill);
        System.out.println("Membership Discount: " + membershipDiscount);
        System.out.println("Coupon Discount: " + couponDiscount);
        System.out.println("Amount Before GST: " + amountBeforeGST);
        System.out.println("GST (@ " + gstRate + "%): " + gstAmount);
        System.out.println("Final Bill after Discounts and GST: " + finalBill);
    }

    int applyMembershipDiscount(int totalBill) {
        int discount = 0;
        if (isMember) {
            String membershipLevel = "Gold"; 

            switch (membershipLevel) {
                case "Gold":
                    discount = (totalBill * 15) / 100;
                    break;
                case "Silver":
                    discount = (totalBill * 10) / 100;
                    break;
                case "Bronze":
                    discount = (totalBill * 5) / 100;
                    break;
                default:
                    discount = 0;
                    break;
            }
        }
        return discount;
    }

    int applyCouponDiscount(int totalBill, String couponCode) {
        int discount = 0;
        if (couponCode.equals("SAVE10")) {
            discount = (totalBill * 10) / 100; 
        } else if (couponCode.equals("SAVE20")) {
            discount = (totalBill * 20) / 100; 
        }
        return discount;
    }

    double calculateGST(int amountBeforeGST) {
        return (amountBeforeGST * gstRate) / 100;
    }

    void setMembershipStatus(boolean isMember) {
        this.isMember = isMember;
    }

    void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
