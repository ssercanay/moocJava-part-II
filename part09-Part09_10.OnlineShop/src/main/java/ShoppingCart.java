
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart(){
        this.items = new HashMap<>();

    }
    
    public void add(String product, int price){

        
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
            this.items.replace(product, new Item(product, items.get(product).qty(), price));
        } else {
            this.items.put(product, new Item(product, 1, price));
            }
    }
    
    public int price(){
        int sum = 0;
        for (Item item: items.values()) {
            sum = sum + item.price();
        }
        return sum;
    }
    
    public void print(){
        for (Item item: items.values()) {
            System.out.println(item.toString());;
        }       
    }
}
