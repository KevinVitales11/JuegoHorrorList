import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Botones
{
    MyWorld m;
    MyWorld n=new MyWorld();
    /**
     * Act - do whatever the Return wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/sonidoBoton.mp3");
           if(m!=null)
           {
                Menu menu=new Menu(m);
           Greenfoot.setWorld(menu);
           }else
           {
               System.out.println("null");
           }
          
           
           
           
        }
    }
    
    public Return(MyWorld l)
    {
        this.m=l;
    }
}
