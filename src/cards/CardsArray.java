/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Harish Bondalapati
 */
public class CardsArray {
    
    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    
    private static final int DECK_SIZE = 5;
    
    private int clubsCount;
    private int diamondsCount;
    private int heartsCount;
    private int spadesCount;
    
    public CardsArray(){
        clubs =new Card[DECK_SIZE];
        diamonds =new Card[DECK_SIZE];
        hearts =new Card[DECK_SIZE];
        spades =new Card[DECK_SIZE];
        clubsCount=0;
        diamondsCount=0;
        heartsCount=0;
        spadesCount=0;
    }

    public int getClubsCount() {
        return clubsCount;
    }

    public int getDiamondsCount() {
        return diamondsCount;
    }

    public int getHeartsCount() {
        return heartsCount;
    }

    public int getSpadesCount() {
        return spadesCount;
    }
    
    public void addCardsToArray(Card c){
        switch(c.getType()){
            case "clubs" : 
                if(clubsCount<DECK_SIZE){
                    clubs[clubsCount]=c;
                    clubsCount+=1;
                }
                else{
                    removeCardsFromArray(0,"clubs");
                    addCardsToArray(c);
                }
                break;
            case "diamonds" : 
                if(diamondsCount<DECK_SIZE){
                    diamonds[diamondsCount]=c;
                    diamondsCount+=1;
                }
                else{
                    removeCardsFromArray(0,"diamonds");
                    addCardsToArray(c);
                }
                break;
            case "hearts" :
                if(heartsCount<DECK_SIZE){
                    hearts[heartsCount]=c;
                    heartsCount+=1;
                }
                else{
                    removeCardsFromArray(0,"hearts");
                    addCardsToArray(c);
                }
                break;
            case "spade" : 
                if(spadesCount<DECK_SIZE){
                    spades[spadesCount]=c;
                    spadesCount+=1;
                }
                else{
                    removeCardsFromArray(0,"spade");
                    addCardsToArray(c);
                }
                break;
            default : 
                break;
        }
    }
    
    
    public void removeCardsFromArray(int position, String cardType){
        if(cardType.equals("clubs")){
            clubsCount=removeCardFromSuit(clubs,position,clubsCount);
        }
        else if(cardType.equals("diamonds")){
            diamondsCount=removeCardFromSuit(diamonds,position,diamondsCount);
        }
        else if(cardType.equals("spades")){
            spadesCount=removeCardFromSuit(spades,position,spadesCount);
        }
        else if(cardType.equals("hearts")){
            heartsCount=removeCardFromSuit(hearts,position,heartsCount);
        }
    }
    
    private int removeCardFromSuit(Card[] cards,int position,int count){
        if(position>=0 && position<count){
            for(int i=position;i<count-1;i++){
                cards[i]=cards[i+1];
            }
            cards[count-1]=null;
            return --count;
        }else{
            return count;
        }
    }
    
       @Override
   public String toString(){
       return "\nHearts Array:[ "+this.getCards(hearts)+" ]"
                + "\nDiamonds Array:[ "+this.getCards(diamonds)+" ]"
                + "\nSpades Array:[ "+this.getCards(spades)+" ]"
                + "\nClubs Array:[ "+this.getCards(clubs)+" ]";
       
   }
   
   private String getCards(Card[] cards){
       String cardNumbers="";
       for(Card c:cards){
//           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers;
   }
}
