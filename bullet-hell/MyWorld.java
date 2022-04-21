import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    private Enemy enemy1;
    private int counter = 0;
    private Spawner enemy1Gun1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        World world = this;
        player p = new player();
        Spawner playerGun1 = new Spawner(5, 20, 20, 0, 50, 50, 15, 360, 0);
        Spawner playerGun2 = new Spawner(5, 0, 30, 0, 50, 50, 15, 360, 0);
        Spawner playerGun3 = new Spawner(5, -20, 20, 0, 50, 50, 15, 360, 0);
        
        this.enemy1 = new Enemy('D',5);
        
        world.addObject(p, 50, 50);
        world.addObject(playerGun1, 50, 50);
        world.addObject(playerGun2, 50, 50);
        world.addObject(playerGun3, 50, 50);
        
    }
    public void act(){
        this.counter++;
        if(counter == 100){
            this.enemy1Gun1 = new Spawner(5, 0, -20, 1, 100, 50, 5, 180, 1);
            this.addObject(this.enemy1, 100, 50);
            this.addObject(enemy1Gun1, 100,50);
        }
        
        if(counter == 110){
            this.enemy1.setDirection('R');
        }
        if(counter >= 100 && counter <= 130){
            this.enemy1Gun1.shoot();
        }
        if(counter >= 140 && counter <= 160){
            this.enemy1Gun1.shoot();
        }
    }
}
