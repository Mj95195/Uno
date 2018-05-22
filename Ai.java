import java.util.ArrayList;

public class Ai extends Player
{
    private ArrayList<Card> hand;

    public Ai()
    {
        hand = new ArrayList<Card>();
        for(int i = 0; i < 7; i++)
            hand.add(draw());
    }
    
    public Card playCard(Card card)
    {
        for(int i = 0; i < hand.size(); i++)
        {
            if(hand.get(i).isValid(card.getNumber(),card.getColor()))
            {
                hand.remove(i);
                return hand.get(i);
            }
        }
        Card drawnCard=draw();
        if(drawnCard.isValid(card.getNumber(),card.getColor()))
            return drawnCard;
        hand.add(drawnCard);
        return null;
    }
}
