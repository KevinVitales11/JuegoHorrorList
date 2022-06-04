import greenfoot.*;  
import greenfoot.GreenfootSound;
import java.awt.Color;
import java.lang.Object;

public class MyWorld extends World
{
    private Wall p=new Wall();
    
    public int cambiador=0;
    public GreenfootImage []imagesBarraPuntos;
    int tiempo=0;

    public MyWorld()
    {    

        super(1100, 600, 1); 
        imagesBarraPuntos=new GreenfootImage[6];
        imagesBarraPuntos[4]=new GreenfootImage("images/b0.png");
        imagesBarraPuntos[3]=new GreenfootImage("images/b1.png");
        imagesBarraPuntos[2]=new GreenfootImage("images/b2.png");
        imagesBarraPuntos[1]=new GreenfootImage("images/b3.png");
        imagesBarraPuntos[0]=new GreenfootImage("images/b4.png");
        imagesBarraPuntos[0].scale(imagesBarraPuntos[0].getWidth()-200,imagesBarraPuntos[0].getHeight()-30);
        imagesBarraPuntos[1].scale(imagesBarraPuntos[1].getWidth()-200,imagesBarraPuntos[1].getHeight()-30);
        imagesBarraPuntos[2].scale(imagesBarraPuntos[2].getWidth()-200,imagesBarraPuntos[2].getHeight()-30);
        imagesBarraPuntos[3].scale(imagesBarraPuntos[3].getWidth()-200,imagesBarraPuntos[3].getHeight()-30);
        imagesBarraPuntos[4].scale(imagesBarraPuntos[4].getWidth()-200,imagesBarraPuntos[4].getHeight()-30);
        prepare();

    }

    public void act()
    {

        Greenfoot.setSpeed(50);
        if(cambiador==0)
        {
            cambiador=-1;
            Menu menu=new Menu(this);
            Level2 nivelDos=new Level2();
            Greenfoot.setWorld(menu);

        }
       

    }

    private void prepare()
    {

        
        niño personaje=new niño();
        Points points=new Points();
        addObject(points, 200, 70);
        GreenfootImage img= new GreenfootImage("images/pisoMadera.jpg");
        setBackground(img);
        libro librin=new libro();
        librin.setImagesBarr(imagesBarraPuntos);
        librin.setLocation(0,0);
        librin.setPoints(points);
        addObject(librin,800,800);

        
        addObject(personaje,80,200);
        vida vida = new vida();

        addObject(vida,930,80);

        vida vida2 = new vida();
        addObject(vida2,840,80);
        vida vida3 = new vida();
        addObject(vida3,1000,80);

        Fantasma fantasma=new Fantasma(personaje,vida,vida2,vida3);
        personaje.setFantasma(fantasma);
        Profesor profe=new Profesor();
        addObject(profe,getWidth()-100, getHeight()/2);
        apareceLetrero("Parcial 1");

        addObject(fantasma,0,0);
        for(int cont=15;cont<55;cont=cont+10)
        {
            bancaBoy banquita=new bancaBoy();
            addObject(banquita, banquita.getImage().getHeight()+cont*15, 200);

        }
        for(int cont=15;cont<55;cont=cont+10)
        {
            bancaBoy banquita=new bancaBoy();
            addObject(banquita, banquita.getImage().getHeight()+cont*15, 375+35);
        }

        for(int cont=0;cont<55;cont++)
        {
            Wall pared=new Wall();
            addObject(pared, pared.getImage().getHeight()+cont*20, 0);

        }
        Pizzarron piza=new Pizzarron();
        Wall wall2=new Wall();
        addObject(wall2, 0, 0);
        addObject(piza,getWidth()-30, getHeight()/2);
        maceta maceta = new maceta();
        addObject(maceta,13,42);
        maceta maceta2 = new maceta();
        addObject(maceta2,31,538);
        maceta maceta3 = new maceta();
        addObject(maceta3,1009,389);
        librin.setNiño(personaje);
        Music music=new Music(new GreenfootSound("sounds/talking.mp3"));
        addObject(music,0,0);
        Cuenta contador=new Cuenta();
        addObject(contador, 0,0);

    }
    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);

        for(int cont=0;cont<10;cont++);

        addObject(letrero, getWidth()/2+70,getHeight()-100);
        for(int cont=0;cont<10;cont++);
        if(Greenfoot.isKeyDown("RIGHT"))
        {
            removeObject(letrero);  
        }

    }

    private int aleatorio()
    {
        int aleatorio;
        aleatorio=(int)(Math.random()*10);
        return aleatorio;
    }

}
