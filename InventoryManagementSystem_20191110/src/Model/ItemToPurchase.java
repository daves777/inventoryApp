package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Items to Purchase Class
 */
public class ItemToPurchase 
{
    private SimpleStringProperty item;
    private SimpleDoubleProperty quantity;
    private SimpleStringProperty supplier;
    
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
    public SimpleStringProperty getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(SimpleStringProperty item) {
        this.item = item;
    }
    
    public SimpleStringProperty ItemProperty(){
        return item;
    }

    /**
     * @return the quantity
     */
    public SimpleDoubleProperty getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(SimpleDoubleProperty quantity) {
        this.quantity = quantity;
    }
    
    public SimpleDoubleProperty QuantityProperty() {
        return quantity;
    }

    /**
     * @return the supplier
     */
    public SimpleStringProperty getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(SimpleStringProperty supplier) {
        this.supplier = supplier;
    }
    
    public SimpleStringProperty SupplierProperty(){
        return supplier;
    }

   
}