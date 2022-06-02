import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animation extends World
{

    MyWorld l;
    Level2 level=new Level2();
    
    /**
     * Constructor for objects of class Animation.
     * 
     */
    public Animation(MyWorld l)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.l=l;
    }
    
    public void act()
    {
       Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/animacion.mp3");
       Greenfoot.delay(700);
        Greenfoot.setWorld(l);
        Greenfoot.setSpeed(50);
    }
}
