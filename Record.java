import greenfoot.*;  


public class Record extends World
{

    

    private int []Score=new int[4];
    public int Score1;
    public int Score2;
    public int Score3;
    
    public Record(int [] Score)
    { 
        super(600, 400, 1); 
        this.Score=Score;
        showText("Tu score en tiempo es:",getWidth()/2, getHeight()/2-50);
        showText(Score1+" Segundos", getWidth()/2, getHeight()/2);
        showText(Score2+" Segundos", getWidth()/2, getHeight()/2+50);
        showText(Score3+" Segundos", getWidth()/2, getHeight()/2+100);
        
    }
    
    
    
    
}
