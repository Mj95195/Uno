import java.util.ArrayList;
import java.util.Random;

public class Player
{
    private ArrayList<Card> hand;
    
    public Player()
    {
        hand = new ArrayList<Card>();
        
        for (int i = 0; i < 5; i++)
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
        } 
	else if (determineColor == 1)
        {
            color = "Yellow";
        } 
	else if (determineColor == 2)
        {
            color = "Green";
        } 
	else
        {
            color = "Blue";
        }
                    
        if (num < 10)
        {
            return new NumberCards(num, color);
        } 
	else
        {
            if (num == 11)
            {
                return new SpecialCards(color, "Skip");
            } 
	    else if (num == 12)
            {
                return new SpecialCards(color, "Reverse");
            } 
	    else if (num == 13)
            {
                return new SpecialCards(color, "plusTwo");
            } 
	    else if (num == 14)
            {
                return new SpecialCards("None", "Wild");
            } 
	    else
            {
                return new SpecialCards("None", "plusFour");
            }
        }
    }

    public void playCard(ArrayList<Card> currHand)
    {
	/*
	 * Build Scanner to determine what card player wants to play.
	 * If card is valid, play card and subtract the index of the card from the ArrayList
	 * Else say that card is invalid and ask until they can play valid card. 
	 */
    }
}
