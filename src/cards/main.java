package cards;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author 100091995
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card[] cardArray = {
            new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
            new Card(Card.Rank.FOUR, Card.Suit.SPADES),
            new Card(Card.Rank.TEN, Card.Suit.SPADES),
            new Card(Card.Rank.TWO, Card.Suit.CLUBS),
            new Card(Card.Rank.SIX, Card.Suit.HEARTS),
            new Card(Card.Rank.THREE, Card.Suit.CLUBS)};
        
        //System.out.println(Card.max(list));
        //System.out.println(Card.Suit.randomSuit());
        Card.CompareRank a = new Card.CompareRank(); 
        Arrays.sort(cardArray);
        for(int i = 0; i < cardArray.length; i++){
            System.out.println(cardArray[i]);
            
        }
        
    }
    
        
    }
    
