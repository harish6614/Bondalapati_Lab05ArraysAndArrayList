/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author Harish Bondalapati
 */
public class CardsArrayList {

   private ArrayList<Card> clubs;
   private ArrayList<Card> diamonds;
   private ArrayList<Card> hearts;
   private ArrayList<Card> spades;
   
   public CardsArrayList(){
       this.clubs=new ArrayList<Card>();
       this.diamonds=new ArrayList<Card>();
       this.hearts=new ArrayList<Card>();
       this.spades=new ArrayList<Card>();
   }

    public ArrayList<Card> getClubs() {
        return clubs;
    }

    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    public ArrayList<Card> getHearts() {
        return hearts;
    }

    public ArrayList<Card> getSpades() {
        return spades;
    }
   
   
   
   public String addCardsToList(Card c){
       boolean addFlag;
       switch(c.getType()){
           case "clubs" : 
               addFlag=clubs.add(c);
               break;
           case "diamonds" : 
               addFlag=clubs.add(c);
               break;
           case "hearts" : 
               addFlag=clubs.add(c);
               break;
           case "spade" : 
               addFlag=clubs.add(c);
               break;
           default :
               addFlag=false;
               break;
       }
       return (addFlag?"card added successfully":"card addition unsuccessful");
   }
   
   public String removeCardsFromList(int position, ArrayList<Card> c){
       if(c.size()<0 || position>c.size()){
           return "ArrayList size underflow, card cannot be removed";
       }
       else{
           c.remove(position);
           return "Card is removed successfully!";
       }
   }

   @Override
   public String toString(){
       return "\nHearts ArrayList:[ "+this.getCards(hearts)+" ]"
                + "\nDiamonds ArrayList:[ "+this.getCards(diamonds)+" ]"
                + "\nSpades ArrayList:[ "+this.getCards(spades)+" ]"
                + "\nClubs ArrayList:[ "+this.getCards(clubs)+" ]";
       
   }
   
   private String getCards(ArrayList<Card> cards){
       String cardNumbers="";
       for(Card c:cards){
           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers.trim();
   }
}
