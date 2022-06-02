import greenfoot.*; 
import greenfoot.GreenfootSound;

public class niño extends Actor
{
    private GreenfootImage []images;
    private GreenfootImage []images2;
    private GreenfootImage imgShoot;
    private GreenfootSound sound =new GreenfootSound("sounds/golpe.mp3");
    private int offSetX=0;
    private int offSetY=0;
    private int cont=1;
    private int contDalay=0;
    private int ok=0;
    private int contStatic=0;
    private static int vol=60;
    private static int tiempo=70;
    private int contS=0;
    private boolean disparo=false;
    public int bajas=0;
    Fantasma fantasma;
    Bala bala= new Bala(fantasma);
    private boolean volteado=false;
    GreenfootSound soundWalk=new GreenfootSound("sounds/pasos.mp3");

    
    public void act()
    {

        move();

        dispara();
        getWorld().addObject(bala, 800,0);
        noTocar();

        
                
    }

    niño()
    {

        images=new GreenfootImage[9];
        images2=new GreenfootImage[5];
        images[0] =new GreenfootImage("images/niño.png");
        images[1] =new GreenfootImage("images/nino1.png");
        images[2] =new GreenfootImage("images/niño2.png");
        images[3] =new GreenfootImage("images/niño3.png");
        images[4] =new GreenfootImage("images/niño4.png");
        images[5] =new GreenfootImage("images/niño5.png");
        images[6] =new GreenfootImage("images/niño6.png");
        images[7] =new GreenfootImage("images/niño7.png");
        images[8] =new GreenfootImage("images/niño8.png");
      
        images2[0] =images[0];
        images2[1] =new GreenfootImage("images/niñoQuieto2.png");
        images2[2] =new GreenfootImage("images/niñoQuieto3.png");
        images2[3] =new GreenfootImage("images/niñoQuieto4.png");
        images2[4] =new GreenfootImage("images/quejido.png");
     
        images2[0].scale(images[0].getWidth()+5,images[0].getHeight()-20);
        images2[1].scale(images[0].getWidth()-38,images[0].getHeight()-25);
        imgShoot=new GreenfootImage("images/niño9.png");
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
        int currentX=getX();
        int currentY=getY();
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
        else if(Greenfoot.isKeyDown("SPACE"))
        {

            if(contS>tiempo)
            {
                if(volteado==true)
                {
                    imgShoot.mirrorHorizontally();
                    bala.getImage().mirrorHorizontally();
                    volteado=false;
                }
                setImage(imgShoot);
                bala.setLocation(getX(),getY());
                Greenfoot.playSound("sounds/disparo.mp3");
                contS=0;
                getWorld().addObject(bala, 800,getY());
                disparo=true;

            }
            if(bala.getX()>=1000||bala.getX()==0)
            {

                disparo=false;
            }
            if(bala.getDaño())
            {
                fantasma.toco();
                bajas++;
            }
            if(disparo==true && bala.getX()<1000)
            {

                bala.setLocation(bala.getX()+100,bala.getY());

            }else
            {
                bala.setLocation(800,0);
            }

        }else if(Greenfoot.isKeyDown("x"))
        {
            if(contS>tiempo)
            {
                if(volteado==false)
                {
                    imgShoot.mirrorHorizontally();
                    volteado=true;
                }
                setImage(imgShoot);
                bala.setLocation(getX(),getY());
                Greenfoot.playSound("sounds/disparo.mp3");
                contS=0;
                getWorld().addObject(bala, 800,getY());
                disparo=true; 
            }
            if(bala.getX()>=1000||bala.getX()<=0)
            {
                disparo=false;
            }
            if(bala.getDaño())
            {
                fantasma.toco();
            }
            if(disparo==true && bala.getX()<1000)
            {

                bala.setLocation(bala.getX()-100,bala.getY());

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

    public void quejate()
    {
        setImage(images2[4]);
        sound.play();
        sound.setVolume(100);
    }

    public void quejate2()
    {
        images2[4].mirrorHorizontally();
        setImage(images2[4]);
        Greenfoot.delay(30);
        images2[4].mirrorHorizontally();
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
        if (isTouching(Arbusto.class))
        {
            setLocation(getX(), getY()+10);
        }
        if (isTouching(Tienda.class))
        {
            setLocation(getX(), getY()+10);
        }

    }
    
}
