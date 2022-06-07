import greenfoot.*;  

public class Level3 extends World

{

    public GreenfootImage []imagesBarraPuntos;
    public int score1;
    public int score2;
    
    Cuenta contadorT;
    Libro librin;

    public Level3(Libro librin)
    {    

        super(1100, 600, 1);

       this.librin=librin ;       
        
        score1=librin.score[0];
        score2=librin.score[1];
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
        
        
        
        librin.finEnd=true;
        librin.fin=true;
        addObject(librin,120 , 100);
        librin.score[0]=score1;
        librin.score[1]=score2;
        librin.score[0]=score1;
        
        
        
        Vida vida = new Vida();
        addObject(vida,930,80);
        Vida vida2 = new Vida();
        addObject(vida2,840,80);
        Vida vida3 = new Vida();
        Niño nini=new Niño(vida3,vida,vida2);
        addObject(nini, 100,600);
        addObject(vida3,1000,80);
        Fantasma fantasma=new Fantasma(nini);        
        addObject(fantasma,0,0);
        Profe pro=new Profe(nini);
        addObject(pro, 0, 0);
        nini.setFantasma(fantasma);
        Points points=new Points();
        addObject(points, 200, 70);
        librin.setImagesBarr(imagesBarraPuntos);
        librin.setLocation(0,0);
        librin.setPoints(points);
        Maceta ma1=new Maceta();
        Maceta ma2=new Maceta();
        Maceta ma3=new Maceta();
        Maceta ma4=new Maceta();
        Maceta ma5=new Maceta();
        addObject(ma1, 500, 100);
        addObject(ma2, 300, 600);
        addObject(ma3, 400, 300);
        addObject(ma4, 100, 400);
        addObject(ma5, 350, 200);
        librin.score[0]=score1;
        librin.score[1]=score2;
        fantasma.libri=librin;
        pro.libri=librin;
        apareceLetrero("Parcial 3");
    }
    protected void apareceLetrero(String text)
    {
        Letrero letrero= new Letrero(text);
        addObject(letrero, getWidth()/2+70,getHeight()-100);
    }
    
    public void setContador(Cuenta cuenta)
    {
        this.contadorT=cuenta;
    }
    public void setLibro(Libro libri)
    {
        this.librin=libri;
    }
}
