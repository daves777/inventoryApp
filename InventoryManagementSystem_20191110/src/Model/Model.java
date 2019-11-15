/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Bret
 */
public class Model {
    
    private EmployeeList allEmployees;
    private ItemList allItems;
    private CurrentInventoryList allInventory;
    
    public Model()
    {
        allEmployees = new EmployeeList();
        allEmployees.addEmployee(new Employee("John","Smith","123 Fake St",new Date(1986,3,30),"JohnSmith","password"));
        
        allItems = new ItemList(); //Currently items are added in within constructor of ItemList.  Could be changed.
        
        allInventory = new CurrentInventoryList();
        
        
        //initializing inventory - likely to be replaced with adjustments inside program once working.
        allInventory.addItem(allItems.getItemByKey(1), 200); //200 chicken cutlets
        allInventory.addItem(allItems.getItemByKey(2), 100); //100 veal cutlets
        allInventory.addItem(allItems.getItemByKey(3), 300); // 
        allInventory.addItem(allItems.getItemByKey(4), 250);
        allInventory.addItem(allItems.getItemByKey(5), 500);
        allInventory.addItem(allItems.getItemByKey(6), 50);
        
        
    }
    
    public EmployeeList getEmployeeList()
    {
        return allEmployees;
    }
}
