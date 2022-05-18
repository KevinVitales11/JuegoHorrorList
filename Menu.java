import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    
    
  
    BotonPlay botonPlay = new BotonPlay();
     MyWorld l;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu(MyWorld l)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        this.l=l;
       
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(botonPlay))
        {
           
           Greenfoot.setWorld(l);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(botonPlay,300,302);
        TItle tItle = new TItle();
        addObject(tItle,314,72);
        Version version = new Version();
        addObject(version,311,193);

        Instrucciones instrucciones = new Instrucciones();//instrucciones tambien debe tener cambiador
        addObject(instrucciones,307,246);
    }
    }
