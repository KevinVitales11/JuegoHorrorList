import greenfoot.*;  

public class libro extends Actor
{

    private GreenfootImage []imagesLibro;
    private GreenfootImage []imagesBarr;
    public int[] Score=new int[3];
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
    private int contadorTiempo=0;
    Cuenta contadorT;
    
    Record MundoRecord=new Record(Score);
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
        contadorTiempo++;

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
            Greenfoot.playSound("sounds/moneda.mp3");

        }
    }

    private void Win()
    {

    
        if(fin==true)
        {

            
            if(finEnd==true)
            {

                Score[2]=contadorTiempo/100;
                win ganar=new win(Score);
                ganar.Score1=Score[0];
                ganar.Score2=Score[1];
                ganar.Score3=Score[2];
                
                Greenfoot.setWorld(ganar); 
                getWorld().removeObjects(getWorld().getObjects(Music.class));
            }else
            {

                Level3 nivelFin=new Level3();
                Score[1]=contadorTiempo/100;
                nivelFin.Score1=Score[0];
                nivelFin.Score2=Score[1];
                nivelFin.Score3=Score[2];
              
                Greenfoot.setWorld(nivelFin);
                getWorld().removeObjects(getWorld().getObjects(Fantasma.class));
                getWorld().removeObjects(getWorld().getObjects(niño.class));
                getWorld().removeObjects(getWorld().getObjects(Points.class));
                

            }
        }else
        {
            Level2 nivel=new Level2();
            

            Score[0]=contadorTiempo/100;
            nivel.Score1=Score[0];
            nivel.Score2=Score[1];
            nivel.Score3=Score[2];
            
            Greenfoot.setWorld(nivel);
            getWorld().removeObjects(getWorld().getObjects(Fantasma.class));
            getWorld().removeObjects(getWorld().getObjects(niño.class));
            getWorld().removeObjects(getWorld().getObjects(Points.class));
            

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
