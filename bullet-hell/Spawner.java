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

    /**
     * Constructor for objects of class Spawner
     */
    public Spawner(int spawnRate)
    {
        this.spawnRate = spawnRate;
    }
    
    public void spawn(double direction, int speed){
        Proyectile p = new Proyectile(direction, speed);
    }
    
    public void act(){
        spawn(this.direction, this.speed);
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
}
