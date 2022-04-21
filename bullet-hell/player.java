
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
    Spawner[] spawners = new Spawner[2];
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player(){
        speed=5;
    }
    public int getSpeed(){
        return speed;
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
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
      
            move(-speed,0);
           // move(-1);
        }
         if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
           
             move(speed,0);
           // move(1);
        }
         if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
      
             move(0,-speed);
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
          
            move(0,speed);
        }
        if(Greenfoot.isKeyDown("shift")){
          speed=1;  
        }else{
            speed=5;
        }
        while((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& isAtEdge() ){
            setLocation(x+550,y);
        }
        while((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& isAtEdge()){
            setLocation(50,y);
        }
        while((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&& isAtEdge()){
            setLocation(x,50);
        }
        while((Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w"))&& isAtEdge()){
            setLocation(x,y+500);
        }
    }
    
    /*
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }*/
}