import greenfoot.*;

public class Bala extends Actor
{
    Fantasma fantasma;
    boolean daño=false;

    public Bala(Fantasma fantasma)
    {
        this.fantasma=fantasma;
        getImage().scale(getImage().getWidth()-500,getImage().getWidth()-500);

    }
    public boolean getDaño()
    {
        if(isTouching(Fantasma.class))
        {
            daño=true;
        }else
        {

            daño=false;
        }
        return daño;
    }

    
    
}
