/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Bret
 */
public class Meal {
    private String description;
    private int key;
    private ArrayList<CurrentInventory> ingredientList = new ArrayList<CurrentInventory>();
    
    public Meal(int myKey, String myDescription, ArrayList<CurrentInventory> myIngredients)
    {
        key = myKey;
        description = myDescription;
        ingredientList = myIngredients;
    }
    

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * @return the ingredientList
     */
    public ArrayList<CurrentInventory> getIngredientList() {
        return ingredientList;
    }

    /**
     * @param ingredientList the ingredientList to set
     */
    public void setIngredientList(ArrayList<CurrentInventory> ingredientList) {
        this.ingredientList = ingredientList;
    }
    
}
