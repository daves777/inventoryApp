package Model;

/**
 * Current Inventory Class
 */
public class CurrentInventory 
{
    private String item;
    private double quantity;
   
    
    public CurrentInventory(String item, double quantity)
    {
        this.item = item;
        this.quantity = quantity;
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
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

   
}
