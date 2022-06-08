import greenfoot.*;  
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Record extends World
{


    List<UsuarioInfo> listaUsuario=new ArrayList<UsuarioInfo>();
    //******************************
    private int []score=new int[4];
    private int sumaScore;
    private String nombre;
    //******************************
    private String temporalName;
    private int temporalScore;
    boolean ingres;

    Menu menu;
    Regresar regresar=new Regresar();
    public Record(int []score, String name,boolean ingres)
    { 
        super(600, 400, 1); 
        this.score=score;
        this.nombre=name;
        this.ingres=ingres;
        sumaScore=sumaScore();
        
        
        ingresaEnElArchivo();
        leerTxt();
        ordenaLista();
                
        
        if(this.score==null)
        {
            score=new int[4];
        }
       

        showText("RECORDS ",getWidth()/2, getHeight()/2-150);
        showText("Nombre: "+listaUsuario.get(0).getNameUsuario()+" Segundos: "+listaUsuario.get(0).getScore(), getWidth()/2, getHeight()/2-100);
        showText("Nombre: "+listaUsuario.get(1).getNameUsuario()+" Segundos: "+listaUsuario.get(1).getScore(), getWidth()/2, getHeight()/2-50);
        showText("Nombre: "+listaUsuario.get(2).getNameUsuario()+" Segundos: "+listaUsuario.get(2).getScore(), getWidth()/2, getHeight()/2);
        showText("Nombre: "+listaUsuario.get(3).getNameUsuario()+" Segundos: "+listaUsuario.get(3).getScore(), getWidth()/2, getHeight()/2+50);
        showText("Nombre: "+listaUsuario.get(4).getNameUsuario()+" Segundos: "+listaUsuario.get(4).getScore(), getWidth()/2, getHeight()/2+100);
       

        addObject(regresar,getWidth()/2, getHeight()/2+150);

    }
    public void act()
    {

        termina();
    }

    
    private void muestraNombre()
    {
        if(nombre!=null)
        {
            showText("Bienvenido "+nombre, getWidth()/2, getHeight()/2-100);
        }
    }

    public void setMenu(Menu menu)
    {
        this.menu=menu;
    }

    public void termina()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(regresar))
        {
            Greenfoot.setWorld(menu);
        }
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void leerTxt()
    {
        int numeroEntero, sumaInt = 0;
        int cont=0;
        double numeroDouble, sumaDouble = 0;

        File f = new File("records.txt");

        try  (Scanner entrada = new Scanner(f)) {


            while (entrada.hasNextLine()) { 
                String line = entrada.next();

                String []info = line.split(",");
                temporalName=info[0];
                temporalScore=Integer.valueOf(info[1]);

                UsuarioInfo usuario=new UsuarioInfo(temporalName,temporalScore);
                listaUsuario.add(usuario);



            }

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {

        }

    }
    private void verifica()
    {
        System.out.println(listaUsuario.get(0).getNameUsuario()+" "+listaUsuario.get(0).getScore());
        
    }

    private void ordenaLista()
    {
        Collections.sort(listaUsuario);

    }
    private int sumaScore()
    {
        int cont=0;
        int suma=0;
        for(cont=0;cont<3;cont++)
        {
            if(score==null)
            {
                return 0;
            }
            suma=score[cont]+suma;
        }
        
        return suma;
        
    }

    private void ingresaEnElArchivo()
    {
        //System.out.println(nombre);
        if(nombre!=null&&ingres==true)
        {
            File archivo = new File("records.txt");
            FileWriter escribir;
            PrintWriter linea;
            try{
                
                escribir=new FileWriter(archivo,true);
                linea=new PrintWriter(escribir);
                linea.println(nombre+","+sumaScore);
                linea.close();

            }catch(Exception e)
            {
                System.out.println("No se pudo");
            }

            
        }
        
    }
    
    
}
