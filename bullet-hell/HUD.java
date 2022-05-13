import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
* Write a description of class HUD here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class HUD extends Actor
{
    /**
    * Act - do whatever the HUD wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    GreenfootImage imagen;
    int cont;
    int contP;
    String mensaje;
    public void setLocation(int x, int y) {}
    public HUD(int c,String msj)
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
    public void dibuja()
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
    public void incrementar()
    {
        cont++;
        dibuja();
    }
    public void decrementar()
    {
        cont--;
        dibuja();
    }
    public int valor()
    {
        return cont;
    }
    public void incPoints(){
        contP+=10;
        dibuja1();
    }
    public int Points(){
        return contP;
    }
}
