/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalTime;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Bret
 */
public class Order {
    private int orderNumber;
    private Meal mealType;
    private String status;
    private int tableNumber;
    private LocalTime orderTime;
    private String serverName;
    
   public Order(int myOrderNumber, Meal myMeal,int myTableNumber,String myServerName)
   {
       orderNumber = myOrderNumber;
       mealType = myMeal;
       status = "In Queue";
       tableNumber = myTableNumber;
       orderTime = LocalTime.now();
       serverName = myServerName;
   }
   
   public SimpleStringProperty tableProperty()
   {
       return new SimpleStringProperty(Integer.toString(getTableNumber()));
   }
   
   public SimpleStringProperty mealProperty()
   {
       return new SimpleStringProperty(getMealType().getDescription());
   }
   
   public SimpleStringProperty serverProperty()
   {
       return new SimpleStringProperty(serverName);
   }
   
   public SimpleStringProperty statusProperty()
   {
       return new SimpleStringProperty(getStatus());
   }

    /**
     * @return the orderNumber
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @param mealType the mealType to set
     */
    public void setMealType(Meal mealType) {
        this.mealType = mealType;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param tableNumber the tableNumber to set
     */
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    /**
     * @param orderTime the orderTime to set
     */
    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return the mealType
     */
    public Meal getMealType() {
        return mealType;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the tableNumber
     */
    public int getTableNumber() {
        return tableNumber;
    }

    /**
     * @return the orderTime
     */
    public LocalTime getOrderTime() {
        return orderTime;
    }
}
