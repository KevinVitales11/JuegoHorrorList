import greenfoot.*;  
import greenfoot.GreenfootSound;
import java.awt.Color;
import java.lang.Object;

public class escenario2 extends World
{
    private Wall p=new Wall();
    GreenfootImage img= new GreenfootImage("images/fondoNegro.jpg");
    
    public escenario2()
    {    

        super(1100, 600, 1); 
        prepare();

    }

    private void prepare()
    {
        setBackground(img);
        showText("NO ENTREGASTE LA LINKED LIST",getWidth()/2, getHeight()/2);
        showText("STAS REPROBADO",getWidth()/2, getHeight()/2+100);

    }

    public void act()
    {
        stopped();
    }

}
