import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        World world = this;
        player p = new player();
        Spawner playerGun1 = new Spawner(5, 20, 20, 0, 50, 50, 7, 360);
        Spawner playerGun2 = new Spawner(5, 0, 30, 0, 50, 50, 7, 360);
        Spawner playerGun3 = new Spawner(5, -20, 20, 0, 50, 50, 7, 360);
        
        world.addObject(p, 50, 50);
        world.addObject(playerGun1, 50, 50);
        world.addObject(playerGun2, 50, 50);
        world.addObject(playerGun3, 50, 50);
        
        /*
        world.addObject(new player(), 50, 50);
        world.addObject(new Spawner(5, 20, 20, 0, 50, 50, 7, 360), 50, 50);
        world.addObject(new Spawner(5, 0, 30, 0, 50, 50, 7, 360), 50, 50);
        world.addObject(new Spawner(5, -20, 20, 0, 50, 50, 7, 360), 50, 50);
        */
    }
}
