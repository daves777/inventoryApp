package Model;

/**
 * Supplier Class
 */
public class Supplier 
{
    private String key;
    private String supplier;
    
    public Supplier(String key, String item)
    {
        this.key = key;
        this.supplier = item;
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
     * @return the supplier
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    
}
