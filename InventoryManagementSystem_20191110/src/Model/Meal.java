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
    private ArrayList<Item> ingredientList = new ArrayList<Item>();
    
    public Meal(int myKey, String myDescription, ArrayList<Item> myIngredients)
    {
        key = myKey;
        description = myDescription;
        ingredientList = myIngredients;
    }
}
