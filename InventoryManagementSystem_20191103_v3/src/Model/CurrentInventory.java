package Model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Current Inventory Class
 */
public class CurrentInventory 
{
    private StringProperty item;
    private DoubleProperty quantity;
    
    public CurrentInventory()
    {
        this(null, null);
    }
    
    public CurrentInventory(String item, Double quantity)
    {
        this.item = new SimpleStringProperty(item);
        this.quantity = new SimpleDoubleProperty(quantity);
    }

    /**
     * @return the item
     */
    public StringProperty getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(StringProperty item) {
        this.item = item;
    }

    /**
     * @return the quantity
     */
    public DoubleProperty getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(DoubleProperty quantity) {
        this.quantity = quantity;
    }
}
