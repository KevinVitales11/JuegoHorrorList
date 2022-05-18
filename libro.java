import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class libro extends Actor
{
    /**
     * Act - do whatever the libro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []imagesLibro;
    int cont=0;
    int tiempo=100;
    public void act()
    {
        apareceteAleatoriamente();
        cont++;
        
    }

    private void apareceteAleatoriamente()
    {
        
        if(cont>=tiempo)
        {
            getWorld().addObject(this,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            cont=0;
        }else
        {
            getWorld().removeObject(this);
             
        }
       
        
        
    }
    
    


}
