import greenfoot.*; 
import java.util.Random; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fantasma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasma extends Actor
{
    private GreenfootImage img;
    private int movingCont=0;
    private int Objx;
    private int Objy;
    private int ObjFantx;
    private int ObjFanty;
    private int cont=0;
    private niño nini;
    private vida vidi;
    private vida vidi2;
    private vida vidi3;
    private escenario2 esce=new escenario2();
    private int contador=0;
    private int tiempo=(Greenfoot.getRandomNumber(1500))+1000;
    private int contDalay=1;
    private int dalay=0, tiempo2=10;
    private int tiempoDisparo=100;
    private int contDisparo=0;
    private boolean bandera=true;
    private boolean bandera2=false;
    private boolean bandera3=false;
    GreenfootSound pie=new GreenfootSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/grito.mp3");
   
    /**
     * Act - do whatever the Fantasma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            setLocation(ObjFantx+730+cont,ObjFanty);
            if(isTouching(niño.class)==true)
            { 
               contador=0;
               
               setLocation(0,0);
               cont=0;
               bandera=true;
               bandera2=false;
               ObjFantx=nini.getX();
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
                   Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/noo.mp3");
                   Greenfoot.setWorld(esce);
                   getWorld().removeObject(nini);
                   getWorld().removeObject(this);
                   
                   
                   
               }
                contDalay++; 
               
            }
            cont=cont-(Greenfoot.getRandomNumber(9)+1);
        
        }else
        {
            if(tiempo==contador)
            {
                bandera=false;
                tiempo=(Greenfoot.getRandomNumber(1500))+700;
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
            pie.setVolume(10);
            pie.play();
            bandera2=true;
            
        }
        
    }
    public Fantasma getFantasma()
    {
        return(this);
    }
    

   
  
}
