package checkoutkata;

import java.util.HashMap;

public class Checkout {
    private HashMap<Character, Integer> prices;
    private HashMap<String, Integer> discounts;

    public Checkout() {
        prices = new HashMap<Character, Integer>();
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);

        discounts = new HashMap<String, Integer>();
        discounts.put("AAA", 20);
        discounts.put("BB", 15);
    }

    public int price(String items) {


        char[] itemsArray = items.toCharArray();

        Integer total = 0;
        for (char item : itemsArray) {
            total += prices.get(item);
        }

        Integer deduction = GetDeductedAmount(items);

        return total - deduction;
    }

    private Integer GetDeductedAmount(String items) {
        Integer deduction = 0;
        for (String key : discounts.keySet()) {
            if (items.contains(key))
                deduction += discounts.get(key);
        }
        return deduction;
    }
}
