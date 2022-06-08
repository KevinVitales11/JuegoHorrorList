import greenfoot.*;  
import javax.swing.JOptionPane;
public class Menu extends World
{
    BotonPlay botonPlay = new BotonPlay();
    Instrucciones instrucciones = new Instrucciones();
    BotonRecords records=new BotonRecords();
    MyWorld l;
    private int tiempo=200;
    private int cont=0;
    int Score[]=new int[4];
    public String nombre;
    boolean ingres=true;
  

    public Menu(MyWorld l)
    {    

        super(600, 400, 1); 
        prepare();
        this.l=l;
        

    }
    public void act()
    {

        MouseInfo mouse = Greenfoot.getMouseInfo();
        

        if(Greenfoot.mouseClicked(records))
        {
            Record record =new Record(Score,nombre,ingres);
            record.setMenu(this);
            ingres=false;
            
            Greenfoot.setWorld(record);
        }else if(Greenfoot.mouseClicked(botonPlay))
        {
            Greenfoot.playSound("sounds/sonidoBoton.mp3");
            animacion();

        }else if(Greenfoot.mouseClicked(instrucciones))
        {
            MundoInstruc inst=new MundoInstruc(l); 
            inst.setMenu(this);
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

        addObject(records, getWidth()/2,getHeight()/2+150);
    }

    private void animacion()
    {
        Animation animation=new Animation(l);
        Greenfoot.setWorld(animation);

    }

    public void setScore(int []Score)
    {
        this.Score=Score;
    }

    
}
