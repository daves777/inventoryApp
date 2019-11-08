package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Supplier Class
 */
public class Supplier 
{
    private StringProperty key;
    private StringProperty supplier;
    
    public Supplier()
    {
        this(null, null);
    }
    
    public Supplier(String key, String item)
    {
        this.key = new SimpleStringProperty(key);
        this.supplier = new SimpleStringProperty(item);
    }

    /**
     * @return the key
     */
    public StringProperty getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(StringProperty key) {
        this.key = key;
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
