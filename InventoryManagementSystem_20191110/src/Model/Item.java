package Model;

/**
 * Item Class
 */
public class Item 
{
    private String key;
    private String item;
    
    public Item(String key, String item)
    {
        this.key = key;
        this.item = item;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

   
}
