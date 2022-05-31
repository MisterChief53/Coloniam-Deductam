import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


/**
* Write a description of class MyWorld here.
*
* @author (your name)
* @version (a version number or a date)
*/



public class MyWorld extends World
{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    private Scroller scroller;
    private int cont=0;
    HUD vidas;
    HUD puntos;
    HUD bombas;
    World toWorld = null; // holds world to return to
    //GreenfootImage image = null; // holds the single panel image for the wallpaper
    static boolean infoShown = false; // flag indicating whether info was shown or not
    private int counter = 0;
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Enemy enemy5;
    private Enemy enemy6;
    private Enemy enemy7;
    private Boss boss1;
    private Spawner enemy1Gun1;
    private Spawner enemy2Gun1;
    private Spawner enemy2Gun2;
    private Spawner enemy3Gun1;
    private Spawner enemy3Gun2;
    private Spawner enemy4Gun1;
    private Spawner enemy4Gun2;
    private Spawner enemy5Gun1;
    private Spawner enemy5Gun2;
    private Spawner enemy5Gun3;
    private Spawner enemy5Gun4;
    private Spawner enemy6Gun1;
    private Spawner enemy6Gun2;
    private Spawner enemy6Gun3;
    private Spawner enemy6Gun4;
    private Spawner enemy7Gun1;
    private Spawner enemy7Gun2;
    private Spawner enemy7Gun3;
    private Spawner enemy7Gun4;
    private Spawner boss1Gun1;
    private int speed;
    private Dialogue[] dialogueArray = new Dialogue[14];
    GreenfootImage background1, background2, background3;
    /**
    * Constructor for objects of class MyWorld.
    *
    */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1,false);
        World world=this;
        this.background1 = new GreenfootImage("background1.jpeg");
        this.background2 = new GreenfootImage("background2.jpeg");
        this.background3 = new GreenfootImage("background3.jpeg");
        scroller=new Scroller(this,background1);
       
        //World world=new ScrollingWorld();
        
        for(int i = 0; i < 1; i++){
            dialogueArray[i] = new Dialogue("dialogue" + (i+1) + ".png");
        }
        
        show(0,3,5);      
        Player p = new Player("Player.rotated.gif", "gif");
        Spawner playerGun1 = new Spawner(5, 5, 5, 0, 50, 50, 15, 270, 0);
        //Spawner playerGun2 = new Spawner(5, 0, 5, 0, 50, 50, 15, 270, 0);
        Spawner playerGun3 = new Spawner(5, -5, 5, 0, 50, 50, 15, 270, 0);
        
        this.enemy1 = new Enemy('D',5, "Enemy5.png", "png");
        this.enemy1Gun1 = new Spawner(5, 0, -5, 1, 100, 50, 5, 90, 1);
        
        this.enemy2 = new Enemy('L', 3, "Enemy5.png", "png");
        this.enemy2Gun1 = new Spawner(4, 0, -5, 1, 450, 50, 9, 90, 1);
        this.enemy2Gun2 = new Spawner(4, 5, 0, 1, 450, 50, 9, 91, 1);
        
        this.enemy3 = new Enemy('L', 3, "Enemy2.gif", "gif");
        this.enemy3Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 91, 1);
        this.enemy3Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 90, 1);
        
        this.enemy4 = new Enemy('L', 3, "Enemy5.png", "png");
        this.enemy4Gun1 = new Spawner(4, 0, -5, 1, 550, 50, 9, 180, 1);
        this.enemy4Gun2 = new Spawner(4, 5, 0, 1, 550, 50, 9, 45, 1);
        
        this.enemy5 = new Enemy('D', 1, "Enemy5.png", "png");
        this.enemy5Gun1 = new Spawner(3, 0, -5, 1, 300, 50, 9, 180, 1);
        this.enemy5Gun2 = new Spawner(3, 5, 0, 1, 300, 50, 9, 0, 1);
        this.enemy5Gun3 = new Spawner(3, 0, 5, 1, 300, 50, 9, 360, 1);
        this.enemy5Gun4 = new Spawner(3, -5, 0, 1, 300, 50, 9, 260, 1);
        
        this.enemy6 = new Enemy('U', 1, "Enemy1.gif", "gif");
        this.enemy6Gun1 = new Spawner(3, 0, -5, 1, 100, MyWorld.HEIGHT - 50, 9, 180, 1);
        this.enemy6Gun2 = new Spawner(3, 5, 0, 1, 100, MyWorld.HEIGHT - 50, 9, 0, 1);
        this.enemy6Gun3 = new Spawner(3, 0, 5, 1, 100, MyWorld.HEIGHT - 50, 9, 360, 1);
        this.enemy6Gun4 = new Spawner(3, -5, 0, 1, 100, MyWorld.HEIGHT - 50, 9, 260, 1);
        
        this.enemy7 = new Enemy('U', 1, "Enemy1.gif", "gif");
        this.enemy7Gun1 = new Spawner(3, 0, -5, 1, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50, 9, 180, 1);
        this.enemy7Gun2 = new Spawner(3, 5, 0, 1, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50, 9, 0, 1);
        this.enemy7Gun3 = new Spawner(3, 0, 5, 1, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50, 9, 360, 1);
        this.enemy7Gun4 = new Spawner(3, -5, 0, 1, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50, 9, 260, 1);
        
        this.boss1 = new Boss('D', 5, "Enemy1.gif", "gif");
        this.boss1Gun1 = new Spawner(5, 0, -5, 1, 100, 50, 5, 90, 1);
    
        world.addObject(p, 50, 50);
        world.addObject(playerGun1, 50, 50);
        //world.addObject(playerGun2, 50, 50);
        world.addObject(playerGun3, 50, 50);
    }
    public void show(int p, int v, int b){
        puntos=new HUD(p,"Puntaje");
        vidas=new HUD(v,"Vidas");
        bombas = new HUD(b, "Bombas");
        addObject(puntos,100,85);
        addObject(vidas,300,85);
        addObject(bombas, 450, 85);
    }
    public void scroll()
    {
        this.speed=3;
        scroller.scroll(0,-speed);
    }

    public void act()
    {
        if (!infoShown){
            infoShown = true; // flag info for this world as shown
            Greenfoot.setWorld(new Instructions(1, this)); // change to info world
        }
        scroll();
        this.counter++;
        if(counter == 1){
            this.addObject(dialogueArray[0], 300, this.HEIGHT - 97);
        }
        if(counter == 300){
            this.scroller.setScrollImage(background2);
            this.removeObject(dialogueArray[0]);
            this.addObject(this.enemy1, 100, 50);
            //this.addObject(new HealthBar("health1.png"), 100, 500);
            this.addObject(enemy1Gun1, 100,50);
        }

        if(counter == 310 && enemy1.getWorld() != null){
            this.enemy1.setDirection('R');
        }
        if(counter >= 300 && counter <= 330 && enemy1.getWorld() != null){
            this.enemy1Gun1.shoot();
        }
        if(counter == 325){
            this.addObject(this.enemy2, 450, 50);
            this.addObject(this.enemy2Gun2, 450, 50);
            this.addObject(this.enemy2Gun1, 450, 50);
            
            this.addObject(this.enemy3, 500, 50);
            this.addObject(this.enemy3Gun2, 500, 50);
            this.addObject(this.enemy3Gun1, 500, 50);
            
            this.addObject(this.enemy4, 550, 50);
            this.addObject(this.enemy4Gun2, 550, 50);
            this.addObject(this.enemy4Gun1, 550, 50);
        }
        if(counter == 326 && enemy2Gun2.getWorld() == null){
            this.addObject(this.enemy2Gun2, 300, 50);
        }
        if(counter >= 340 && counter <= 360 && enemy1.getWorld() != null){
            this.enemy1Gun1.shoot();
        }
        if(counter >= 340 && counter <= 390 && enemy2.getWorld() != null){
            this.enemy2Gun1.shoot();
            this.enemy2Gun2.shoot();
            this.enemy3Gun1.shoot();
            this.enemy3Gun2.shoot();
            this.enemy4Gun1.shoot();
            this.enemy4Gun2.shoot();
        }
        if(counter == 500){
            this.addObject(this.enemy5, 300, 50);
            this.addObject(this.enemy5Gun1, 300, 50);
            this.addObject(this.enemy5Gun2, 300, 50);
            this.addObject(this.enemy5Gun3, 300, 50);
            this.addObject(this.enemy5Gun4, 300, 50);
            
            this.addObject(this.enemy6, 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy6Gun1, 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy6Gun2, 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy6Gun3, 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy6Gun4, 100, MyWorld.HEIGHT - 50);
            
            this.addObject(this.enemy7, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy7Gun1, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy7Gun2, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy7Gun3, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50);
            this.addObject(this.enemy7Gun4, MyWorld.WIDTH - 100, MyWorld.HEIGHT - 50);
        }
        if(counter >= 505 && counter <= 650 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 670 && counter <= 700 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 720 && counter <= 900 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 505 && counter <= 900 && enemy6.getWorld() != null){
            this.enemy6Gun1.shoot();
            this.enemy6Gun2.shoot();
            this.enemy6Gun3.shoot();
            this.enemy6Gun4.shoot();
        }
        if(counter >= 505 && counter <= 900 && enemy7.getWorld() != null){
            this.enemy7Gun1.shoot();
            this.enemy7Gun2.shoot();
            this.enemy7Gun3.shoot();
            this.enemy7Gun4.shoot();
        }
        if(counter == 1100){
            this.boss1 = new Boss('D', 0, "Enemy5.png", "png");
            this.boss1Gun1 = new Spawner(5, 0, -5, 1, 100, 50, 5, 90, 1);
            this.addObject(this.boss1, 100, 50);
            this.addObject(this.boss1Gun1, 100,50);
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
}