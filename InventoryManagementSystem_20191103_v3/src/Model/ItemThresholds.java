package Model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;


/**
 * Item Thresholds Class
 */
public class ItemThresholds {
    
    private StringProperty item;
    private DoubleProperty threshold;
    
    public ItemThresholds()
    {
        this(null, null);
    }
    
    public ItemThresholds(Object item, Double threshold)
    {
        this.item = new SimpleStringProperty(item.toString());
        this.threshold = new SimpleDoubleProperty(threshold);
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

    /**
     * @return the threshold
     */
    public DoubleProperty getThreshold() {
        return threshold;
    }

    /**
     * @param threshold the threshold to set
     */
    public void setThreshold(DoubleProperty threshold) {
        this.threshold = threshold;
    }
    
}
