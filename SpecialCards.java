public class SpecialCards extends Card
{
    private String effect;
    
    public SpecialCards (String initColor, String initEffect)
    {
        setColor(initColor);
        effect = initEffect;
    }
    
    public boolean isValid(int checkNumber, String checkColor)
    {
        if (effect.equals("plusFour") || effect.equals("Wild"))
            return true;
        if (getColor() == checkColor)
            return true;
        return false;
    }
}