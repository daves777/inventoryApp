package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Item Class
 */
public class Item 
{
    private StringProperty key;
    private StringProperty item;
    
    public Item()
    {
        this(null, null);
    }
    
    public Item(String key, String item)
    {
        this.key = new SimpleStringProperty(key);
        this.item = new SimpleStringProperty(item);
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
       
}
