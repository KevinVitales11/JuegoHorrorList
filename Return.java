import greenfoot.*;  

public class Return extends Botones
{
    MyWorld m;
    MyWorld n=new MyWorld();

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/sonidoBoton.mp3");
            if(m!=null)
            {
                Menu menu=new Menu(m);
                Greenfoot.setWorld(menu);
            }else
            {
                System.out.println("null");
            }

           
        }
    }

    public Return(MyWorld l)
    {
        this.m=l;
    }
}
