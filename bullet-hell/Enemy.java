import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;


/**
* Write a description of class Enemy here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Enemy extends Entity
{
    /**
    * Act - do whatever the Enemy wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    private char direction; //L, R, D, U.
    private int speed;
    private int x;
    private int y;
    private int health;
    private GreenfootImage staticSprite;
    private GifImage animatedSprite;
    public Enemy(char direction, int speed, String sprite, String spriteType)
    {
        super(sprite, spriteType);
        this.direction = direction;
        this.speed = speed;
        this.health = 100;
    }
    public Enemy(char direction, int speed, String sprite, String spriteType, int health){
        super(sprite, spriteType);
        this.direction = direction;
        this.speed = speed;
        this.health = health;
    }
    public void act()
    {
        movement();
        checkCollisions();
        super.applySprite();
    }
    public void movement()
    {
        move(0,-3);
        switch(this.direction)
        {
            case 'L':
                move(-speed,0);
                break;
            case 'R':
                move(speed,0);
                break;
            case 'U':
                move(0,-speed);
                break;
            case 'D':
                move(0,speed);
                break;
        }
    }

    public void setDirection(char direction)
    {
        this.direction = direction;
    }

    public void setSpeed(char speed)
    {
        this.speed = speed;
    }
    public void checkRemove()
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 50 || getX() > w.getWidth() + 50 ||
                getX() < (-50) || getY() < (-50) )
        {
            w.removeObject(this);
        }
    }

    public void checkCollisions()
    {
        World w = getWorld();
        MyWorld w1=(MyWorld)getWorld();
        Actor p=getOneIntersectingObject(Projectile.class);
        //Actor proyectile = getOneIntersectingObject(Projectile.class);
        if(p!=null && ((Projectile) p).getProjectileType() == 0){
            List<Projectile> list_e_ = getTouchedObjects(Projectile.class);
            for(Projectile e_ : list_e_){ 
                w1.puntos.incPoints();
                //se decrementa la vida cada vez que intersecta con un proyectil
                this.health -= 5;
                if(this.health <= 0){ //si se acaba la vida, se quita
                    e_.getWorld().removeObject(this);
                }
            }
        }else if(getY() > w.getHeight() + 50 || getX() > w.getWidth() + 50 ||
                getX() < (-50) || getY() < (-50) )
        {
            w.removeObject(this);
        }
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
}
