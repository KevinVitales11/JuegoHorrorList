import greenfoot.*;  

public class Animation extends World
{

    MyWorld l;
    

    public Animation(MyWorld l)
    {    

        super(600, 400, 1); 
        this.l=l;
    }

    public void act()
    {
        Greenfoot.playSound("sounds/animacion.mp3");
        Greenfoot.delay(700);
        Greenfoot.setWorld(l);
        Greenfoot.setSpeed(50);
    }
}
