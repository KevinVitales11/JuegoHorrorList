import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MundoInstruc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MundoInstruc extends World
{

    MyWorld m;
    GreenfootImage img=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/rivets.jpg"); 
    /**
     * Constructor for objects of class MundoInstruc.
     * 
     */
    public MundoInstruc(MyWorld l )
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        this.m=l;
        setBackground(img);
        prepare();
        
    }
    private void prepare()
    {
        Inst2 space=new Inst2();
        ins1 flechas=new ins1();
        if(m==null)
        {
        System.out.println("null");
        }else
        {
            Return retu=new Return(m);
            addObject(retu, getWidth()/2, getHeight()-100);
        }
        
        
        addObject(flechas, getWidth()/2-300, getHeight()/2-100);
        addObject(space, getWidth()/2, getHeight()/2);
    }
}
