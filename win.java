import greenfoot.*;  

public class win extends World
{

    GreenfootImage img=new GreenfootImage("images/fondoNegro.jpg");

    public win()
    {    

        super(600, 400, 1); 
        setBackground(img);
        showText("FELICIDADES ENTREGASTE LA LINKEDLIST",getWidth()/2, getHeight()/2);

    }

}
