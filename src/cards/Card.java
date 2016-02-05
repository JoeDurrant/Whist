package cards;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Class to model playing cards
 * @author 100091995
 */
public class Card implements Serializable, Comparable<Card>{
    static final long serialVersionUID = 100L;
    Rank rank;
    Suit suit;

    /**
     * Enum to model values of card numbers
     */
    public enum Rank{
        TWO(2), THREE(3), FOUR(4), FIVE(5),
        SIX(6), SEVEN(7), EIGHT(8), NINE(9),
        TEN(10), JACK(10), QUEEN(10), KING(10), 
        ACE(11);
        
        final int value;
    
        Rank(int value){
        this.value = value;}
    
        Rank getPrevious(){
            Rank[] values = Rank.values();
            if(this.ordinal() == 0){
                return Rank.ACE;}
            else{
                return values[this.ordinal() - 1];}}
        
        int getValue(){
            return this.value;}}
    
    /**
     * Enum to model each card suit
     */
    public enum Suit{
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
    
    // Create .values() array and Random object to avoid recreating everytime 
    // randomSuit method is called
    private static final Random RANDOM = new Random();
    
    static Suit randomSuit(){
        Suit[] values = Card.Suit.values();
        return values[RANDOM.nextInt(4)];}
    }
   
    /**
     * Creates a new Card object
     * @param r rank the card will have (Ace, King, Queen etc.)
     * @param s suit the card will be in (Clubs, Diamonds, Hearts, Spades)
     */
    public Card(Rank r, Suit s){
        this.rank = r;
        this.suit = s;}
    
    /**
     * Getter for rank field
     * @return this card's rank
     */
    public Rank getRank(){
        return this.rank;}
    
    /**
     * Getter for suit field
     * @return this card's suit
     */
    public Suit getSuit(){
        return this.suit;}
    
    public static Card max(ArrayList<Card> cardList){
        Card max = cardList.get(0);
        Iterator<Card> cardIterator = cardList.iterator();
        while(cardIterator.hasNext()) {
            Card card = cardIterator.next();
            if(card.compareTo(max) == 1){
                max = card;}
        }
        return max;}
    
    @Override
    public int compareTo(Card card) {
        if(this.suit == card.getSuit()){
            if(card.getRank().ordinal() < this.rank.ordinal()){
                return 1;} 
            else if(card.getRank().ordinal() > this.rank.ordinal()){
                return -1;}
            else{
                return 0;}} // Assume this will not be reached as there are no 
                            // duplicate cards in a deck
        else if(this.suit.ordinal() > card.getSuit().ordinal()){
            return -1;}
        else{
            return 1;}}
    
    @Override
    public String toString(){
        return this.rank + " OF " + this.suit;
    }
}