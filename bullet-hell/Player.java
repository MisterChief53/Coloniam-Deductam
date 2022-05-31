
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
    private double direction;
    private int speed;
    int cont=0;
    private int timer=15;
    boolean x;
    int c=0;
    // int speed;
    private int numSpawners = 3;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(String sprite, String spriteType){
        super(sprite, spriteType);
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
        World world = getWorld();
        if(Greenfoot.mouseClicked(null) && c<5){
            world.addObject(new Bomb(270, 6), getX()+1, getY()+2);
            c++;
        }
        movement();  
        checkCollisions();
        super.applySprite();
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
    public void Guts(boolean x,int r){ //metodo a revisar 
        MyWorld w=(MyWorld)getWorld();
        if(r==0 && x==true && timer<=0){
             w.vidas.decrementar();
             timer=280;
        }
    }
    public void checkCollisions()
    {
        MyWorld w=(MyWorld)getWorld();
        Actor proyectile = getOneIntersectingObject(Projectile.class);
        if(proyectile != null && ((Projectile) proyectile).getProjectileType() == 1)
        {
            List<Projectile> list_e_=getTouchedObjects(Projectile.class);
            timer--;
            for(Projectile e_:list_e_){
                e_.getWorld().removeObject(proyectile);
                if(timer<=0){
                    w.vidas.decrementar();
                    timer=15;
                }     
            }
             if(w.vidas.valor()<=0){
                 Greenfoot.setWorld(new Instructions(0, w));
            }
        } 
    }
}