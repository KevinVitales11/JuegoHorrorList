import greenfoot.*;  

public class win extends World
{

    GreenfootImage img=new GreenfootImage("images/fondoNegro.jpg");
    Regresar regresar=new Regresar();
    BotonRecords record= new BotonRecords();
    private int[] Score= new int [4];
    public int Score1;
    public int Score2;
    public int Score3;
    
    

    public win(int Score[])
    {    

        super(600, 400, 1); 
        
        setBackground(img);
        showText("FELICIDADES ENTREGASTE LA LINKEDLIST",getWidth()/2, getHeight()/2);
        addObject(regresar, getWidth()/2,getHeight()/2+100);
        addObject(record, getWidth()/2,getHeight()/2+150);
        this.Score=Score;
        showText("Tu score en tiempo es:",getWidth()/2, getHeight()/2-50);
        
        showText(Score[2]+" Segundos", getWidth()/2, getHeight()/2+100);

    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
       if( Greenfoot.mouseClicked(regresar))
       {
           Greenfoot.setWorld(new MyWorld());
       }else if( Greenfoot.mouseClicked(record))
       {
           Record records=new Record(Score);
           records.Score1=Score[0];
           records.Score2=Score[1];
           records.Score3=Score[2];
           Greenfoot.setWorld(records);
           
       }
    
    }
    public void setScore1(int Score1)
    {
        this.Score[0]=Score1;
    }
    public void setScore2(int Score2)
    {
        this.Score[1]=Score2;
    }
    public void setScore3(int Score3)
    {
        this.Score[2]=Score3;
    }
    
   
    
}
