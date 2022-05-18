import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
import java.awt.Color;
import java.lang.Object;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escenario2 extends World
{
    private Wall p=new Wall();
     GreenfootImage img= new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/fondoNegro.jpg");
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public escenario2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
        
        
        //
        
        //setBackground("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/descarga.jpg");
        
    
       
        //Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/Casca.mp3");
       
    }
     
    private void prepare()
    {

        
        setBackground(img);
        //Letrero mensajePerdida=new Letrero("NO ENTREGASTE LA LINKED LIST ");
        //ddObject(mensajePerdida,getWidth()/2, getHeight()/2);
       
        showText("NO ENTREGASTE LA LINKED LIST",getWidth()/2, getHeight()/2);
        showText("STAS REPROBADO",getWidth()/2, getHeight()/2+100);
       
      
        
     
    }
    
   
    
}
