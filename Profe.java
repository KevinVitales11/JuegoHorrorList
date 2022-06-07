import greenfoot.*; 

public class Profe extends Enemigo
{
    private GreenfootImage img;
    private int movingCont=0;
    private int objx;
    private int objy;
    public int objFantx;
    private int objFanty;
    private int cont=0;
    private Niño nini;
    public int []Score;
    private int contador=0;
    private int tiempo=(Greenfoot.getRandomNumber(600))+700;
    private int contDalay=1;
    private int dalay=0, tiempo2=10;
    private int tiempoDisparo=100;
    private int contDisparo=0;
    public boolean bandera=true;
    public boolean bandera2=false;
    private boolean bandera3=false;
    public Libro libri;
    GreenfootSound pie=new GreenfootSound("sounds/enojado.mp3");

    public void act()
    {
        perseguir(); 
        tocando();
    }

    public Profe()
    {
        img=getImage();
        img.mirrorHorizontally();
        img.scale(img.getWidth()-250,img.getHeight()-250);
    }

    public Profe(Niño nini)
    {

        
        this.nini=nini;
        

        setImage("images/profe.png");
        getImage().scale(getImage().getWidth()+40,getImage().getHeight()+50 );
        img=getImage();
        objFantx=nini.getX();
        objFanty=nini.getY();
        img.mirrorHorizontally();

    }

    public void perseguir()
    {
        objFanty=nini.getY();
        objx=getX();
        objy=getY();

        if(bandera==false)
        {

            repoduceOneTimeSound();
            setLocation(objFantx-930-cont,objFanty);
            if(getWorld().getObjects(Vida.class)==null)
            {
                Greenfoot.playSound("sounds/noo.mp3");
                Escenario2 esce=new Escenario2(libri.score);
                Greenfoot.setWorld(esce);
                getWorld().removeObject(nini);
                getWorld().removeObject(this);

            }
            if(isTouching(Niño.class)==true)
            { 
                toco();
                nini.move(+130);
                if(contDalay==1)
                {
                    nini.removeVida1();
                    nini.quejate2();

                }else if(contDalay==2)
                {
                    nini.removeVida2();
                    nini.quejate2();

                }else if(contDalay==3)
                {

                    nini.removeVida3();
                    nini.quejate2();

                }else if(contDalay==4)
                {
                    Greenfoot.playSound("sounds/noo.mp3");
                    Escenario2 esce=new Escenario2(libri.score);
                    Greenfoot.setWorld(esce);
                    getWorld().removeObject(nini);

                }else if(getWorld().getObjects(Vida.class)==null)
                {

                    Greenfoot.playSound("sounds/noo.mp3");
                    Escenario2 esce=new Escenario2(libri.score);
                    Greenfoot.setWorld(esce);
                    getWorld().removeObject(nini);
                    getWorld().removeObject(this);

                }
                contDalay++; 

            }
            cont=cont-(Greenfoot.getRandomNumber(10)+8);

        }else
        {
            if(tiempo==contador)
            {
                bandera=false;
                tiempo=(Greenfoot.getRandomNumber(300))+500;
                contador=0;
            }
            contador++;

        }

    }
    
    private void repoduceOneTimeSound()
    {
        if(bandera2==false)
        {
            pie.setVolume(100);
            pie.play();
            bandera2=true;

        }

    }

    

    public void toco()
    {
        contador=0;
        setLocation(0,0);
        cont=0;
        bandera=true;
        bandera2=false;
        objFantx=nini.getX();
    }

    private void tocando()
    {
        if(isTouching(Bala.class))
        {

            toco();

        }
    }

}