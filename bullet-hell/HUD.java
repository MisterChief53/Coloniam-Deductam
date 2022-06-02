import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
* Clase HUD controla los encabezados que se ven siempre en pantalla
* @author Valeria,Diego y Angel
* @version Final
*/
public class HUD extends Actor
{
    /**
    * Act - do whatever the HUD wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    GreenfootImage imagen;//atributo usado para poner texto en pantalla
    int cont;
    int contP;
    String mensaje;
    public void setLocation(int x, int y) {}
    public HUD(int c,String msj)//el metodo prepara todo para mostrar el mensaje(tipo de letra, tamaño y color) 
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        Color co=new Color(0,255,255);
        Font f=new Font("Verdana",false,false,22);
        imagen.setColor(co);
        imagen.setFont(f);
        dibuja();
    }
    public void dibuja()//el metodo dibuja en la pantalla en diferentes locaciones
    {
        // Add your action code here.
        imagen.clear();
        imagen.drawString(" "+mensaje +": " +cont,20,20);
        setImage(imagen);
    }
    public void dibuja1()
    {
        // Add your action code here.
        imagen.clear();
        imagen.drawString(" "+mensaje +": " +contP,20,20);
        setImage(imagen);
    }
    public void incrementar()//incrementa de 1 en 1 el valor mostrado en pantalla 
    {
        cont++;
        dibuja();
    }
    public void decrementar()//decrementa de 1 en 1 el valor mostrado en pantalla ejemplo vidass
    {
        cont--;
        dibuja();
    }
    public int valor()//regresa el valor actual de los "atributos" como vidas
    {
        return cont;
    }
    public void incPoints(){//incrementa de 10 en 10 los puntos
        contP+=10;
        dibuja1();
    }
    public int Points(){//da el valor actual de los puntos
        return contP;
    }
    public void setCont(int cont){
        this.cont = cont;
        dibuja();
    }
    public int getCont(){
        return this.cont;
    }
}