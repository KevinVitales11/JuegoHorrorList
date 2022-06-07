import greenfoot.*;  

public class Libro extends Actor
{

    private GreenfootImage []imagesLibro;
    private GreenfootImage []imagesBarr;
    public int[] score;
    Points points;
    private int cont=0;
    private int tiempo=110;
    private int puntos=0;
    private int cont2=1;
    public boolean fin=false;
    public boolean finEnd=false;
    Niño nini;
    private int time;
    public int contadorTiempo;
    Cuenta contadorT;

    
    

    
    public Libro()
    {
        getImage().scale(30, 30);
        setLocation(800,800);
        score=new int[4];
        score[0]=0;
        score[1]=0;
        score[2]=0;
        score[3]=0;
        contadorTiempo=0;

       
    }

    public void act()
    {

        contadorTiempo++;
        
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

    public void setNiño(Niño nini)
    {
        this.nini=nini;
    }

    

    private void restar()
    {
        if(isTouching(Niño.class)==true)
        {

            String m;
            puntos++;
            setLocation(0,0);
            Greenfoot.playSound("sounds/moneda.mp3");

        }
    }

    private void win()
    {

    
        if(fin==true)
        {

            
            if(finEnd==true)
            {

                score[2]=contadorTiempo/100;
                
                Win ganar=new Win(score);
                Greenfoot.setWorld(ganar); 
                
            }else
            {

                
                score[1]=contadorTiempo/100;
               
                Level3 nivelFin=new Level3(this);
                nivelFin.score1=score[0];
                nivelFin.score2=score[1];
                
                Greenfoot.setWorld(nivelFin);
             
                
                
                

            }
        }else
        {
            
                Level2 nivel=new Level2(this);
    
                score[0]=contadorTiempo/100;
            
                nivel.setLibro(this);
                nivel.score1=score[0];
                Greenfoot.setWorld(nivel);
                
                
            
           
            

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
                win();

            }
        }

    }

    public void setPoints(Points points)
    {
        this.points=points;
    }
    
    
    

    

}
