import greenfoot.*;  


public class Record extends World
{

    

    private int []score=new int[4];
    private String nombre;
    Menu menu;
    Regresar regresar=new Regresar();
    public Record(int []score)
    { 
        super(600, 400, 1); 
        this.score=score;
        if(this.score==null)
        {
            score=new int[4];
        }
        showText("Tu score en tiempo es:",getWidth()/2, getHeight()/2-50);
        showText(score[0]+" Segundos", getWidth()/2, getHeight()/2);
        showText(score[1]+" Segundos", getWidth()/2, getHeight()/2+50);
        showText(score[2]+" Segundos", getWidth()/2, getHeight()/2+100);
        addObject(regresar,getWidth()/2, getHeight()/2+150);
        
    }
    public void act()
    {
        
        muestraNombre();
        termina();
    }
    
    
    
    private void muestraNombre()
    {
        if(nombre!=null)
        {
            showText("Bienvenido "+nombre, getWidth()/2, getHeight()/2-100);
        }
    }
    public void setMenu(Menu menu)
    {
        this.menu=menu;
    }
    public void termina()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(regresar))
        {
            Greenfoot.setWorld(menu);
        }
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    
    
    
}
