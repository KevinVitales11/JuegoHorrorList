import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
    Color color=Color.PINK;
    
   public Letrero(String text)
   {
       GreenfootImage img=new GreenfootImage(text.length()*20,30);
       img.setColor(color);
       img.drawString(text,70,30);
       img.scale(300,100);
       setImage(img);
   }
   public void setText(String text)
   {
       GreenfootImage img=getImage();
       img.clear();
       img.drawString(text,2, 10);
   }
   public void setColor(Color color)
   {
       
       this.color=color;
   }
}
