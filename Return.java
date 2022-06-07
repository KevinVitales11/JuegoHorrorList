import greenfoot.*;  

public class Return extends Botones
{
    MyWorld m;
    
    MyWorld n=new MyWorld();

    Menu menu;
     public Return(MyWorld l,Menu menu)
    {
        this.m=l;
        this.menu=menu;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/sonidoBoton.mp3");
            if(m!=null)
            {
                
                Greenfoot.setWorld(menu);
            }else
            {
                System.out.println("null");
            }

           
        }
    }

   
    
}
