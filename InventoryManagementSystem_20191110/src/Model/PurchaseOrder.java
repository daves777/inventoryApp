package Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;


public class PurchaseOrder {
    private SimpleStringProperty item;
    private SimpleDoubleProperty quantity;
    
    
    public PurchaseOrder()
    {
        this(null, null);
    }
    
    public PurchaseOrder(String item, Double quantity)
    {
        this.item = new SimpleStringProperty(item);
        this.quantity = new SimpleDoubleProperty(quantity);
       
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

}

