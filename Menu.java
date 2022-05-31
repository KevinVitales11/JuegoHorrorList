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
    Instrucciones instrucciones = new Instrucciones();
     MyWorld l;
     private int tiempo=200;
     private int cont=0;
     
     //GreenfootSound sound=l.getSoundSusu();
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu(MyWorld l)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //sound.stop();
        prepare();
        this.l=l;
       
        
    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse!=null)
        {
            if(mouse.getX()==botonPlay.getX()&&mouse.getY()==botonPlay.getY())
            {
            botonPlay.getImage().scale(botonPlay.getImage().getWidth()+100, botonPlay.getImage().getHeight()+100);
            }
        }
        if(Greenfoot.mouseClicked(botonPlay))
        {
           Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/sonidoBoton.mp3");
           Animacion();
           
           
        }else if(Greenfoot.mouseClicked(instrucciones))
        {
            MundoInstruc inst=new MundoInstruc(l); 
            Greenfoot.setWorld(inst);
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
        addObject(version,311-10,180);

        //instrucciones tambien debe tener cambiador
        addObject(instrucciones,307,246);
    }
    private void Animacion()
    {
        
        Animation animation=new Animation(l);
        Greenfoot.setWorld(animation);
        
    }
    }
