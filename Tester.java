public class Tester
{
  static int turn = 1;
  static Card card;

  public static void main(String[] args)
  {
    Player p1=new Player();
    Player ai=new Ai();
  }

  public void changeTurn()
  {
    if(turn == 1)
      turn = 2;
    turn = 1;
  }
}
