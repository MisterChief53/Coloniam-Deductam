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
    private double direction = 360;
    private int speed = 3;
    private int counter = 0;
    private int yOffset;
    private int xOffset;

    /**
     * Constructor for objects of class Spawner
     */
    public Spawner(int spawnRate, int xOffset, int yOffset)
    {
        this.spawnRate = spawnRate;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
    
    public void spawn(double direction, int speed){
        World world = getWorld();
        world.addObject(new Proyectile(direction, speed), getX()+1, getY()+2);
    }
    
    public void act(){
        move();
        if(Greenfoot.isKeyDown("space")){
            if (Greenfoot.getRandomNumber(1000) < 100)
            {
                spawn(this.direction, this.speed);
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
    
    public void move(){
        int playerX = ((player) getWorld().getObjects(player.class).get(0)).getX();
        int playerY = ((player) getWorld().getObjects(player.class).get(0)).getY();
        setLocation(playerX - this.xOffset, playerY - this.yOffset);
    }
}
