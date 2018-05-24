import java.util.ArrayList;
import java.util.Random;

public class Player
{
    private ArrayList<Card> hand;

    public Player()
    {
        hand = new ArrayList<Card>();

        for (int i = 0; i < 7; i++)
        {
            hand.add(draw());
        }
    }

    public Card draw()
    {
        Random gen = new Random();
        int num = gen.nextInt(15);
        int determineColor = gen.nextInt(4);
        String color;

        if (determineColor == 0)
        {
            color = "Red";
        } else if (determineColor == 1)
        {
            color = "Yellow";
        } else if (determineColor == 2)
        {
            color = "Green";
        } else
        {
            color = "Blue";
        }

        if (num < 10)
        {
            return new NumberCards(num, color);
        } else
        {
            if (num == 11)
            {
                return new SpecialCards(color, 10);
            }
            else if (num == 12)
            {
                return new SpecialCards(color, 11);
            }
            else if (num == 13)
            {
                return new SpecialCards(color, 12);
            }
            else if (num == 14)
            {
                return new SpecialCards("None", 13);
            }
            else
            {
                return new SpecialCards("None", 14);
            }
        }
    }

    public Card playCard(int index, Card currentCard)
    {
        Card chosenCard = hand.get(index - 1);
        if (chosenCard.isValid(currentCard.getNumber(), currentCard.getColor()))
        {
            return chosenCard;
        }
        return null;
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
