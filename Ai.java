import java.util.ArrayList;

public class Ai extends Player
{
    private ArrayList<Card> hand;
    

    public Ai()
    {
        hand = new ArrayList<Card>();
        for(int i=0; i<5; i++)
            hand.add(draw());
    }

    public void playCard()
    {

    }

    public int checkCards()
    {
        for(int i=0;i<hand.size();i++)
        {
            int num=0;
            String color="";
            if(hand.get(i).isValid(num,color))
                return i;
        }
        return -1;
    }
}
