package Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Supplier Class
 */
public class Supplier 
{
    private SimpleIntegerProperty key;
    private SimpleStringProperty supplier;
    
    public Supplier(Integer key, String item)
    {
        this.key = new SimpleIntegerProperty(key);
        this.supplier = new SimpleStringProperty(item);
    }
    
     public Supplier(String item)
    {
        this.supplier = new SimpleStringProperty(item);
    }

    /**
     * @return the key
     */
    public SimpleIntegerProperty getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(SimpleIntegerProperty key) {
        this.key = key;
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



    
}
