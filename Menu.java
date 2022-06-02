import greenfoot.*;  

public class Menu extends World
{
    BotonPlay botonPlay = new BotonPlay();
    Instrucciones instrucciones = new Instrucciones();
    MyWorld l;
    private int tiempo=200;
    private int cont=0;
    public Menu(MyWorld l)
    {    

        super(600, 400, 1); 
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
            Greenfoot.playSound("sounds/sonidoBoton.mp3");
            Animacion();

        }else if(Greenfoot.mouseClicked(instrucciones))
        {
            MundoInstruc inst=new MundoInstruc(l); 
            Greenfoot.setWorld(inst);
        }
    }

    private void prepare()
    {

        addObject(botonPlay,300,302);
        TItle tItle = new TItle();
        addObject(tItle,314,72);
        Version version = new Version();
        addObject(version,311-10,180);

        addObject(instrucciones,307,246);
    }

    private void Animacion()
    {
        Animation animation=new Animation(l);
        Greenfoot.setWorld(animation);

    }
}
