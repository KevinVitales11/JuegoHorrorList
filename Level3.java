import greenfoot.*;  

public class Level3 extends World

{

    public GreenfootImage []imagesBarraPuntos;

    public Level3()
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

    private void prepare()
    {
        niño nini=new niño();
        addObject(nini, 100,600);
        libro librin=new libro();
        librin.finEnd=true;
        librin.fin=true;
        addObject(librin,120 , 100);
        vida vida = new vida();
        addObject(vida,930,80);
        vida vida2 = new vida();
        addObject(vida2,840,80);
        vida vida3 = new vida();
        addObject(vida3,1000,80);
        Fantasma fantasma=new Fantasma(nini,vida,vida2,vida3);
        addObject(fantasma,0,0);
        Profe pro=new Profe(nini,vida,vida2,vida3);
        addObject(pro, 0, 0);
        nini.setFantasma(fantasma);
        Points points=new Points();
        addObject(points, 200, 70);
        librin.setImagesBarr(imagesBarraPuntos);
        librin.setLocation(0,0);
        librin.setPoints(points);
        maceta ma1=new maceta();
        maceta ma2=new maceta();
        maceta ma3=new maceta();
        maceta ma4=new maceta();
        maceta ma5=new maceta();
        addObject(ma1, 500, 100);
        addObject(ma2, 300, 600);
        addObject(ma3, 400, 300);
        addObject(ma4, 100, 400);
        addObject(ma5, 350, 200);
        apareceLetrero("Parcial 3");
    }
    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);
        addObject(letrero, getWidth()/2+70,getHeight()-100);
    }
}
