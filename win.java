import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    GreenfootImage img=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/fondoNegro.jpg");
    /**
     * Constructor for objects of class win.
     * 
     */
    public win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(img);
        
       
        showText("FELICIDADES ENTREGASTE LA LINKEDLIST",getWidth()/2, getHeight()/2);
       // showText("",getWidth()/2, getHeight()/2+100);
    }
    public void act()
    {
        
    }
}
