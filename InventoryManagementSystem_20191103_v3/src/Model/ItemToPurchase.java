package Model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Items to Purchase Class
 */
public class ItemToPurchase 
{
    private StringProperty item;
    private DoubleProperty quantity;
    private StringProperty supplier;
    
    public ItemToPurchase()
    {
        this(null, null, null);
    }
    
    public ItemToPurchase(String item, Double quantity, String supplier)
    {
        this.item = new SimpleStringProperty(item);
        this.quantity = new SimpleDoubleProperty(quantity);
        this.supplier = new SimpleStringProperty(supplier);
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

    /**
     * @return the supplier
     */
    public StringProperty getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(StringProperty supplier) {
        this.supplier = supplier;
    }
}
