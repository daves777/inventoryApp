package Model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Past Sales Class
 */
public class PastSales 
{
    private StringProperty month;
    private IntegerProperty year;
    private DoubleProperty sales;
    
    public PastSales()
    {
        this(null, null, null);
    }
    
    public PastSales(String month, Integer year, Double sales)
    {
        this.month = new SimpleStringProperty(month);
        this.year = new SimpleIntegerProperty(year);
        this.sales = new SimpleDoubleProperty(sales);
    }

    /**
     * @return the month
     */
    public StringProperty getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(StringProperty month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public IntegerProperty getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(IntegerProperty year) {
        this.year = year;
    }

    /**
     * @return the sales
     */
    public DoubleProperty getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(DoubleProperty sales) {
        this.sales = sales;
    }
    
    
}
