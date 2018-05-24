public class NumberCards extends Card
{
    public NumberCards (int initNumber, String initColor)
    {
        setNumber(initNumber);
        setColor(initColor);
    }

    public String toString()
    {
      return getNumber()+"("+getColor()+")";
    }
}
