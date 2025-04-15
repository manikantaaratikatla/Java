package RestMain;

import java.util.*;

public class RestaurantMenu {
    protected HashMap<String, Integer> menu;

    public RestaurantMenu() {
        menu = new HashMap<>();
        menu.put("idli", 30);
        menu.put("dosa", 50);
        menu.put("vada", 40);
        menu.put("poori", 40);
        menu.put("upma", 40);
        menu.put("paratha", 50);
        menu.put("pongal", 60);
        menu.put("curd rice",50);
        menu.put("pulihora",80);
        menu.put("fried rice",100);
        menu.put("paneer curry",120);
        menu.put("jeera rice",80);
        menu.put("veg curry",40);
        menu.put("sambar rice",80);
        
    }

    public void displayMenu() {
        System.out.println("Food\tPrice");
        for (String food : menu.keySet()) {
            System.out.println(food + "\t" + menu.get(food));
        }
    }
}
