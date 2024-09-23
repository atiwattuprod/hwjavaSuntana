import java.util.HashMap;
import java.util.Map;

public class cafe {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = about_creating_menu();
        listMenuItems(menu);
        Order[] todaySales = {
            new Order("Lemon Tea", 1),
            new Order("Punch", 2),
            new Order("Espresso", 3),
            new Order("Punch", 4),
            new Order("Lemon Tea", 5),
            new Order("Espresso", 6)
        };
        int moneyInCashierBox = 0;
        for (int i = 0; i < todaySales.length; i++) {
            moneyInCashierBox += menu.get(todaySales[i].item) * todaySales[i].quantity;
        }
        System.out.println(moneyInCashierBox);
    }

    static HashMap<String, Integer> about_creating_menu() {
        HashMap<String, Integer> toBeReturn = new HashMap<>();
        toBeReturn.put("Punch", 10);
        toBeReturn.put("Espresso", 15);
        toBeReturn.putIfAbsent("Lemon Tea", 19);
        return toBeReturn;
    }

    static void listMenuItems(HashMap<String, Integer> menu) {
        System.out.println("We serve:");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry);
            String itemName = entry.getKey();
            int itemPrice = entry.getValue();
            System.out.printf("%s is %d baht%n", itemName, itemPrice);
        }
        System.out.println("Only the following keys are available:");
        for (var keys : menu.keySet()) {
            System.out.println(keys);
        }
        for (int price : menu.values()) {
            System.out.println(price);
        }
    }
}

class Order {
    String item;
    int quantity;

    Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
}


