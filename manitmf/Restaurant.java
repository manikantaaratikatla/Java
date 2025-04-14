<<<<<<< HEAD
package manitmf;

import java.util.*;

public class Restaurant {
    protected HashMap<String, Integer> menu;

    public Restaurant() {
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
=======
package manitmf;



import java.util.*;

public class Restaurant 
{
       HashMap<String, Integer> menu = null;
       Restaurant()
       {
    	   menu = new HashMap<String, Integer>();
    	   
    	   menu.put("idli",30);
    	   menu.put("dosa",20);
    	   menu.put("vada",10);
    	   menu.put("poori",30);
       }
       
       void dispaly()
       {
    	   Set<String> s= new HashSet();
    	   s = menu.keySet(); //[idli,dosa...]
    	   System.out.println("food \t prise \t");
    	   for(String foodname : s)
    	   {
    		   System.out.println(foodname + "\t " + menu.get(foodname));
    	   }
       }
}
>>>>>>> 1ab89ee424f48b7415b7552e9eb73fe20ddc0561
