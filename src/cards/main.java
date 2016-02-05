package cards;

import java.util.ArrayList;

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
        Card tenofhearts = new Card(Card.Rank.TEN, Card.Suit.HEARTS);
        Card kingofclubs = new Card(Card.Rank.KING, Card.Suit.CLUBS);
        
        ArrayList<Card> list = new ArrayList<>();
        list.add(kingofclubs);
        list.add(tenofhearts);
        
        //System.out.println(Card.max(list));
        System.out.println(Card.Suit.randomSuit());
        
    }
    
        
    }
    
