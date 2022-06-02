import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    GreenfootImage image;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //El nombre de la imagen se consigue para asignarla
    public HealthBar(String fileName){
        image = new GreenfootImage(fileName);
    }
    //Se mueve junto con el escenario
    public void act()
    {
        setImage(image);
        move(0,-3);
    }
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }
    public void clearImage(){
        World w = getWorld();
        w.removeObject(this);
    }
    public void delete(){
        getWorld().removeObject(this);
    }
}
