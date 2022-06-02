import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
