import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Clase Dialogue es la que controlara la historia que se comparte
* @author Valeria,Diego y Angel
* @version Final
*/
public class Dialogue extends Actor
{
    private GreenfootImage dialogueImage;
    /**
     * Act - do whatever the Dialogue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Imagen del dialogo
    public Dialogue(String fileName){
        this.dialogueImage = new GreenfootImage(fileName);
    }
    public void act()
    {
        setImage(this.dialogueImage);
        move(0,-3);
    }
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }
}
