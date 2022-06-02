import greenfoot.*;  


public class libro extends Actor
{
    
     
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
    private int time;
    
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
    

    
        if(fin==true)
        {
            
            if(finEnd==true)
            {
                
                win ganar=new win();
                Greenfoot.setWorld(ganar); 
                getWorld().removeObjects(getWorld().getObjects(Music.class));
            }else
            {
               
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
