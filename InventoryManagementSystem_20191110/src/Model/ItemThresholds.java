package Model;

/**
 * Item Thresholds Class
 */
public class ItemThresholds {
    
    private Item item;
    private double threshold;
    
    public ItemThresholds(Item item, double threshold)
    {
        this.item = item;
        this.threshold = threshold;
    }

    ItemThresholds() 
    {
        
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    

    /**
     * @return the threshold
     */
    public double getThreshold() {
        return threshold;
    }

    /**
     * @param threshold the threshold to set
     */
    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

   
}
