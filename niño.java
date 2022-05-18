import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class niño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class niño extends Actor
{
    private GreenfootImage []images;
    private GreenfootImage []images2;
    private GreenfootImage imgShoot;
    private GreenfootSound sound =new GreenfootSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/golpe.mp3");
    private int offSetX=0;
    private int offSetY=0;
    Fantasma fantasma;
    Bala bala= new Bala(fantasma);
    GreenfootSound soundSusu=new GreenfootSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/susurro.mp3");
    GreenfootSound soundWalk=new GreenfootSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/pasos.mp3");
    int cont=1;
    int contDalay=0;
    int ok=0;
    int contStatic=0;
    int vol=20;
    int tiempo=200;
    int contS=0;
    boolean disparo=false;
   
    
    public void act()
    {
         
        move();
        restar();
        soundSusu.playLoop();
        soundSusu.setVolume(20);
        dispara();
        getWorld().addObject(bala, 800,0);
        noTocar();
        
       
        
        
                
    }
    niño()
    {
        
        
        images=new GreenfootImage[9];
        images2=new GreenfootImage[5];
        images[0] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño.png");
        images[1] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/nino1.png");
        images[2] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño2.png");
        images[3] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño3.png");
        images[4] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño4.png");
        images[5] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño5.png");
        images[6] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño6.png");
        images[7] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño7.png");
        images[8] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño8.png");
        //*******************
        images2[0] =images[0];
        images2[1] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niñoQuieto2.png");
        images2[2] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niñoQuieto3.png");
        images2[3] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niñoQuieto4.png");
        images2[4] =new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/quejido.png");
        //*********
        
        images2[0].scale(images[0].getWidth()+5,images[0].getHeight()-20);
        images2[1].scale(images[0].getWidth()-38,images[0].getHeight()-25);
        imgShoot=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/niño9.png");
        images2[2].scale(10,10);
        images2[3].scale(10,10);
        

        
       for(int cont=0;cont<8;cont++)
        {
            
            images[cont].scale(90, 120);
        }
        images[4].scale(130-10, 135-5);
        images[0].scale(images[0].getWidth(), images[0].getHeight()+10);
        images[7].scale(80, 135);
        images[8].scale(80, 135);
        images[3].scale(images[3].getWidth(), images[3].getHeight()-5);
        
        
        

    }
    private void move()
    {
        int currentX=getX();//te da la posicion en x del objeto
        int currentY=getY();//te da la posiscion en y del objetko
        int location;
        
        if(Greenfoot.isKeyDown("RIGHT"))
        {
            offSetX=7;
            
            setLocation(currentX+offSetX,currentY);
            contDalay++;
            soundWalk.play();
            soundWalk.setVolume(vol);
            if(ok==1)
            {
                giraEnEspejo();
            }
            if(contDalay==7)
            {
                setImage(images[cont]);
                cont++;
                contDalay=0;
            }
            
            if(cont==6)
            {
                cont=1;
            }
            ok=0;
            
            
        }else if(Greenfoot.isKeyDown("LEFT"))
        {
            
            offSetX=-7;
            
            soundWalk.play();
            soundWalk.setVolume(vol);
            setLocation(currentX+offSetX,currentY);
            contDalay++;
           

            if(ok==0)
            {
                giraEnEspejo();
            }
          
            
            if(contDalay==7)
            {
                setImage(images[cont]);
               
                cont++;
                contDalay=0;
            }
            
            if(cont==6)
            {
                cont=1;
            }
            ok=1;
           // giraEnEspejo();
        }else if(Greenfoot.isKeyDown("DOWN"))
        {
            
            offSetY=7;
            setLocation(currentX,currentY+offSetY);
            setImage(images[7]);
            
        }else if(Greenfoot.isKeyDown("UP"))
        {
            
            offSetY=-7;
            setLocation(currentX,currentY+offSetY);
            setImage(images[8]);
            
            
        }
        else if(Greenfoot.isKeyDown("V"))
        {
        
            
            if(contS>tiempo)
            {
                
                setImage(imgShoot);
                //mueveteBala();
                bala.setLocation(getX(),getY());
                Greenfoot.playSound("C:/Users/MIRI/OneDrive/Escritorio/horrorList/sounds/disparo.mp3");
                //fantasma.setLocation(fantasma.getX()+offSetX,fantasma.getY());
                contS=0;
                getWorld().addObject(bala, 800,getY());
                disparo=true;
                
               // Greenfoot.delay(20);
                
                
               
                
                
                
            }
            if(bala.getX()>=1000)
            {
            
                disparo=false;
                //bala.setLocation(getX(),getY());
                
                //getWorld().removeObject(bala);
            }
            if(bala.getDaño())
            {
                getWorld().removeObject(fantasma);
            }
            if(disparo==true && bala.getX()<1000)
            {
                
                bala.setLocation(bala.getX()+100,bala.getY());
                
            }else
            {
                bala.setLocation(800,0);
            }
            
            
            
            
        
        }else
        {
            cont=1;
            
            setImage(images[0]);
            
                
            
        }
        
    }
    private void giraEnEspejo()
        {
            
            for(int l=0;l<6;l++)
            {
                images[l].mirrorHorizontally();
            }
            
        }
    
    private void restar()
    {
        if(isTouching(libro.class)==true)
        {
            removeTouching(libro.class);
        }
    }

    public void quejate()
    {
        setImage(images2[4]);
    
        sound.play();
        sound.setVolume(100);
    }
    private void dispara()
    {
         contS++;
         if(contS==300)
         {
             contS=300;
         }
       
        
        
    }
    public void setFantasma(Fantasma fantasma)
    {
        this.fantasma=fantasma;
    }
    private void noTocar()
    {
        if (isTouching(maceta.class))
        {
            move(-10);
        }
        
    }
    
    
   
}
