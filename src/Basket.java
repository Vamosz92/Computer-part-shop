import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> basket = new ArrayList();
    private int value;
    
    public void addToBasket(Item anItem){
        basket.add(anItem);
        value += anItem.getPrice();
    }
    
    public void deleteAnItem(int index){
        value -= basket.get(index).getPrice();
        basket.remove(index);
    }
    
    public Item getAnItem(Basket aBasket, int index){
        return basket.get(index);
    }
    
    public int getBasketSize(){
        return basket.size();
    }
    
    public int getValue(){
        return value;
    }
}
