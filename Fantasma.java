import greenfoot.*; 
import java.util.Random; 

public class Fantasma extends Actor
{
    private GreenfootImage img;
    private int movingCont=0;
    private int Objx;
    private int Objy;
    public int ObjFantx;
    private int ObjFanty;
    private int cont=0;
    private niño nini;
    private vida vidi;
    private vida vidi2;
    private vida vidi3;
    private escenario2 esce=new escenario2();
    private int contador=0;
    private int tiempo=(Greenfoot.getRandomNumber(600))+700;
    private int contDalay=1;
    private int dalay=0, tiempo2=10;
    private int tiempoDisparo=100;
    private int contDisparo=0;
    public boolean bandera=true;
    public boolean bandera2=false;
    private boolean bandera3=false;
    GreenfootSound pie=new GreenfootSound("sounds/grito.mp3");

    public void act()
    {
        perseguir(); 
    }

    public Fantasma()
    {
        img=getImage();
        img.mirrorHorizontally();
        img.scale(img.getWidth()-250,img.getHeight()-250);
    }

    public Fantasma(niño nini, vida vid,vida vid2,vida vid3)
    {

        this.vidi2=vid2;
        this.vidi3=vid3;
        this.nini=nini;
        this.vidi=vid;
        img=getImage();
        img.mirrorHorizontally();
        img.scale(img.getWidth()-250,img.getHeight()-250);
        ObjFantx=nini.getX();
        ObjFanty=nini.getY();

    }
    public void perseguir()
    {


        ObjFanty=nini.getY();
        Objx=getX();
        Objy=getY();

        if(bandera==false)
        {

            repoduceOneTimeSound();
            setLocation(ObjFantx+930+cont,ObjFanty);
            if(getWorld().getObjects(vida.class)==null)
            {
                Greenfoot.playSound("sounds/noo.mp3");

                Greenfoot.setWorld(esce);
                getWorld().removeObject(nini);
                getWorld().removeObject(this);

            }
            if(isTouching(niño.class)==true)
            { 
                toco();
                nini.move(-130);
                if(contDalay==1)
                {
                    getWorld().removeObject(vidi3); 
                    nini.quejate();
                    Greenfoot.delay(30);
                }else if(contDalay==2)
                {
                    getWorld().removeObject(vidi);
                    nini.quejate();
                    Greenfoot.delay(30);
                }else if(contDalay==3)
                {

                    getWorld().removeObject(vidi2);
                    nini.quejate();
                    Greenfoot.delay(30);
                }else
                {
                    Greenfoot.playSound("sounds/noo.mp3");

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
    
    private int aleatorio()
    {
        Random dado=new Random();
        int numero;
        numero=dado.nextInt(100+10);
        return numero;
    }

    private void repoduceOneTimeSound()
    {
        if(bandera2==false)
        {
            pie.setVolume(30);
            pie.play();
            bandera2=true;

        }

    }

    public Fantasma getFantasma()
    {
        return(this);
    }

    public void toco()
    {
        contador=0;
        setLocation(0,0);
        cont=0;
        bandera=true;
        bandera2=false;
        ObjFantx=nini.getX();
    }

   
}
