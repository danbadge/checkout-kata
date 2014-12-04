package checkoutkata;

import java.util.HashMap;

public class Checkout {
    private HashMap<Character, Integer> prices;

    public Checkout() {
        prices = new HashMap<Character, Integer>();
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);
    }

    public int price(String items) {
        char[] itemsArray = items.toCharArray();

        Integer total = 0;
        for (char item : itemsArray) {
            total += prices.get(item);
        }

        return total;
    }
}
