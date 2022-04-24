
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Entity
{
    int cont=0;
    int speed;
    private int numSpawners = 2;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player(){
        this.speed=5;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void act()
    {
        if(cont<1){
            turn(-90);
            cont++;
        }
        movement();
    }
    
    public void movement(){
        int x=getX();
        int y=getY();
        move(0,-3);
        if(Greenfoot.isKeyDown("left") && x > 0 || Greenfoot.isKeyDown("a") && x > 0){
            move(-speed,0);
            // move(-1);
        }
         if(Greenfoot.isKeyDown("right") && x < MyWorld.WIDTH || Greenfoot.isKeyDown("d") &&
             x < MyWorld.WIDTH){
            move(speed,0);
            // move(1);
        }
         if(Greenfoot.isKeyDown("up") && y > 40 || Greenfoot.isKeyDown("w") && y > 40){
            move(0,-speed);
        }
        if(Greenfoot.isKeyDown("down") && y < MyWorld.HEIGHT || Greenfoot.isKeyDown("s") && 
        y < MyWorld.HEIGHT){
            move(0,speed+2);
        }
        if(Greenfoot.isKeyDown("shift")){
            speed=1;  
        }else{
            speed=5;
        }
    }
}