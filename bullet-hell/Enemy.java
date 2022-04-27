import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



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
    public Enemy(char direction, int speed)
    {
        this.direction = direction;
        this.speed = speed;
    }
    public void act()
    {
        movement();
        checkCollisions();
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
        Actor proyectile = getOneIntersectingObject(Projectile.class);
        if(proyectile != null && ((Projectile) proyectile).getProjectileType() == 0)
        {
            World w = getWorld();
            w.removeObject(this);
            w.removeObject(proyectile);
        }
        else
        {
            checkRemove();
        }
    }
}
