import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cafe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cafe extends libro
{
    /**
     * Act - do whatever the cafe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private GreenfootImage []imagesLibro;
    private GreenfootImage []imagesBarr;
    Points points;
    private int cont=0;
    private int tiempo=110;
    private int puntos=0;
    private int cont2;
    
    niño nini;

    public cafe()
    {
        getImage().scale(getImage().getWidth()/12,getImage().getHeight()/12);
    }
    public void act()
    {
        apareceteAleatoriamente();
        restar();
        
       
        
    }
    

    private void apareceteAleatoriamente()
    {
        
        if(cont>tiempo)
        {
            setLocation(Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(800));
            cont=0;
        }else
        {
             cont++;
        }
       
        
        
    }
    public void setNiño(niño nini)
    {
        this.nini=nini;
    }
    private void restar()
    {
        if(isTouching(niño.class)==true)
        {
        
            String m;
            if(cont2>1)
            {
               cont2--;
              points.setImage(imagesBarr[cont2]); 
            }
            
    
            setLocation(0,0);
            
           
            Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/moneda.mp3");
            
            
        }
    }
    
   
    public void setPoints(Points points)
    {
        this.points=points;
    }
    public void setIM(int contP)
    {
        this.cont2=contP;
    }
    public cafe getCoffe()
    {
        return this;
    }
}
