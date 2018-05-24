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
        ArrayList<Card> playableCards=new ArrayList<Card>();
        for(int i = 0; i < hand.size(); i++)
        {
            if(hand.get(i).isValid(card.getNumber(),card.getColor()))
            {
                int number=hand.get(i).getNumber();
                if(number == 10 || number == 11 || number == 12)
                {
                  Card returnCard=hand.get(i);
                  return returnCard;
                }
                else
                  playableCards.add(hand.get(i));
            }
        }

        if(playableCards.size()>0)
        {
            boolean wild=false;
            int index=0;
            for(int i = 0; i < playableCards.size(); i++)
            {
              if(playableCards.get(i).getNumber() != 13 || playableCards.get(i).getNumber() != 14)
              {
                  Card returnCard=playableCards.get(i);
                  return returnCard;
              }
              else if(playableCards.get(i).getNumber() == 13)
              {
                wild=true;
                index=i;
              }
              else
              {
                if(!wild)
                  index=i;
              }
            }
            return playableCards.get(index);
        }

        else
        {
          Card drawnCard=draw();
          if(drawnCard.isValid(card.getNumber(),card.getColor()))
              return drawnCard;
          hand.add(drawnCard);
          return null;
        }
    }

    public int returnSize()
    {
        return hand.size();
    }

    public void printHand()
    {
      for(int i = 0; i < hand.size(); i++)
        System.out.print(hand.get(i).toString()+" ");
    }
}
