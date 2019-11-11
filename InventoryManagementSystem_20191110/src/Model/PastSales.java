package Model;

/**
 * Past Sales Class
 */
public class PastSales 
{
    private String month;
    private int year;
    private double sales;  
   
    public PastSales(String month, int year, double sales)
    {
        this.month = month;
        this.year = year;
        this.sales = sales;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the sales
     */
    public double getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(double sales) {
        this.sales = sales;
    }

   
}
