import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
public GreenfootImage []imagesBarraPuntos;
private boolean fin;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        imagesBarraPuntos=new GreenfootImage[6];
        imagesBarraPuntos[4]=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/b0.png");

        imagesBarraPuntos[3]=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/b1.png");
        imagesBarraPuntos[2]=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/b2.png");
        imagesBarraPuntos[1]=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/b3.png");
        imagesBarraPuntos[0]=new GreenfootImage("C:/Users/MIRI/OneDrive/Escritorio/horrorList/images/b4.png");
    
        imagesBarraPuntos[0].scale(imagesBarraPuntos[0].getWidth()-200,imagesBarraPuntos[0].getHeight()-30);
        imagesBarraPuntos[1].scale(imagesBarraPuntos[1].getWidth()-200,imagesBarraPuntos[1].getHeight()-30);
        imagesBarraPuntos[2].scale(imagesBarraPuntos[2].getWidth()-200,imagesBarraPuntos[2].getHeight()-30);
        imagesBarraPuntos[3].scale(imagesBarraPuntos[3].getWidth()-200,imagesBarraPuntos[3].getHeight()-30);
        imagesBarraPuntos[4].scale(imagesBarraPuntos[4].getWidth()-200,imagesBarraPuntos[4].getHeight()-30);
        prepare();
    }
    private void prepare()
    {
        Tienda tienda=new Tienda();
        addObject(tienda, getWidth()/2, 170);
        People per=new People();
        addObject(per, getWidth()/2-120, getHeight()/2-30);
        niño nini=new niño();
        addObject(nini, 100,600);
        libro librin=new libro();
        librin.fin=true;
        addObject(librin,120 , 100);
        
         
        Arbusto arbus=new Arbusto();
        addObject(arbus,getWidth()-100 , 100);
        Arbusto arbus2=new Arbusto();
        addObject(arbus2,120 , 100);
        cafe coffe=new cafe();
        
       // addObject(coffe, getWidth()/2, getHeight()/2+100);
        
         vida vida = new vida();

        addObject(vida,930,80);

        vida vida2 = new vida();
        addObject(vida2,840,80);
        vida vida3 = new vida();
        addObject(vida3,1000,80);
        Fantasma fantasma=new Fantasma(nini,vida,vida2,vida3);
        Profe profe=new Profe(nini,vida,vida2,vida3);
        addObject(profe,0,0);
        addObject(fantasma,0,0);
        nini.setFantasma(fantasma);
       Points points=new Points();
        addObject(points, 200, 70);
        coffe.setPoints(points);
        librin.setCoffe(coffe);
        librin.setImagesBarr(imagesBarraPuntos);
        librin.setLocation(0,0);
        librin.setPoints(points);
        
        apareceLetrero("Parcial 2");
    }
    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);
        
        
        
         addObject(letrero, getWidth()/2+70,getHeight()-100);
         
         
         
        
    }
    
}
