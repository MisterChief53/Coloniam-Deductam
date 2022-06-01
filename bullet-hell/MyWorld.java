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
    private int counter = 3800;
    private int boss1Counter = 0;
    
    private Player player;
    //level 1 ******************************
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Enemy enemy5;
    private Enemy enemy6;
    private Enemy enemy7;
    private Enemy enemy8;
    private Enemy enemy9;
    private Enemy enemy10;
    private Enemy enemy11;
    private Enemy enemy12;
    private Enemy enemy13;
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
    private Spawner enemy8Gun1;
    private Spawner enemy8Gun2;
    private Spawner enemy8Gun3;
    private Spawner enemy9Gun1;
    private Spawner enemy9Gun2;
    private Spawner enemy9Gun3;
    private Spawner enemy10Gun1;
    private Spawner enemy10Gun2;
    private Spawner enemy10Gun3;
    private Spawner enemy11Gun1;
    private Spawner enemy11Gun2;
    private Spawner enemy11Gun3;
    private Spawner enemy12Gun1;
    private Spawner enemy12Gun2;
    private Spawner enemy12Gun3;
    private Spawner enemy13Gun1;
    private Spawner enemy13Gun2;
    private Spawner enemy13Gun3;
    private Spawner boss1Gun1;
    private Spawner boss1Gun2;
    private Spawner boss1Gun3;
    private Spawner boss1Gun4;
    private Spawner boss1Gun5;
    //************************************************
    //level 2 ******************************
    private Enemy enemy14;
    private Enemy enemy15;
    private Enemy enemy16;
    private Enemy enemy17;
    private Enemy enemy18;
    private Enemy enemy19;
    private Enemy enemy20;
    private Enemy enemy21;
    private Enemy enemy22;
    private Enemy enemy23;
    private Enemy enemy24;
    private Enemy enemy25;
    private Enemy enemy26;
    private Enemy enemy27;
    private Enemy enemy28;
    private Enemy enemy29;
    private Enemy enemy30;
    private Boss boss2;
    private Spawner enemy14Gun1;
    private Spawner enemy14Gun2;
    private Spawner enemy14Gun3;
    private Spawner enemy15Gun1;
    private Spawner enemy15Gun2;
    private Spawner enemy15Gun3;
    private Spawner enemy16Gun1;
    private Spawner enemy16Gun2;
    private Spawner enemy16Gun3;
    private Spawner enemy17Gun1;
    private Spawner enemy17Gun2;
    private Spawner enemy17Gun3;
    private Spawner enemy18Gun1;
    private Spawner enemy18Gun2;
    private Spawner enemy18Gun3;
    private Spawner enemy18Gun4;
    private Spawner enemy19Gun1;
    private Spawner enemy19Gun2;
    private Spawner enemy19Gun3;
    private Spawner enemy19Gun4;
    private Spawner enemy20Gun1;
    private Spawner enemy20Gun2;
    private Spawner enemy20Gun3;
    private Spawner enemy20Gun4;
    private Spawner enemy21Gun1;
    private Spawner enemy21Gun2;
    private Spawner enemy21Gun3;
    private Spawner enemy22Gun1;
    private Spawner enemy22Gun2;
    private Spawner enemy22Gun3;
    private Spawner enemy23Gun1;
    private Spawner enemy23Gun2;
    private Spawner enemy23Gun3;
    private Spawner enemy24Gun1;
    private Spawner enemy24Gun2;
    private Spawner enemy24Gun3;
    private Spawner enemy25Gun1;
    private Spawner enemy25Gun2;
    private Spawner enemy25Gun3;
    private Spawner enemy26Gun1;
    private Spawner enemy26Gun2;
    private Spawner enemy26Gun3;
    private Spawner boss2Gun1;
    private Spawner boss2Gun2;
    private Spawner boss2Gun3;
    private Spawner boss2Gun4;
    private Spawner boss2Gun5;
    //************************************************
    private int speed;
    private Dialogue[] dialogueArray = new Dialogue[14];
    private GreenfootImage background1, background2, background3;
    private Dialogue blankScreen;
    private GreenfootSound horn;
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
        this.blankScreen = new Dialogue("blankScreen.png");
        scroller=new Scroller(this,background1);
        this.horn = new GreenfootSound("horn.mp3");
        this.horn.setVolume(20);
       
        //World world=new ScrollingWorld();
        
        for(int i = 0; i < 5; i++){
            dialogueArray[i] = new Dialogue("dialogue" + (i+1) + ".png");
        }
        
        show(0,3,5);      
        player = new Player("Player.rotated.gif", "gif");
        Spawner playerGun1 = new Spawner(5, 10, 5, 0, 50, 50, 15, 270, 0);
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
        
        this.enemy8 = new Enemy('L', 3, "Enemy2.gif", "gif");
        this.enemy8Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 90, 1);
        this.enemy8Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 91, 1);
        this.enemy8Gun3 = new Spawner(4, 5, 0, 1, 500, 50, 9, 40, 1);
        
        this.enemy9 = new Enemy('R', 3, "Enemy2.gif", "gif");
        this.enemy9Gun1 = new Spawner(4, 0, -5, 1, 60, 100, 9, 90, 1);
        this.enemy9Gun2 = new Spawner(4, 5, 0, 1, 60, 100, 9, 91, 1);
        this.enemy9Gun3 = new Spawner(4, 5, 0, 1, 60, 100, 9, 40, 1);
        
        this.enemy10 = new Enemy('L', 3, "Enemy6.png", "png");
        this.enemy10Gun1 = new Spawner(4, 0, -5, 1, 500, 80, 9, 90, 1);
        this.enemy10Gun2 = new Spawner(4, 5, 0, 1, 500, 80, 9, 91, 1);
        this.enemy10Gun3 = new Spawner(4, 5, 0, 1, 500, 80, 9, 40, 1);
        
        this.enemy11 = new Enemy('D', 3, "Enemy6.png", "png");
        this.enemy11Gun1 = new Spawner(4, 0, -5, 1, 300, 50, 9, 270, 1);
        this.enemy11Gun2 = new Spawner(4, 5, 0, 1, 300, 50, 9, 180, 1);
        this.enemy11Gun3 = new Spawner(4, 5, 0, 1, 300, 50, 9, 40, 1);
        
        this.enemy12 = new Enemy('D', 2, "Enemy3.gif", "gif", 200);
        this.enemy12Gun1 = new Spawner(4, 0, -5, 1, 50, 50, 9, 90, 1);
        this.enemy12Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 360, 1);
        this.enemy12Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy13 = new Enemy('D', 2, "Enemy3.gif", "gif", 200);
        this.enemy13Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 90, 1);
        this.enemy13Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 0, 1);
        this.enemy13Gun3 = new Spawner(4, 5, 0, 1, 500, 50, 9, 40, 1);
        
        this.boss1 = new Boss('R', 5, "boss1.png", "png");
        this.boss1Gun1 = new Spawner(20, 0, -5, 1, 300, 50, 5, 90, 1);
        this.boss1Gun2 = new Spawner(5, 0, 5, 1, 300, 50, 5, 0, 1);
        this.boss1Gun3 = new Spawner(5,-5, 0, 1, 300, 50, 5, 360, 1);
        this.boss1Gun4 = new Spawner(5, 0, 5, 1, 300, 50, 5, 180, 1);
        this.boss1Gun5 = new Spawner(5,-5, 0, 1, 300, 50, 5, 91, 1);
        
        //Level 2 #############################################################
        this.enemy14 = new Enemy('D',2, "Enemy1.gif", "gif");
        this.enemy14Gun1 = new Spawner(5, 0, -5, 1, 300, 50, 5, 90, 1);
        this.enemy14Gun2 = new Spawner(5, 0, -5, 1, 300, 50, 5, 270, 1);
        this.enemy14Gun3 = new Spawner(5, 0, -5, 1, 300, 50, 5, 0, 1);
        
        this.enemy15 = new Enemy('L', 1, "Enemy1.gif", "gif");
        this.enemy15Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 90, 1);
        this.enemy15Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 91, 1);
        this.enemy15Gun3 = new Spawner(5, 0, -5, 1, 500, 50, 5, 0, 1);
        
        this.enemy16 = new Enemy('R', 1, "Enemy1.gif", "gif");
        this.enemy16Gun1 = new Spawner(4, 0, -5, 1, 50, 80, 9, 91, 1);
        this.enemy16Gun2 = new Spawner(4, 5, 0, 1, 50, 80, 9, 90, 1);
        this.enemy16Gun3 = new Spawner(4, 5, 0, 1, 50, 80, 9, 0, 1);
        
        this.enemy17 = new Enemy('L', 3, "Enemy7.png", "png");
        this.enemy17Gun1 = new Spawner(4, 0, -5, 1, 550, 150, 9, 180, 1);
        this.enemy17Gun2 = new Spawner(4, 5, 0, 1, 550, 150, 9, 45, 1);
        this.enemy17Gun3 = new Spawner(4, 5, 0, 1, 550, 150, 9, 360, 1);
        
        this.enemy18 = new Enemy('R', 1, "Enemy3.gif", "gif");
        this.enemy18Gun1 = new Spawner(3, 0, -5, 1, 50, 250, 9, 180, 1);
        this.enemy18Gun2 = new Spawner(3, 5, 0, 1, 50, 250, 9, 0, 1);
        this.enemy18Gun3 = new Spawner(3, 0, 5, 1, 50, 250, 9, 360, 1);
        this.enemy18Gun4 = new Spawner(3, -5, 0, 1, 50, 250, 9, 260, 1);
        
        this.enemy19 = new Enemy('D', 1, "Enemy7.png", "png");
        this.enemy19Gun1 = new Spawner(3, 0, -5, 1, 50, 50, 9, 180, 1);
        this.enemy19Gun2 = new Spawner(3, 5, 0, 1, 50, 50, 9, 90, 1);
        this.enemy19Gun3 = new Spawner(3, 0, 5, 1, 50, 50, 9, 40, 1);
        this.enemy19Gun4 = new Spawner(3, -5, 0, 1, 50, 50, 9, 260, 1);
        
        this.enemy20 = new Enemy('D', 1, "Enemy7.png", "png");
        this.enemy20Gun1 = new Spawner(3, 0, -5, 1, 500, 50, 9, 180, 1);
        this.enemy20Gun2 = new Spawner(3, 5, 0, 1, 500, 50, 9, 90, 1);
        this.enemy20Gun3 = new Spawner(3, 0, 5, 1, 500, 50, 9, 360, 1);
        this.enemy20Gun4 = new Spawner(3, -5, 0, 1, 500, 50, 9, 260, 1);
        
        this.enemy21 = new Enemy('L', 1, "Enemy1.gif", "gif");
        this.enemy21Gun1 = new Spawner(4, 0, -5, 1, 550, 150, 9, 90, 1);
        this.enemy21Gun2 = new Spawner(4, 5, 0, 1, 550, 150, 9, 91, 1);
        this.enemy21Gun3 = new Spawner(4, 5, 0, 1, 550, 150, 9, 40, 1);
        
        this.enemy22 = new Enemy('R', 1, "Enemy2.gif", "gif");
        this.enemy22Gun1 = new Spawner(4, 0, -5, 1, 50, 250, 9, 90, 1);
        this.enemy22Gun2 = new Spawner(4, 5, 0, 1, 50, 250, 9, 91, 1);
        this.enemy22Gun3 = new Spawner(4, 5, 0, 1, 50, 250, 9, 40, 1);
        
        this.enemy23 = new Enemy('L', 1, "Enemy6.png", "png");
        this.enemy23Gun1 = new Spawner(4, 0, -5, 1, 50, 50, 9, 90, 1);
        this.enemy23Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 91, 1);
        this.enemy23Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy24 = new Enemy('U', 1, "Enemy6.png", "png");
        this.enemy24Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 270, 1);
        this.enemy24Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 180, 1);
        this.enemy24Gun3 = new Spawner(4, 5, 0, 1, 500, 50, 9, 40, 1);
        
        this.enemy25 = new Enemy('D', 2, "Enemy3.gif", "gif", 200);
        this.enemy25Gun1 = new Spawner(4, 0, -5, 1, 50, 50, 9, 90, 1);
        this.enemy25Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 360, 1);
        this.enemy25Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy26 = new Enemy('D', 2, "Enemy3.gif", "gif", 200);
        this.enemy26Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 90, 1);
        this.enemy26Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 0, 1);
        this.enemy26Gun3 = new Spawner(4, 5, 0, 1, 500, 50, 9, 40, 1);
        
        this.boss2 = new Boss('R', 5, "boss2.png", "png");
        this.boss2Gun1 = new Spawner(20, 0, -5, 1, 300, 50, 5, 90, 1);
        this.boss2Gun2 = new Spawner(5, 0, 5, 1, 300, 50, 5, 0, 1);
        this.boss2Gun3 = new Spawner(5,-5, 0, 1, 300, 50, 5, 360, 1);
        this.boss2Gun4 = new Spawner(5, 0, 5, 1, 300, 50, 5, 180, 1);
        this.boss2Gun5 = new Spawner(5,-5, 0, 1, 300, 50, 5, 91, 1);
        
        world.addObject(player, 50, 50);
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
        if(counter == 500){
            //this.scroller.setScrollImage(background2);
            this.removeObject(dialogueArray[0]);
            this.addObject(this.enemy1, 100, 50);
            //this.addObject(new HealthBar("health1.png"), 100, 500);
            this.addObject(enemy1Gun1, 100,50);
        }

        if(counter == 510 && enemy1.getWorld() != null){
            this.enemy1.setDirection('R');
        }
        if(counter >= 500 && counter <= 530 && enemy1.getWorld() != null){
            this.enemy1Gun1.shoot();
        }
        if(counter == 525){
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
        if(counter == 526 && enemy2Gun2.getWorld() == null){
            this.addObject(this.enemy2Gun2, 300, 50);
        }
        if(counter >= 540 && counter <= 560 && enemy1.getWorld() != null){
            this.enemy1Gun1.shoot();
        }
        if(counter >= 540 && counter <= 590 && enemy2.getWorld() != null){
            this.enemy2Gun1.shoot();
            this.enemy2Gun2.shoot();
        }
        if(counter >= 540 && counter <= 560 && enemy3.getWorld() != null){
            this.enemy3Gun1.shoot();
            this.enemy3Gun2.shoot();
        }
        if(counter >= 540 && counter <= 560 && enemy4.getWorld() != null){
            this.enemy4Gun1.shoot();
            this.enemy4Gun2.shoot();
        }
        if(counter == 700){
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
        if(counter >= 705 && counter <= 850 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 870 && counter <= 900 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 920 && counter <= 1100 && enemy5.getWorld() != null){
            this.enemy5Gun1.shoot();
            this.enemy5Gun2.shoot();
            this.enemy5Gun3.shoot();
            this.enemy5Gun4.shoot();
        }
        if(counter >= 705 && counter <= 1100 && enemy6.getWorld() != null){
            this.enemy6Gun1.shoot();
            this.enemy6Gun2.shoot();
            this.enemy6Gun3.shoot();
            this.enemy6Gun4.shoot();
        }
        if(counter >= 705 && counter <= 1100 && enemy7.getWorld() != null){
            this.enemy7Gun1.shoot();
            this.enemy7Gun2.shoot();
            this.enemy7Gun3.shoot();
            this.enemy7Gun4.shoot();
        }
        if(counter == 1300){
            this.addObject(this.enemy8, 500, 50);
            this.addObject(this.enemy8Gun1, 500, 50);
            this.addObject(this.enemy8Gun2, 500, 50);
            this.addObject(this.enemy8Gun3, 500, 50);
            
            this.addObject(this.enemy9, 60, 100);
            this.addObject(this.enemy9Gun1, 60, 100);
            this.addObject(this.enemy9Gun2, 60, 100);
            this.addObject(this.enemy9Gun3, 60, 100);
        }
        if(counter >= 1301 && counter <= 1400 && enemy8.getWorld() != null){
            this.enemy8Gun1.shoot();
            this.enemy8Gun2.shoot();
            this.enemy8Gun3.shoot();
        }
        if(counter >= 1301 && counter <= 1400 && enemy9.getWorld() != null){
            this.enemy9Gun1.shoot();
            this.enemy9Gun2.shoot();
            this.enemy9Gun3.shoot();
        }
        if(counter == 1500){
            this.addObject(this.enemy10, 500, 80);
            this.addObject(this.enemy10Gun1, 500,80);
            this.addObject(this.enemy10Gun2, 500, 80);
            this.addObject(this.enemy10Gun3, 500, 80);
            
            this.addObject(this.enemy11, 300, 50);
            this.addObject(this.enemy11Gun1, 300,50);
            this.addObject(this.enemy11Gun2, 300, 50);
            this.addObject(this.enemy11Gun3, 300, 50);
        }
        if(counter >= 1501 && counter <= 1700 && enemy10.getWorld() != null){
            this.enemy10Gun1.shoot();
            this.enemy10Gun2.shoot();
            this.enemy10Gun3.shoot();
        }
        if(counter >= 1501 && counter <= 1700 && enemy11.getWorld() != null){
            this.enemy11Gun1.shoot();
            this.enemy11Gun2.shoot();
            this.enemy11Gun3.shoot();
        }
        if(counter == 1800){
            this.addObject(this.enemy12, 50, 50);
            this.addObject(this.enemy12Gun1, 50,50);
            this.addObject(this.enemy12Gun2, 50, 50);
            this.addObject(this.enemy12Gun3, 50, 50);
            
            this.addObject(this.enemy13, 500, 50);
            this.addObject(this.enemy13Gun1, 500,50);
            this.addObject(this.enemy13Gun2, 500, 50);
            this.addObject(this.enemy13Gun3, 500, 50);
        }
        if(counter >= 1801 && counter <= 2100 && enemy12.getWorld() != null){
            this.enemy12Gun1.shoot();
            this.enemy12Gun2.shoot();
            this.enemy12Gun3.shoot();
        }
        if(counter >= 1801 && counter <= 2100 && enemy13.getWorld() != null){
            this.enemy13Gun1.shoot();
            this.enemy13Gun2.shoot();
            this.enemy13Gun3.shoot();
        }
        if(counter == 1900){
            this.enemy12.setDirection('R');
            this.enemy13.setDirection('L');
        }
        if(counter == 2300){
            this.addObject(dialogueArray[1], 300, this.HEIGHT - 97);
        }
        if(counter == 2500){
            this.removeObject(dialogueArray[1]);
        }
        if(counter == 2600){
            this.horn.play();
            this.addObject(dialogueArray[2], 300, this.HEIGHT - 97);
        }
        if(counter == 3000){
            this.removeObject(dialogueArray[2]);
            this.addObject(dialogueArray[3], 300, this.HEIGHT - 97);
        }
        if(counter == 3300){
            this.removeObject(dialogueArray[3]);
        }
        if(counter == 3500){
            this.addObject(this.boss1, 300, 50);
            this.addObject(this.boss1Gun1, 300,50);
            this.addObject(this.boss1Gun2, 300,50);
            this.addObject(this.boss1Gun3, 300,50);
            this.addObject(this.boss1Gun4, 300,50);
            this.addObject(this.boss1Gun5, 300,50);
        }
        if(counter >= 3501 && counter <= 4000 && boss1.getWorld() != null){
            if(boss1Counter <= 1000){
                if(this.boss1.getX() >= this.WIDTH - 10 || this.boss1.getX() >= 300){
                boss1.setDirection('L');
                }else if(this.boss1.getX() <= 10){
                    boss1.setDirection('R');
                }else if(this.boss1.getY() <= 100){
                    boss1.setDirection('D');
                }else if(this.boss1.getY() > 300){
                    boss1.setDirection('U');
                }
            }else{
                if(this.boss1.getX() >= this.WIDTH - 10){
                    boss1.setDirection('L');
                }else if(this.boss1Counter <= 1005){
                    boss1.setDirection('L');
                }else if(this.boss1.getX() <= 10){
                    boss1.setDirection('R');
                }
            }
            
            this.boss1Gun1.shoot();
            this.boss1Gun2.shoot();
            this.boss1Gun3.shoot();
            this.boss1Gun4.shoot();
            this.boss1Gun5.shoot();
            this.boss1Counter++;
            this.counter = 3501;
        }
        if(counter == 3801){
            this.addObject(dialogueArray[4], 300, this.HEIGHT - 97);
        }
        if(counter == 4000){
            this.removeObject(dialogueArray[4]);
        }
        if(counter >= 4000 && counter < 4100){
            this.addObject(blankScreen, 300, 302);
            this.bombas.setCont(5);
            this.player.setBombs(0);
            this.vidas.setCont(3);
            this.scroller.setScrollImage(background2);
        }
        if(counter == 4100){
            this.removeObject(blankScreen);
        }
        //Level 2 #############################################################
        if(counter == 4200){
            this.addObject(this.enemy14, 300, 50);
            this.addObject(this.enemy14Gun1, 300,50);
            this.addObject(this.enemy14Gun2, 300, 50);
            this.addObject(this.enemy14Gun3, 300, 50);
            
            this.addObject(this.enemy15, 500, 50);
            this.addObject(this.enemy15Gun1, 500,50);
            this.addObject(this.enemy15Gun2, 500, 50);
            this.addObject(this.enemy15Gun3, 500, 50);
            
            this.addObject(this.enemy16, 50, 80);
            this.addObject(this.enemy16Gun1, 50,80);
            this.addObject(this.enemy16Gun2, 50, 80);
            this.addObject(this.enemy16Gun3, 50, 80);
        }
        if(counter >= 4201 && this.enemy14.getWorld() != null){
            this.enemy14Gun1.shoot();
            this.enemy14Gun2.shoot();
            this.enemy14Gun3.shoot();
        }
        if(counter >= 4201 && this.enemy15.getWorld() != null){
            this.enemy15Gun1.shoot();
            this.enemy15Gun2.shoot();
            this.enemy15Gun3.shoot();
        }
        if(counter >= 4201 && this.enemy16.getWorld() != null){
            this.enemy16Gun1.shoot();
            this.enemy16Gun2.shoot();
            this.enemy16Gun3.shoot();
        }
        if(counter == 4600){
            this.addObject(this.enemy17, 550, 150);
            this.addObject(this.enemy17Gun1, 550,150);
            this.addObject(this.enemy17Gun2, 550, 150);
            this.addObject(this.enemy17Gun3, 550, 150);
            
            this.addObject(this.enemy18, 50, 250);
            this.addObject(this.enemy18Gun1, 50,250);
            this.addObject(this.enemy18Gun2, 50, 250);
            this.addObject(this.enemy18Gun3, 50, 250);
            
            this.addObject(this.enemy19, 50, 50);
            this.addObject(this.enemy19Gun1, 50,50);
            this.addObject(this.enemy19Gun2, 50, 50);
            this.addObject(this.enemy19Gun3, 50, 50);
            
            this.addObject(this.enemy20, 500, 50);
            this.addObject(this.enemy20Gun1, 500,50);
            this.addObject(this.enemy20Gun2, 500, 50);
            this.addObject(this.enemy20Gun3, 500, 50);
        }
        if(counter >= 4601 && this.enemy17.getWorld() != null){
            this.enemy17Gun1.shoot();
            this.enemy17Gun2.shoot();
            this.enemy17Gun3.shoot();
        }
        if(counter >= 4601 && this.enemy18.getWorld() != null){
            this.enemy18Gun1.shoot();
            this.enemy18Gun2.shoot();
            this.enemy18Gun3.shoot();
        }
        if(counter >= 4601 && this.enemy19.getWorld() != null){
            this.enemy19Gun1.shoot();
            this.enemy19Gun2.shoot();
            this.enemy19Gun3.shoot();
        }
        if(counter >= 4601 && this.enemy20.getWorld() != null){
            this.enemy20Gun1.shoot();
            this.enemy20Gun2.shoot();
            this.enemy20Gun3.shoot();
        }
        if(counter == 5300){
            this.addObject(this.enemy21, 550, 150);
            this.addObject(this.enemy21Gun1, 550,150);
            this.addObject(this.enemy21Gun2, 550, 150);
            this.addObject(this.enemy21Gun3, 550, 150);
            
            this.addObject(this.enemy22, 50, 250);
            this.addObject(this.enemy22Gun1, 50,250);
            this.addObject(this.enemy22Gun2, 50, 250);
            this.addObject(this.enemy22Gun3, 50, 250);
            
            this.addObject(this.enemy23, 50, 50);
            this.addObject(this.enemy23Gun1, 50,50);
            this.addObject(this.enemy23Gun2, 50, 50);
            this.addObject(this.enemy23Gun3, 50, 50);
            
            this.addObject(this.enemy24, 500, 50);
            this.addObject(this.enemy24Gun1, 500,50);
            this.addObject(this.enemy24Gun2, 500, 50);
            this.addObject(this.enemy24Gun3, 500, 50);
        }
        if(counter >= 5301 && this.enemy21.getWorld() != null){
            this.enemy21Gun1.shoot();
            this.enemy21Gun2.shoot();
            this.enemy21Gun3.shoot();
        }
        if(counter >= 5301 && this.enemy22.getWorld() != null){
            this.enemy22Gun1.shoot();
            this.enemy22Gun2.shoot();
            this.enemy22Gun3.shoot();
        }
        if(counter >= 5301 && this.enemy23.getWorld() != null){
            this.enemy23Gun1.shoot();
            this.enemy23Gun2.shoot();
            this.enemy23Gun3.shoot();
        }
        if(counter >= 5301 && this.enemy24.getWorld() != null){
            this.enemy24Gun1.shoot();
            this.enemy24Gun2.shoot();
            this.enemy24Gun3.shoot();
        }
        if(counter >= 6000){
            
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
}