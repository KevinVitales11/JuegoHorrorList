import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.Comparable;


public  class UsuarioInfo implements Comparable<UsuarioInfo>
{
    private String nameUsuario;
    private int score;
    
    public UsuarioInfo(String nameUsuario,int score)
    {
        this.nameUsuario=nameUsuario;
        this.score=score;
    }
    public String getNameUsuario()
    {
        return nameUsuario;
    }
    public int getScore()
    {
        return score;
    }
    

    @Override
    
    public int compareTo(UsuarioInfo usu)
    {
        if(this.score<usu.getScore())
        {
            return -1;
        }else
        {
            if(this.score>usu.getScore())
            {
                return 1;
            }else
            {
                return 0;
            }
        }
    }
    

    
    
}
