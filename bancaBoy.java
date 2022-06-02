import greenfoot.*;  

public class bancaBoy extends Item
{
    GreenfootImage img;

    bancaBoy()
    {
        img=getImage();
        img.scale(img.getWidth()-200+10, img.getHeight()-240);       
    }
}
