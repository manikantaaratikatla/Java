package RestMain;

import java.util.*;

public class RestaurantMenu {
    protected HashMap<String, Integer> menu;

    public RestaurantMenu() {
        menu = new HashMap<>();
        menu.put("idli", 30);
        menu.put("dosa", 40);
        menu.put("vada", 25);
        menu.put("poori", 35);
        menu.put("upma", 28);
        menu.put("paratha", 45);
        menu.put("pongal", 38);
    }

    public void displayMenu() {
        System.out.println("Food\tPrice");
        for (String food : menu.keySet()) {
            System.out.println(food + "\t" + menu.get(food));
        }
    }
}