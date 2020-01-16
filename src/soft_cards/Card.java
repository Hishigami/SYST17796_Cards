package soft_cards;

/**
 * This class (class description here)
 *
 * @author Calvin Van
 */
public class Card {
    private String suit;
    //1 = Ace, 11 = Jack, 12 = Queen, 13 = King
    private int value;
    
    public static final String [] Suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }
    
    public void setSuit(String coat){
        suit = coat;
    }
    public void setValue(int val){
        value = val;
    }
    
    public String toString(){
        switch(value){
            case 1:
                return "Ace of " + suit;
            case 11:
                return "Jack of " + suit;
            case 12:
                return "Queen of " + suit;
            case 13:
                return "King of " + suit;
            default:
                return value + " of " + suit;
        }
    }
}