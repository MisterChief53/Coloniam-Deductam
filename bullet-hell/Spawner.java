import greenfoot.*;
/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private int spawnRate;
    private double direction;
    private int speed;
    private int counter = 0;
    private int yOffset;
    private int xOffset;
    private int entityX;
    private int entityY;
    private int anchorType; //0 for player, 1 for enemy
    private int spawnerType; // 0 for player, 1 for enemy

    /**
     * Constructor for objects of class Spawner
     */
    public Spawner(int spawnRate, int xOffset, int yOffset, int anchorType, int entityX,
        int entityY, int speed, double direction, int spawnerType)
    {
        this.spawnRate = spawnRate;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.entityX = entityX;
        this.entityY = entityY;
        this.anchorType = anchorType;
        this.speed = speed;
        this.direction = direction;
        this.spawnerType = spawnerType;
    }
    
    public void spawn(double direction, int speed){
        World world = getWorld();
        if(this.spawnerType == 0){
            world.addObject(new Proyectile(direction, speed, 0), getX()+1, getY()+2);
        }else{
            world.addObject(new Proyectile(direction, speed, 1), getX()+1, getY()+2);
        }
    }
    
    public void act(){
        checkRemove();
        anchor();
        if(Greenfoot.isKeyDown("space") && this.anchorType == 0){
            this.counter++;
            if (this.counter > this.spawnRate)
            {
                spawn(this.direction, this.speed);
                counter = 0;
            }
        }
    }
    
    public void shoot(){
        this.counter++;
        if (this.counter > this.spawnRate)
        {
            spawn(this.direction, this.speed);
            counter = 0;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        return x + y;
    }
    
    public void anchor(){
        if(this.anchorType == 0){
            entityX = ((player) getWorld().getObjects(player.class).get(0)).getX();
            entityY = ((player) getWorld().getObjects(player.class).get(0)).getY();
            setLocation(entityX - this.xOffset, entityY - this.yOffset);
        }else if(this.anchorType == 1){
            entityX = ((Enemy) getWorld().getObjectsAt(entityX, entityY, Enemy.class).get(0)).getX();
            entityY = ((Enemy) getWorld().getObjectsAt(entityX, entityY, Enemy.class).get(0)).getY();
            setLocation(entityX - this.xOffset, entityY - this.yOffset);
        }
    }
    
    public void checkRemove(){
        World w = getWorld();
        if(getY() > w.getHeight() + 30 || getX() > w.getWidth() + 30 
            || getX() < (-30) || getY() < (-30) ){
            w.removeObject(this);
        }
    }
    
}
