import greenfoot.*;
/**
* Write a description of class Proyectile here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Projectile extends Actor
{
    // instance variables - replace the example below with your own
    private int x,dir,dir2;
    private double direction;
    private int speed;
    private int projectileType; // 0 for player, 1 for enemy



    /* public Proyectile(){
    speed=6;
    dir2=90;
    setRotation(dir2);
    }
    public Proyectile(int dir){
    speed=6;
    dir2=dir;
    setRotation(dir2);
    }*/
    /**
    * Constructor for objects of class Proyectile


    */
    public Projectile(double direction, int speed, int proyectileType)
    {
        this.direction = direction;
        this.speed = speed;
        this.projectileType = proyectileType;
    }
    public void movement()
    {
        if(this.direction == 0){
            move(this.speed, 0);
        }else if(this.direction > 0 && this.direction < 90){
            move(this.speed, this.speed);
        }else if(this.direction == 90){
            move(0, this.speed);
        }else if(this.direction > 90 && this.direction < 180){
            move(-this.speed, this.speed);
        }else if(this.direction == 180){
            move(-this.speed, 0);
        }else if(this.direction > 180 && this.direction < 270){
            move(-this.speed, -this.speed);
        }else if(this.direction == 270){
            move(0, -this.speed);
        }else{
            move(this.speed, -this.speed);
        }
    }

    public void move(int x,int y)
    {
        setLocation(getX()+x,getY()+y);
    }

    public void act()
    {
        movement();
    // move(speed);
        //checkCollisions();
    }
    /**
    * An example of a method - replace this comment with your own
    *
    * @param y a sample parameter for a method
    * @return the sum of x and y
    */
    public int sampleMethod(int y)
    {
        return x + y;
    }

    public void checkRemove()
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 30 || getX() > w.getWidth() + 30 || getX() < (-30) || 
            getY() < (-30) )
        {
            w.removeObject(this);
        }
    }
    //If we use this, the proyectiles are prematurely removed, so I use a method from
    //Enemy class
    /*
    public void checkCollisions()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null && this.proyectileType == 0)
        {
            World w = getWorld();
            //w.removeObject(enemy);
            w.removeObject(this);
        }
        else
        {
            checkRemove();
        }
    }
    */
    
    public int getProjectileType(){
        return this.projectileType;
    }

}