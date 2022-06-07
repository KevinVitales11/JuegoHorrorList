import greenfoot.*;  

public class Level2 extends World
{
    public GreenfootImage []imagesBarraPuntos;
    private boolean fin;
    public int score1;
    
    Libro librin;
    
    public Level2(Libro librin)
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
        this.librin=librin;
        
        prepare();
    }

    private void prepare()
    {
        Tienda tienda=new Tienda();
        
        addObject(tienda, getWidth()/2, 170);
        People per=new People();
        addObject(per, getWidth()/2-120, getHeight()/2-30);
        
        addObject(librin,120 , 100);
        librin.score[0]=score1;
        librin.fin=true;
        Arbusto arbus=new Arbusto();
        addObject(arbus,getWidth()-100 , 100);
        Arbusto arbus2=new Arbusto();
        addObject(arbus2,120 , 100);
       
        Vida vida = new Vida();
        addObject(vida,930,80);
        Vida vida2 = new Vida();
        addObject(vida2,840,80);
        Vida vida3 = new Vida();
        addObject(vida3,1000,80);
        Niño nini=new Niño(vida3,vida,vida2);
        addObject(nini, 100,600);
        Fantasma fantasma=new Fantasma(nini);
        Profe profe=new Profe(nini);
        addObject(profe,0,0);
        addObject(fantasma,0,0);
        nini.setFantasma(fantasma);
        Points points=new Points();
        addObject(points, 200, 70);
        
       
        librin.setImagesBarr(imagesBarraPuntos);
        librin.setLocation(0,0);
        librin.setPoints(points);
        fantasma.libri=librin;
        profe.libri=librin;
        
        apareceLetrero("Parcial 2");
    }
    

    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);
        addObject(letrero, getWidth()/2+70,getHeight()-100);
    }
    public void setScore1(int score1)
    {
        this.score1=score1;
    }
    
    public void setLibro(Libro libri)
    {
        this.librin=libri;
    }
}
