/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * Card class to define and set each card with a value and type.
 * @author Harish Bondalapati
 */
public class Card {
    
    /**
     * Variable to store the number of a card
     */
    private int number;
    
    /**
     * Variable to store the card type
     */
    private String type;
    
    /**
     * Initializes a Card object with the value of type and number passed 
     * in the arguments.
     * 
     * @param number Number of the card.
     * @param type Type of the card.
     */
    public Card(int number, String type){
        this.number=number;
        this.type=type;
    }

    /**
     * Getter method to return value of card number.
     * @return Return value of card number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method to set value of card number.
     * @param number Sets the value of card number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter method to return value of card type.
     * @return Return value of card type.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method to set value of card type.
     * @param type Sets the value of card type.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * 
     * @return Formatted Card object as output 
     */
    @Override
    public String toString(){
        return ""+number;
    }
}
