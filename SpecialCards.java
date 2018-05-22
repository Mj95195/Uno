public class SpecialCards extends Card
{
    public SpecialCards (String initColor, int initNumber)
    {
        setColor(initColor);
    }
    
    public boolean isValid(int checkNumber, String checkColor)
    {
        if (getNumber() == 14 || getNumber() == 13)
            return true;
        if (getColor().equals(checkColor))
            return true;
        return false;
    }
}
