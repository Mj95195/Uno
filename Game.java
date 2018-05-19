public class Game
{
	//Returns true if it is the first person's turn. Returns false if it is the second person's turn.
	static boolean firstPlayerTurn=true;
		
	public static void main(String[] args)
	{
		Player p1=new Player();
		Player p2=new AI();

	}

	//Changes the turns of the players. 
	public static void changeTurns()
	{
		if(firstPlayerTurn)
			firstPlayerTurn=false;
		firstPlayerTurn=true;
	}
}
