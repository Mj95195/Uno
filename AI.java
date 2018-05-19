import java.util.ArrayList;
import java.util.Random;
public class AI extends Player;
{
	private ArrayList<Card> aiHand;

	public AI()
	{
		hand=new ArrayList<Card>();

		for(int i = 0; i < 5; i++)
		{
			aiHand.add(draw());
		}
	}

	public Card draw()
	{
		super.draw();
	}
	
	public void playCard()
	{
	}
}
