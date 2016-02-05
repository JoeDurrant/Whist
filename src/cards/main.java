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
        new Card(Card.Rank.TEN, Card.Suit.HEARTS),
        new Card(Card.Rank.KING, Card.Suit.HEARTS),
        new Card(Card.Rank.QUEEN, Card.Suit.SPADES),
        new Card(Card.Rank.KING, Card.Suit.DIAMONDS),
        new Card(Card.Rank.KING, Card.Suit.CLUBS),
        new Card(Card.Rank.NINE, Card.Suit.CLUBS)};
    
        //System.out.println(Card.max(list));
        //System.out.println(Card.Suit.randomSuit());
        Card.CompareRank a = new Card.CompareRank(); 
        Arrays.sort(cardArray, a);
        for(int i = 0; i < cardArray.length; i++){
            System.out.println(cardArray[i]);
            
        }
        
    }
    
        
    }
    
