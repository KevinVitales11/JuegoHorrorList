import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class libro extends Actor
{
    /**
     * Act - do whatever the libro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage []imagesLibro;
    private GreenfootImage []imagesBarr;
    Points points;
    private int cont=0;
    private int tiempo=110;
    private int puntos=0;
    private int cont2=1;
    private cafe coffe;
    public boolean fin=false;
    public boolean finEnd=false;
    niño nini;
    int time;
    public libro()
    {
        getImage().scale(30, 30);
        setLocation(800,800);
        
       
    }
    public void act()
    {
        apareceteAleatoriamente();
        restar();
        aumentaPuntos();
        //coffe.setIM(cont2);
        
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
    public void setCoffe(cafe coffe)
    {
        this.coffe=coffe;
    }
    private void restar()
    {
        if(isTouching(niño.class)==true)
        {
        
            String m;
            puntos++;
            setLocation(0,0);
            Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/moneda.mp3");
            
            
        }
    }
    private void Win()
    {
    int cont=2;
    
    getWorld().showText(""+cont, getWorld().getWidth()/2,getWorld().getHeight()/2);
    
    
        Greenfoot.delay(100);
        if(fin==true)
        {
            
            if(finEnd==true)
            {
                win ganar=new win();
                Greenfoot.setWorld(ganar); 
            }else
            {
                
                //Letrero leter=new Letrero("%d",cont);
                
                Level3 nivelFin=new Level3();
                Greenfoot.setWorld(nivelFin);
               getWorld().removeObjects(getWorld().getObjects(Fantasma.class));
               getWorld().removeObjects(getWorld().getObjects(niño.class));
               getWorld().removeObjects(getWorld().getObjects(Points.class));
               getWorld().removeObjects(getWorld().getObjects(libro.class));
              
            }
        }else
        {
         Level2 nivel=new Level2();
         
        
        
        //getWorld().getObjects(niño.class).clear();
        
        Greenfoot.setWorld(nivel);
        getWorld().removeObjects(getWorld().getObjects(Fantasma.class));
        getWorld().removeObjects(getWorld().getObjects(niño.class));
        getWorld().removeObjects(getWorld().getObjects(Points.class));
        getWorld().removeObjects(getWorld().getObjects(libro.class));
        }
       
         
        
        
    }
    
    public void setImagesBarr(GreenfootImage []imagesBarr)
    {
        this.imagesBarr=imagesBarr;
    }
    private void aumentaPuntos()
    {
        
        if(puntos==3)
        {
            cont2++;
            points.setImage(imagesBarr[cont2]);
            puntos=0;
            if(cont2==4)
            {
                cont2=1;
                Win();
            }
        }
        
    }
    public void setPoints(Points points)
    {
        this.points=points;
    }
    
    
    


}
