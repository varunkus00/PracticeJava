import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Item implements Comparable<Item> {

    private String itemName;
    private int itemPrice;

    public Item(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public int compareTo(Item o) {
        if( ((Item)o).getItemPrice() > this.itemPrice  )
            return 1;
        else if( ((Item)o).getItemPrice() < this.itemPrice  )
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return itemName + ": " + itemPrice;
    }

}
