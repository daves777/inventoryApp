package Model;

/**
 * Item Thresholds Class
 */
public class ItemThresholds {
    
    private String item;
    private double threshold;
    
    public ItemThresholds(Object item, double threshold)
    {
        this.item = item.toString();
        this.threshold = threshold;
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
