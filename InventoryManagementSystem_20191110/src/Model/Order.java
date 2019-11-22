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
       return new SimpleStringProperty(Integer.toString(tableNumber));
   }
   
   public SimpleStringProperty mealProperty()
   {
       return new SimpleStringProperty(mealType.getDescription());
   }
   
   public SimpleStringProperty serverProperty()
   {
       return new SimpleStringProperty(serverName);
   }
   
   public SimpleStringProperty statusProperty()
   {
       return new SimpleStringProperty(status);
   }
}
