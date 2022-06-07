import greenfoot.*;  

public class MundoInstruc extends World
{

    MyWorld m;
    GreenfootImage img=new GreenfootImage("images/rivets.jpg"); 
    Menu menu;

    Regresar regresar=new Regresar();
    public MundoInstruc(MyWorld l )
    {    
        super(800, 600, 1); 
        this.m=l;
        setBackground(img);
        prepare();

    }

    private void prepare()
    {
        Inst2 space=new Inst2();
        Ins1 flechas=new Ins1();
        Inst3 botonX=new Inst3();
        if(m==null)
        {
            System.out.println("null");
        }else
        {
            
            
            addObject(regresar, getWidth()/2, getHeight()-100);
        }
        addObject(flechas, getWidth()/2-300, getHeight()/2-100);
        addObject(space, getWidth()/2, getHeight()/2);
        addObject(botonX, getWidth()/2+300, getHeight()/2-100);
    }
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(regresar))
        {
            Greenfoot.setWorld(menu);
        }   
        
    }
    public void setMenu(Menu menu)
    {
        this.menu=menu;
    }
}
