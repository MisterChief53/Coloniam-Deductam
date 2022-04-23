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
    // int cont=0;
    // while(cont<50){
    // attack();
    // cont++;
    //}

        movement();
        checkCollisions();
    // checkRemove();
    }
    public void movement()
    {
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
    //public void attack(){
    // Proyectile p=new Proyectile();
    // getWorld().addObject(p,getX(),getY());
    // }
    public void checkRemove()
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 200 || getX() > w.getWidth() + 200 ||
                getX() < (-200) || getY() < (-200) )
        {
            w.removeObject(this);
        }
    }

    public void checkCollisions()
    {
        Actor proyectile = getOneIntersectingObject(Proyectile.class);
        if(proyectile != null)
        {
            World w = getWorld();
            w.removeObject(this);
    //setLocation(35,35);
    // checkRemove();
        }
        else
        {
            checkRemove();
        }
    }
}
