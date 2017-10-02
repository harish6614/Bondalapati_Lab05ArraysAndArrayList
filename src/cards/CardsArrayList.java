/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 * CardsArrayList class to hold cards in the array list in their 
 * respective suit.
 * @author Harish Bondalapati
 */
public class CardsArrayList {
    
    /**
     * Variable to store Cards of type clubs.
     */
    private ArrayList<Card> clubs;

    /**
     * Variable to store Cards of type diamonds.
     */
    private ArrayList<Card> diamonds;
    /**
     * Variable to store Cards of type hearts.
     */
    private ArrayList<Card> hearts;
    /**
     * Variable to store Cards of type spades.
     */
    private ArrayList<Card> spades;
   
    /**
     * Initializes a CardsArrayList object by initializing all the four 
     * suit lists declared.
     */
    public CardsArrayList(){
       this.clubs=new ArrayList<Card>();
       this.diamonds=new ArrayList<Card>();
       this.hearts=new ArrayList<Card>();
       this.spades=new ArrayList<Card>();
   }

    /**
     * Getter method to return clubs array list.
     * @return Clubs array list.
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     * Getter method to return diamonds array list.
     * @return Diamonds array list.
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     * Getter method to return hearts array list.
     * @return Hearts array list.
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     * Getter method to return spades array list.
     * @return Spades array list.
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }
   
    /**
     * Adds a card to its respective array list.
     * @param c Card to be added to its respective array list.
     * @return Returns message of card addition.
     */
    public String addCardsToList(Card c){
       boolean addFlag;
       switch(c.getType()){
           case "clubs" : 
               addFlag=clubs.add(c);
               break;
           case "diamonds" : 
               addFlag=diamonds.add(c);
               break;
           case "hearts" : 
               addFlag=hearts.add(c);
               break;
           case "spades" : 
               addFlag=spades.add(c);
               break;
           default :
               addFlag=false;
               break;
       }
       return (addFlag?"card added successfully":"card addition unsuccessful");
   }
   
    /**
     * Remove a card from its array from the position specified.
     * @param position Position of a card in the list
     * @param c Cards array list
     * @return Message weather card removal is successful.
     */
    public String removeCardsFromList(int position, ArrayList<Card> c){
       if(c.size()<0 || position>c.size()){
           return "ArrayList size underflow, card cannot be removed";
       }
       else{
           c.remove(position);
           return "Card is removed successfully!";
       }
   }
    
    /**
     * Override method of toString to display formatted CardsArray object.
     * @return Formatted string to display details of CardsArray object.
     */
   @Override
   public String toString(){
       return "Hearts ArrayList:[ "+this.getCards(hearts)+" ]"
                + "\nDiamonds ArrayList:[ "+this.getCards(diamonds)+" ]"
                + "\nSpades ArrayList:[ "+this.getCards(spades)+" ]"
                + "\nClubs ArrayList:[ "+this.getCards(clubs)+" ]";
       
   }
   
   /**
    * Method to return cards present in an array list.
    * @param cards Cards array list.
    * @return Returns cards in an array list.
    */
   private String getCards(ArrayList<Card> cards){
       String cardNumbers="";
       for(Card c:cards){
           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers.trim();
   }
}
