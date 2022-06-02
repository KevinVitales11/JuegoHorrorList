import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Music extends OnlyAppear
{
    GreenfootSound sound;
    public Music( GreenfootSound sound)
    {
     
        this.sound=sound;
        
    }
    public void act()
    {
        sound.playLoop();
        sound.setVolume(70);
    }
}
