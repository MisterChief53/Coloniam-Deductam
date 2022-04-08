import greenfoot.*;
/**
 * Write a description of class Proyectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectile extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private double direction;
    private int speed;

    /**
     * Constructor for objects of class Proyectile
     */
    public Proyectile(double direction, int speed)
    {
        this.direction = direction;
        this.speed = speed;
    }
    
    public void movement(){
        if(this.direction < 90){
            move(this.speed, 0);
        }else if(this.direction > 90 && this.direction <= 180){
            move(0, this.speed);
        }else if(this.direction > 180 && this.direction <= 270){
            move(-this.speed, 0);
        }else{
            move(0, -this.speed);
        }
    }
    
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }
    
    public void act(){
        movement();
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
