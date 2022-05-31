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
    private GreenfootImage debugSprite;
    private GreenfootSound sound;
    /**
    * Constructor for objects of class Spawner
    */
    public Spawner(int spawnRate, int xOffset, int yOffset, int anchorType, int entityX,
                   int entityY, int speed, double direction, int spawnerType){
        this.spawnRate = spawnRate;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.entityX = entityX;
        this.entityY = entityY;
        this.anchorType = anchorType;
        this.speed = speed;
        this.direction = direction;
        this.spawnerType = spawnerType;
        this.debugSprite = new GreenfootImage("red-draught-king.png");
        this.sound = new GreenfootSound("gunshot.mp3");
        this.sound.setVolume(10);
    }

    public void spawn(double direction, int speed)
    {
        World world = getWorld();
        if(this.spawnerType == 0){
            world.addObject(new Projectile(direction, speed, 0), getX()+1, getY()+2);
        }else{
            world.addObject(new Projectile(direction, speed, 1), getX()+1, getY()+2);
        }
        //this.sound.play();
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
                if(Greenfoot.getRandomNumber(10)%2==0){
                    //this.sound.play();
                }
                //this.sound.play();
            }
            /*
            if(!this.sound.isPlaying()){
                this.sound.play();
            }*/
        }
        //setImage(debugSprite);
    }

    public void shoot(){
        this.counter++;
        if (this.counter > this.spawnRate){
            spawn(this.direction, this.speed);
            counter = 0;
            if(Greenfoot.getRandomNumber(10)%2==0){
                this.sound.play();
            }
        }
        /*
        if(!this.sound.isPlaying()){
            this.sound.play();
        }
        */
    }

    /**
    * An example of a method - replace this comment with your own
    *
    * @param y a sample parameter for a method
    * @return the sum of x and y
    */

    public int sampleMethod(int y){
        return x + y;
    }

    public void anchor()
    {   
        if(this.anchorType == 0 && getOneObjectAtOffset(this.xOffset, this.yOffset,Player.class) != null){
            entityX = ((Player) getWorld().getObjects(Player.class).get(0)).getX();
            entityY = ((Player) getWorld().getObjects(Player.class).get(0)).getY();
            setLocation(entityX - this.xOffset, entityY - this.yOffset);
        }
        else if(this.anchorType == 1 && getOneObjectAtOffset(this.xOffset, this.yOffset,
            Enemy.class) != null){
            entityX = ((Enemy) getWorld().getObjectsAt(entityX, entityY, Enemy.class).get(0)).getX();
            entityY = ((Enemy) getWorld().getObjectsAt(entityX, entityY,Enemy.class).get(0)).getY();
            setLocation(entityX - this.xOffset, entityY - this.yOffset);
        }else{
            getWorld().removeObject(this);
        }
    }
    /*
    public int checkEntity()
    {
        Actor proyectile = getOneIntersectingObject(Proyectile.class);
        if(proyectile != null){
            return 1;
        }
        return 0;
    }
    */
    public void checkRemove()
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 100 || getX() > w.getWidth() + 100
                || getX() < (-100) || getY() < (-100) ){
            //this.sound.stop();
            w.removeObject(this);
        }
    }
}