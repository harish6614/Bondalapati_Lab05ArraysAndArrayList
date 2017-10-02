/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * CardsArray class to hold cards in the array in their respective suit 
 * array with a maximum number of cards equal to the deck size defined 
 * in the class.
 * 
 * @author Harish Bondalapati
 */
public class CardsArray {
    
    /**
     * Variable to store Cards of type clubs.
     */
    private Card[] clubs;
    /**
     * Variable to store Cards of type diamonds.
     */
    private Card[] diamonds;
    /**
     * Variable to store Cards of type hearts.
     */
    private Card[] hearts;
    /**
     * Variable to store Cards of type spades.
     */
    private Card[] spades;
    /**
     * Defines deck size of the cards.
     */
    private static final int DECK_SIZE = 5;
    
    /**
     * Variable to hold number of club type cards in the current object.
     */
    private int clubsCount;
    /**
     * Variable to hold number of diamonds type cards in the current object.
     */
    private int diamondsCount;
    /**
     * Variable to hold number of hearts type cards in the current object.
     */
    private int heartsCount;
    /**
     * Variable to hold number of spades type cards in the current object.
     */
    private int spadesCount;
    
    /**
     * Initializes a CardsArray object by initializing all the four type 
     * of card arrays with the deck size defined.The count of all the cards 
     * is set to 0 while initializing this object.
     */
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

    /**
     * Returns count of number of club type cards present in
     * @return Number of clubs
     */
    public int getClubsCount() {
        return clubsCount;
    }

    /**
     * Returns count of number of diamonds type cards present in
     * @return Number of diamonds
     */
    public int getDiamondsCount() {
        return diamondsCount;
    }

    /**
     * Returns count of number of hearts type cards present in
     * @return Number of hearts
     */
    public int getHeartsCount() {
        return heartsCount;
    }

    /**
     * Returns count of number of spades type cards present in
     * @return Number of spades
     */
    public int getSpadesCount() {
        return spadesCount;
    }
    
    /**
     * Method to add a card to its array based on the type of the card.
     * @param c Adds a Card to its array(i.e deck).
     */
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
            case "spades" : 
                if(spadesCount<DECK_SIZE){
                    spades[spadesCount]=c;
                    spadesCount+=1;
                }
                else{
                    removeCardsFromArray(0,"spades");
                    addCardsToArray(c);
                }
                break;
            default : 
                break;
        }
    }
    
    /**
     * Remove a card from its array from the position specified.
     * @param position Position of the card to be removed from its deck.
     * @param cardType Type of the card to be removed from its deck.
     */
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
    
    /**
     * Method to remove a card from the array variable passed from the 
     * position specified. On successful removal of card the count is 
     * decremented.
     * 
     * @param cards Cards array (i.e deck).
     * @param position Position of a card in the deck
     * @param count Number of cards in the deck.
     * @return Current number of cards in the deck.
     */
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
    
    /**
     * Override method of toString to display formatted CardsArray object.
     * @return Formatted string to display details of CardsArray object.
     */
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
           if(c!=null)
           cardNumbers+=c.getNumber()+"  ";
       }
       return cardNumbers.trim();
    }
}
