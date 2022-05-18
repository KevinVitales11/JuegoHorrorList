import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    Fantasma fantasma;
    boolean daño=false;
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
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
        }
        return daño;
    }
    
    
    
    
}
