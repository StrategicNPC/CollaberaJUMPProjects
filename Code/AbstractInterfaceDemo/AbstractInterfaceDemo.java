import java.util.ArrayList;
import java.math.*;

enum Suit {
    SPADES, 
    DIMONDS, 
    CLUBS, 
    HEARTS
}

interface Deck {
    void shuffle();
    PlayingCard draw();
}

abstract class PokerDeck implements Deck {
    ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();

    public PlayingCard draw() {
        PlayingCard drawnCard = deck.get(0);    //Draws a card from the deck
        deck.remove(0);                         //Card is no longer in the deck
        return drawnCard;
    } 

    abstract public void deal();
}

class GameDeck extends PokerDeck {

    public GameDeck(){
        for(int i = 1; i < 14; i++){
            deck.add(new PlayingCard(i, Suit.CLUBS));
            deck.add(new PlayingCard(i, Suit.SPADES));
            deck.add(new PlayingCard(i, Suit.DIMONDS));
            deck.add(new PlayingCard(i, Suit.HEARTS));
        }
    }

    public void shuffle(){
        for(int i = 0; i < 200; i++){
            int ran = (int) Math.floor(Math.random() * (deck.size()-1));
            PlayingCard ranCard = deck.get(ran);
            deck.remove(ran);
            deck.add(ranCard);
        }
    }

    public void deal()  {
        PlayingCard cardA = draw();
        PlayingCard cardB = draw();

        System.out.println("You drew the " + cardA.getMyValue() + " of " + cardA.getMySuit() + " and the " + cardB.getMyValue() + " of " + cardB.getMySuit() + "!");
    }
}

class PlayingCard {
    private int myValue;    //set as private so it cannot be changed after being constructed
    private Suit mySuit;

    public PlayingCard(int inNum, Suit  inSuit){
        myValue = inNum;
        mySuit  = inSuit;
    }

    public Suit getMySuit () {   //Check the Suit  of the card
        return mySuit;
    }

    public int getMyValue() {   //Check the value of the card
        return myValue;
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Creating Deck!");
        GameDeck thisGame = new GameDeck();
        
        thisGame.shuffle();
        System.out.println("Deck Shuffled!");

        System.out.println("Dealing Hand:");
        thisGame.deal();

        System.out.println();
        System.out.println("Dealing Again:");
        thisGame.deal();
    }
}