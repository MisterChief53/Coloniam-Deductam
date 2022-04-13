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
    private int anchorType;

    /**
     * Constructor for objects of class Spawner
     */
    public Spawner(int spawnRate, int xOffset, int yOffset, int anchorType, int entityX,
        int entityY, int speed, double direction)
    {
        this.spawnRate = spawnRate;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.entityX = entityX;
        this.entityY = entityY;
        this.anchorType = anchorType;
        this.speed = speed;
        this.direction = direction;
    }
    
    public void spawn(double direction, int speed){
        World world = getWorld();
        world.addObject(new Proyectile(direction, speed), getX()+1, getY()+2);
    }
    
    public void act(){
        //move();
        anchor();
        if(Greenfoot.isKeyDown("space") && anchorType == 0){
            this.counter++;
            if (this.counter > this.spawnRate /*Greenfoot.getRandomNumber(1000) < 100*/)
            {
                spawn(this.direction, this.speed);
                counter = 0;
                // do something
            }
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
        // put your code here
        return x + y;
    }
    
    public void anchor(){
        int anchorX;
        int anchorY;
        
        if(this.anchorType == 0){
            anchorX = ((player) getWorld().getObjects(player.class).get(0)).getX();
            anchorY = ((player) getWorld().getObjects(player.class).get(0)).getY();
            setLocation(anchorX - this.xOffset, anchorY - this.yOffset);
        }/*else if(entity instanceof Enemy){
            anchorX = ((Enemy) getWorld().getObjetsAt(entityX, entityY, Enemy.class).get(0)).getX();
            anchorY = ((Enemy) getWorld().getObjetsAt(entityX, entityY, Enemy.class).get(0)).getY();
        }*/
    }
}
