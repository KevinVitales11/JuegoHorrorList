import greenfoot.*;  

public class BancaBoy extends Item
{
    GreenfootImage img;

    BancaBoy()
    {
        img=getImage();
        img.scale(img.getWidth()-200+10, img.getHeight()-240);       
    }
}
