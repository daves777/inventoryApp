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

    public Item() {
        key = 0;
        description = "NULL";
        baseUOM = "NULL";
        costPerUOM = 0;
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
        return getDescription();
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.setDescription(item);
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getUOM()
    {
        return baseUOM;
    }

    /**
     * @return the costPerUOM
     */
    public double getCostPerUOM() {
        return costPerUOM;
    }

    /**
     * @param costPerUOM the costPerUOM to set
     */
    public void setCostPerUOM(double costPerUOM) {
        this.costPerUOM = costPerUOM;
    }
    

   
}
