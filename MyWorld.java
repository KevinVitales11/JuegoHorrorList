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
public class MyWorld extends World
{
    private Wall p=new Wall();
    public int cambiador=0;

    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
       
        prepare();
        
        
        //
        
        //setBackground("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/descarga.jpg");
        
    
       
        //Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/Casca.mp3");
       
    }
    public void act()
    {
        if(cambiador==0)
        {
            cambiador=-1;
            Menu menu=new Menu(this);
            Greenfoot.setWorld(menu);
            
        }
        
    }
     
    private void prepare()
    {

        
        niño personaje=new niño();
        libro librin=new libro();
        GreenfootImage img= new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/pisoMadera.jpg");
        setBackground(img);
        libro librin2=new libro();
        libro librin3=new libro();
        librin.getImage().scale(30, 30);
        librin2.getImage().scale(30, 30);
        librin3.getImage().scale(30, 30);
        addObject(personaje,50,100);
        addObject(librin,100,100);
        addObject(librin2,100,100);
        addObject(librin3,100,100);
        librin.setLocation(700,70);
        librin2.setLocation(500,120);
        librin3.setLocation(400,300);

        vida vida = new vida();

        addObject(vida,930,80);

        vida vida2 = new vida();
        addObject(vida2,840,80);
        vida vida3 = new vida();
        addObject(vida3,1000,80);

        Fantasma fantasma=new Fantasma(personaje,vida,vida2,vida3);
        personaje.setFantasma(fantasma);
        Profesor profe=new Profesor();
        addObject(profe,getWidth()-100, getHeight()/2);
        apareceLetrero("Parcial 1");

        addObject(fantasma,0,0);
        for(int cont=15;cont<55;cont=cont+10)
        {
            bancaBoy banquita=new bancaBoy();
            addObject(banquita, banquita.getImage().getHeight()+cont*15, 200);

        }
        for(int cont=15;cont<55;cont=cont+10)
        {
            bancaBoy banquita=new bancaBoy();
            addObject(banquita, banquita.getImage().getHeight()+cont*15, 375+35);
        }

        for(int cont=0;cont<55;cont++)
        {
            Wall pared=new Wall();
            addObject(pared, pared.getImage().getHeight()+cont*20, 0);

        }
        Pizzarron piza=new Pizzarron();
        Wall wall2=new Wall();
        addObject(wall2, 0, 0);

        addObject(piza,getWidth()-30, getHeight()/2);
        maceta maceta = new maceta();
        addObject(maceta,13,42);
        maceta maceta2 = new maceta();
        addObject(maceta2,31,538);
        maceta maceta3 = new maceta();
        addObject(maceta3,1009,389);
        
    }

    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);
        
        for(int cont=0;cont<10;cont++);
        
         addObject(letrero, getWidth()/2+70,getHeight()-100);
         for(int cont=0;cont<10;cont++);
         if(Greenfoot.isKeyDown("RIGHT"))
         {
           removeObject(letrero);  
         }
         
         
        
    }
    private int aleatorio()
    {
        int aleatorio;
        aleatorio=(int)(Math.random()*10);
        return aleatorio;
    }
    
   
    
}
