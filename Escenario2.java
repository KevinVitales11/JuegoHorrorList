import greenfoot.*;  
import greenfoot.GreenfootSound;
import java.awt.Color;
import java.lang.Object;
import javax.swing.JOptionPane;

public class Escenario2 extends World
{
    Regresar regresar=new Regresar();
    GreenfootImage img= new GreenfootImage("images/fondoNegro.jpg");
    public int []score=new int[4];
    
    public Escenario2(int []score)
    {    

        
        super(1100, 600, 1); 
        this.score=score;
        score[0]=score[0]+300;
        prepare();

    }
    public Escenario2(int dato)
    {    

        
        super(1100, 600, 1); 
       score=new int [1];
       score[0]=dato;
        
        prepare();

    }

    private void prepare()
    {
        setBackground(img);
        showText("NO ENTREGASTE LA LINKED LIST",getWidth()/2, getHeight()/2);
        showText("STAS REPROBADO",getWidth()/2, getHeight()/2+150);
        
        addObject(regresar, getWidth()/2,getHeight()/2+100);

    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
       if( Greenfoot.mouseClicked(regresar))
       {
           MyWorld p =new MyWorld();
        
           p.score=score;
           p.nameUsu= JOptionPane.showInputDialog("¿Cual es tu nombre?");
           Greenfoot.setWorld(p);
       }
    }

}
