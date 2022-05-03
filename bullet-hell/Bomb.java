import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
     private int x,dir,dir2;
    private double direction;
    private int speed;
     private int cont=0;
    private int timer = 25;
GifImage gif = new GifImage("Explosion-unscreen.gif");


    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb(double direction, int speed){
          int scalePercent = 50;
    for (GreenfootImage image : gif.getImages())
    {
        int wide = image.getWidth()*scalePercent/400;
        int high = image.getHeight()*scalePercent/400;
        image.scale(wide, high);
    }
         this.direction = direction;
        this.speed = speed;
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
           timer--;
           
    if (timer <= 10) {
      setImage(gif.getCurrentImage());
     // timer--;
    }
    if(timer<=0){
      getWorld().removeObjects(getWorld().getObjects(Projectile.class));
           getWorld().removeObject(this);   
    }
        // Add your action code here.
    }
     public int sampleMethod(int y)
    {
        return x + y;
    }

}
