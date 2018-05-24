public class SpecialCards extends Card
{
    private int type=0;

    public SpecialCards (String initColor, int initNumber)
    {
        setColor(initColor);
        setNumber(initNumber);
        type=initNumber;
    }

    public boolean isValid(int checkNumber, String checkColor)
    {
        if (getNumber() == 14 || getNumber() == 13)
            return true;
        if (getColor().equals(checkColor))
            return true;
        return false;
    }

    public String toString()
    {
      if(type == 10)
        return "Skip("+getColor()+")";
      else if(type == 11)
        return "Reverse("+getColor()+")";
      else if(type == 12)
        return "+2("+getColor()+")";
      else if(type == 13)
        return "Wild";
      else
        return "+4";
    }
}
