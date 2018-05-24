import java.util.Scanner;
public class Tester
{
  static Card card;
  static int turn = 1;
  static boolean playGame=true;

  public static void main(String[] args)
  {
    Player p1=new Player();
    Ai ai=new Ai();
    do
    {
      card=p1.draw();
    }
    while(card.getNumber()>=10);

    System.out.println(card.toString());

    p1.printHand();
    Scanner in=new Scanner(System.in);
    System.out.print("\nIndex of card to play: ");
    int index=in.nextInt();
    if(p1.playCard(index-1,card) == null)
    {
      System.out.println("-1");
      System.out.println(card.toString());
    }  
    else
    {
      card=p1.playCard(index-1,card);
      System.out.println(card.toString());
    }

    ai.printHand();
    if(ai.playCard(card) == null)
      System.out.println("-1");
    else
    {
      card=ai.playCard(card);
      System.out.println("\n"+card.toString());
    }
    /*
    while(playGame)
    {
    }


    if(p1.returnSize() == 0)
      System.out.println("Player 1 Wins!");
    else if(ai.returnSize() == 0)
      System.out.println("Ai Wins!");
    */
  }

  public static void changeTurn()
  {
    if(turn == 1)
      turn = 2;
    turn = 1;
  }
}
