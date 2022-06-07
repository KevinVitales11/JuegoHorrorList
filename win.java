import greenfoot.*;  

public class Win extends World
{

    GreenfootImage img=new GreenfootImage("images/fondoNegro.jpg");
    Regresar regresar=new Regresar();
    BotonRecords record= new BotonRecords();
    private int[] score;
    public int score1;
    public int score2;
    public int score3;
    
    

    public Win(int score[])
    {    

        super(600, 400, 1); 
        
        setBackground(img);
        showText("FELICIDADES ENTREGASTE LA LINKEDLIST",getWidth()/2, getHeight()/2);
        addObject(regresar, getWidth()/2,getHeight()/2+100);
        addObject(record, getWidth()/2,getHeight()/2+150);
        this.score=score;
        

    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
       if( Greenfoot.mouseClicked(regresar))
       {
           MyWorld p =new MyWorld();
        
           p.score=score;
           
           Greenfoot.setWorld(p);
       }
    }
    public void setScore1(int score1)
    {
        this.score[0]=score1;
    }
    public void setScore2(int score2)
    {
        this.score[1]=score2;
    }
    public void setScore3(int score3)
    {
        this.score[2]=score3;
    }
    
   
    
}
