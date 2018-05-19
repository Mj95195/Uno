public class Game
{
	static boolean firstPlayerTurn=true;
		
	public static void main(String[] args)
	{
		Player p1=new Player();
		Player p2=new AI();

	}

	public static void changeTurns()
	{
		if(firstPlayerTurn)
			return false;
		return true;
	}
}
