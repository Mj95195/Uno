import java.util.ArrayList;
import java.util.Random;
public class AI extends Player;
{
	private ArrayList<Card> hand;

	public AI()
	{
		hand=new ArrayList<Card>();

		for(int i = 0; i < 5; i++)
		{
			hand.add(draw();)
		}
	}

	public Card draw()
	{
		super.draw();
	}
}
