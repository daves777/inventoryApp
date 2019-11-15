package Model;

/**
 * Current Inventory Class
 */

//Changes - item now represents an Item instead of a String. 

public class CurrentInventory 
{
    private Item item;
    private double quantity;
   
    
    public CurrentInventory(Item item, double quantity)
    {
        this.item = item;
        this.quantity = quantity;
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
