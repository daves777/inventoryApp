package Model;

/**
 * Item Class
 */
public class Item 
{
    
    private int key;
    private String description;
    private String baseUOM;
    private double costPerUOM;
    
    public Item(int key, String item, String uom, double uomCost)
    {
        this.key = key;
        this.description = item;
        baseUOM = uom;
        costPerUOM = uomCost;
    }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return description;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.description = item;
    }

   
}
