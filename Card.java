public abstract class  Card 
{
    private String color;
    private int number;
    
    /**
     * Returns color
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * Returns Number
     */
    public int getNumber()
    {
        return number;
    }
    
    /**
     * Sets Color
     */
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    /**
     * Sets Number;
     */
    public void setNumber(int newNumber)
    {
        number = newNumber;
    }
    
    /**
     * Checks if the card can be played
     */
    public boolean isValid(int checkNumber, String checkColor)
    {
        if ((number == checkNumber) || (color == checkColor))
            return true;
        return false;
    }
}