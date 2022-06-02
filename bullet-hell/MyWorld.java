import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


/**
* Clase MyWorld es donde se desarrollara e inicializará los elementos que tendra el juego
para ser agregados al mundo
* @author Valeria,Diego y Angel
* @version Final
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
    private int counter = 0; //lvl 1
    //private int counter = 4000; //lvl 2
    //private int counter = 8300; //lvl 3
    private int boss1Counter = 0;
    private int boss2Counter = 0;
    private int boss3Counter = 0;
    private GreenfootSound level1Music;
    private GreenfootSound level2Music;
    private GreenfootSound level3Music;
    
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
    //level 3 ******************************
    private Enemy enemy31;
    private Enemy enemy32;
    private Enemy enemy33;
    private Enemy enemy34;
    private Enemy enemy35;
    private Enemy enemy36;
    private Enemy enemy37;
    private Enemy enemy38;
    private Enemy enemy39;
    private Enemy enemy40;
    private Enemy enemy41;
    private Enemy enemy42;
    private Enemy enemy43;
    private Enemy enemy44;
    private Enemy enemy45;
    private Enemy enemy46;
    private Enemy enemy47;
    private Boss boss3;
    private Spawner enemy31Gun1;
    private Spawner enemy31Gun2;
    private Spawner enemy31Gun3;
    private Spawner enemy32Gun1;
    private Spawner enemy32Gun2;
    private Spawner enemy32Gun3;
    private Spawner enemy33Gun1;
    private Spawner enemy33Gun2;
    private Spawner enemy33Gun3;
    private Spawner enemy34Gun1;
    private Spawner enemy34Gun2;
    private Spawner enemy34Gun3;
    private Spawner enemy35Gun1;
    private Spawner enemy35Gun2;
    private Spawner enemy35Gun3;
    private Spawner enemy35Gun4;
    private Spawner enemy36Gun1;
    private Spawner enemy36Gun2;
    private Spawner enemy36Gun3;
    private Spawner enemy36Gun4;
    private Spawner enemy37Gun1;
    private Spawner enemy37Gun2;
    private Spawner enemy37Gun3;
    private Spawner enemy37Gun4;
    private Spawner enemy38Gun1;
    private Spawner enemy38Gun2;
    private Spawner enemy38Gun3;
    private Spawner enemy39Gun1;
    private Spawner enemy39Gun2;
    private Spawner enemy39Gun3;
    private Spawner enemy40Gun1;
    private Spawner enemy40Gun2;
    private Spawner enemy40Gun3;
    private Spawner enemy41Gun1;
    private Spawner enemy41Gun2;
    private Spawner enemy41Gun3;
    private Spawner enemy42Gun1;
    private Spawner enemy42Gun2;
    private Spawner enemy42Gun3;
    private Spawner enemy43Gun1;
    private Spawner enemy43Gun2;
    private Spawner enemy43Gun3;
    private Spawner boss3Gun1;
    private Spawner boss3Gun2;
    private Spawner boss3Gun3;
    private Spawner boss3Gun4;
    private Spawner boss3Gun5;
    private Spawner boss3Gun6;
    private Spawner boss3Gun7;
    private Spawner boss3Gun8;
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
        this.background3 = new GreenfootImage("background3.png");
        this.blankScreen = new Dialogue("blankScreen.png");
        scroller=new Scroller(this,background1);
        this.horn = new GreenfootSound("horn.mp3");
        this.horn.setVolume(20);
        this.level1Music = new GreenfootSound("Paldiego.mp3");
        this.level1Music.setVolume(20);
        this.level2Music = new GreenfootSound("nivel2.mp3");
        this.level2Music.setVolume(20);
        this.level3Music = new GreenfootSound("nivel3.mp3");
        this.level3Music.setVolume(20);
       
        //World world=new ScrollingWorld();
        //Se inicializan las imagenes de dialogos
        for(int i = 0; i <13; i++){
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
        
        this.boss1 = new Boss('R', 5, "boss1.png", "png", "dubstep.mp3");
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
        
        this.enemy25 = new Enemy('R', 1, "Enemy3.gif", "gif", 200);
        this.enemy25Gun1 = new Spawner(4, 0, -5, 1, 50, 50, 9, 90, 1);
        this.enemy25Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 360, 1);
        this.enemy25Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy26 = new Enemy('L', 1, "Enemy3.gif", "gif", 200);
        this.enemy26Gun1 = new Spawner(4, 0, -5, 1, 500, 100, 9, 90, 1);
        this.enemy26Gun2 = new Spawner(4, 5, 0, 1, 500, 100, 9, 0, 1);
        this.enemy26Gun3 = new Spawner(4, 5, 0, 1, 500, 100, 9, 180, 1);
        
        this.boss2 = new Boss('R', 5, "boss2.png", "png", "Boss2.mp3");
        this.boss2Gun1 = new Spawner(20, 0, -5, 1, 300, 50, 5, 90, 1);
        this.boss2Gun2 = new Spawner(5, 0, 5, 1, 300, 50, 5, 0, 1);
        this.boss2Gun3 = new Spawner(5,-5, 0, 1, 300, 50, 5, 1, 1);
        this.boss2Gun4 = new Spawner(5, 0, 5, 1, 300, 50, 5, 91, 1);
        this.boss2Gun5 = new Spawner(5,-5, 0, 1, 300, 50, 5, 360, 1);
        
        //Level 3 ##############################################################
        this.enemy31 = new Enemy('R',1, "Enemy2.gif", "gif");
        this.enemy31Gun1 = new Spawner(5, 0, -5, 1, 50, 50, 5, 90, 1);
        this.enemy31Gun2 = new Spawner(5, 0, -5, 1, 50, 50, 5, 270, 1);
        this.enemy31Gun3 = new Spawner(5, 0, -5, 1, 50, 50, 5, 0, 1);
        
        this.enemy32 = new Enemy('L', 1, "Enemy2.gif", "gif");
        this.enemy32Gun1 = new Spawner(4, 0, -5, 1, 500, 80, 9, 90, 1);
        this.enemy32Gun2 = new Spawner(4, 5, 0, 1, 500, 80, 9, 91, 1);
        this.enemy32Gun3 = new Spawner(5, 0, -5, 1, 500, 80, 5, 0, 1);
        
        this.enemy33 = new Enemy('D',2, "Enemy2.gif", "gif");
        this.enemy33Gun1 = new Spawner(4, 0, -5, 1, 250, 50, 9, 91, 1);
        this.enemy33Gun2 = new Spawner(4, 5, 0, 1, 250, 50, 9, 90, 1);
        this.enemy33Gun3 = new Spawner(4, 5, 0, 1, 250, 50, 9, 0, 1);
        
        this.enemy34 = new Enemy('D', 2, "Enemy6.png", "png");
        this.enemy34Gun1 = new Spawner(4, 0, -5, 1, 350, 50, 9, 180, 1);
        this.enemy34Gun2 = new Spawner(4, 5, 0, 1, 350, 50, 9, 45, 1);
        this.enemy34Gun3 = new Spawner(4, 5, 0, 1, 350, 50, 9, 360, 1);
        
        this.enemy35 = new Enemy('U', 1, "Enemy1.gif", "gif");
        this.enemy35Gun1 = new Spawner(8, 0, -5, 1, 50, 550, 9, 180, 1);
        this.enemy35Gun2 = new Spawner(8, 5, 0, 1, 50, 550, 9, 0, 1);
        this.enemy35Gun3 = new Spawner(8, 0, 5, 1, 50, 550, 9, 360, 1);
        this.enemy35Gun4 = new Spawner(8, -5, 0, 1, 50, 550, 9, 260, 1);
        
        this.enemy36 = new Enemy('D', 1, "Enemy6.png", "png");
        this.enemy36Gun1 = new Spawner(8, 0, -5, 1, 550, 50, 9, 180, 1);
        this.enemy36Gun2 = new Spawner(10, 5, 0, 1, 550, 50, 9, 90, 1);
        this.enemy36Gun3 = new Spawner(8, 0, 5, 1, 550, 50, 9, 40, 1);
        this.enemy36Gun4 = new Spawner(8, -5, 0, 1, 550, 50, 9, 260, 1);
        
        this.enemy37 = new Enemy('R', 1, "Enemy6.png", "png");
        this.enemy37Gun1 = new Spawner(8, 0, -5, 1, 50, 200, 9, 180, 1);
        this.enemy37Gun2 = new Spawner(10, 5, 0, 1, 50, 200, 9, 90, 1);
        this.enemy37Gun3 = new Spawner(8, 0, 5, 1, 50, 200, 9, 360, 1);
        this.enemy37Gun4 = new Spawner(8, -5, 0, 1, 50, 200, 9, 260, 1);
        
        this.enemy38 = new Enemy('L', 1, "Enemy3.gif", "gif");
        this.enemy38Gun1 = new Spawner(10, 0, -5, 1, 550, 400, 9, 90, 1);
        this.enemy38Gun2 = new Spawner(4, 5, 0, 1, 550, 400, 9, 91, 1);
        this.enemy38Gun3 = new Spawner(4, -5, 0, 1, 550, 400, 9, 40, 1);
        
        this.enemy39 = new Enemy('R', 2, "Enemy3.gif", "gif");
        this.enemy39Gun1 = new Spawner(4, 0, -5, 1, 50,50, 9, 90, 1);
        this.enemy39Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 91, 1);
        this.enemy39Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy40 = new Enemy('L', 2, "Enemy7.png", "png");
        this.enemy40Gun1 = new Spawner(4, 0, -5, 1, 550, 100, 9, 90, 1);
        this.enemy40Gun2 = new Spawner(4, 5, 0, 1, 550, 100, 9, 91, 1);
        this.enemy40Gun3 = new Spawner(4, 5, 0, 1, 550, 100, 9, 40, 1);
        
        this.enemy41 = new Enemy('U', 1, "Enemy7.png", "png");
        this.enemy41Gun1 = new Spawner(4, 0, -5, 1, 500, 50, 9, 270, 1);
        this.enemy41Gun2 = new Spawner(4, 5, 0, 1, 500, 50, 9, 180, 1);
        this.enemy41Gun3 = new Spawner(4, 5, 0, 1, 500, 50, 9, 40, 1);
        
        this.enemy42 = new Enemy('R', 1, "Enemy3.gif", "gif", 200);
        this.enemy42Gun1 = new Spawner(4, 0, -5, 1, 50, 50, 9, 90, 1);
        this.enemy42Gun2 = new Spawner(4, 5, 0, 1, 50, 50, 9, 360, 1);
        this.enemy42Gun3 = new Spawner(4, 5, 0, 1, 50, 50, 9, 40, 1);
        
        this.enemy43 = new Enemy('L', 1, "Enemy3.gif", "gif", 200);
        this.enemy43Gun1 = new Spawner(4, 0, -5, 1, 500, 100, 9, 90, 1);
        this.enemy43Gun2 = new Spawner(4, 5, 0, 1, 500, 100, 9, 0, 1);
        this.enemy43Gun3 = new Spawner(4, 5, 0, 1, 500, 100, 9, 180, 1);
        
        this.boss3 = new Boss('R', 12, "Fafnir.png", "png", "FinalBoss.mp3");
        this.boss3Gun1 = new Spawner(3, 0, -5, 1, 300, 50, 10, 90, 1);
        this.boss3Gun2 = new Spawner(3, 0, 5, 1, 300, 50, 10, 0, 1);
        this.boss3Gun3 = new Spawner(3,-5, 0, 1, 300, 50, 10, 1, 1);
        this.boss3Gun4 = new Spawner(3, 0, 5, 1, 300, 50, 10, 91, 1);
        this.boss3Gun5 = new Spawner(3,-5, 0, 1, 300, 50, 10, 180, 1);
        this.boss3Gun6 = new Spawner(3,-5, 0, 1, 300, 50, 10, 181, 1);
        this.boss3Gun7 = new Spawner(3,-5, 0, 1, 300, 50, 10, 270, 1);
        this.boss3Gun8 = new Spawner(3,-5, 0, 1, 300, 50, 10, 360, 1);
        
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
    //Act se usa con un counter para poder hacer las animaciones. Todo lo que sucede
    //va en relacion a este counter, y las batallas de los jefes terminan freezeando el 
    //uso de este counter y usan su propio counter, para poder tener variacion en la 
    //velocidad en la que se matan a estos jefes
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
            if(!this.level1Music.isPlaying()){
                this.level1Music.playLoop();
            }
        }
        if(counter == 500){
            //this.scroller.setScrollImage(background2);
            this.removeObject(dialogueArray[0]);
            this.addObject(this.enemy1, 100, 50);
            //this.addObject(new HealthBar("health1.png"), 100, 500);
            this.addObject(enemy1Gun1, 100,50);
        }
        //Tambien se checa que el enemigo no haya muerto para no crashear
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
        //Una invocacion de un dialogo
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
            if(this.level1Music.isPlaying()){
                this.level1Music.stop();
            }
            this.addObject(this.boss1, 300, 50);
            this.addObject(this.boss1Gun1, 300,50);
            this.addObject(this.boss1Gun2, 300,50);
            this.addObject(this.boss1Gun3, 300,50);
            this.addObject(this.boss1Gun4, 300,50);
            this.addObject(this.boss1Gun5, 300,50);
        }
        //Se inicia un bloque de pelea de jefe
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
        //Se cambia de nivel y se reinician las vidas y las bombas
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
            if(!this.level2Music.isPlaying()){
                this.level2Music.playLoop();
            }
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
        if(counter == 6000){
            this.addObject(this.enemy25, 50, 50);
            this.addObject(this.enemy25Gun1, 50,50);
            this.addObject(this.enemy25Gun2, 50, 50);
            this.addObject(this.enemy25Gun3, 50, 50);
            
            this.addObject(this.enemy26, 500, 100);
            this.addObject(this.enemy26Gun1, 500,100);
            this.addObject(this.enemy26Gun2, 500, 100);
            this.addObject(this.enemy26Gun3, 500, 100);
        }
        if(counter >= 6001 && this.enemy25.getWorld() != null){
            this.enemy25Gun1.shoot();
            this.enemy25Gun2.shoot();
            this.enemy25Gun3.shoot();
        }
        if(counter >= 6001 && this.enemy26.getWorld() != null){
            this.enemy26Gun1.shoot();
            this.enemy26Gun2.shoot();
            this.enemy26Gun3.shoot();
        }
        if(counter == 6300 && this.enemy25.getWorld() != null){
            this.enemy25.setDirection('D');
        }
        if(counter == 6300 && this.enemy26.getWorld() != null){
            this.enemy26.setDirection('D');
        }
        if(counter == 6700){
            this.addObject(dialogueArray[5], 300, this.HEIGHT - 97);
        }
        if(counter == 6900){
            this.removeObject(dialogueArray[5]);
            this.addObject(dialogueArray[6], 300, this.HEIGHT - 97);
        }
        if(counter == 7300){
            this.removeObject(dialogueArray[6]);
            this.addObject(dialogueArray[7], 300, this.HEIGHT - 97);
        }
        if(counter == 7800){
            if(this.level2Music.isPlaying()){
                this.level2Music.stop();
            }
            if(this.dialogueArray[7].getWorld() != null){
                this.removeObject(dialogueArray[7]);
            }
            this.addObject(this.boss2, 300, 50);
            this.addObject(this.boss2Gun1, 300,50);
            this.addObject(this.boss2Gun2, 300,50);
            this.addObject(this.boss2Gun3, 300,50);
            this.addObject(this.boss2Gun4, 300,50);
            this.addObject(this.boss2Gun5, 300,50);
        }
        if(counter >= 7801 && counter <= 8000 && boss2.getWorld() != null){
            if(boss2Counter <= 1000){
                if(this.boss2.getX() >= this.WIDTH - 10){
                    boss2.setDirection('L');
                }else if(this.boss2.getX() < 10){
                    boss2.setDirection('R');
                }
            }else if(boss2Counter <= 1700){
                if(this.boss2.getY() < 100){
                    boss2.setDirection('D');
                    boss2.setSpeed(2);
                }else if(this.boss2.getY() > this.HEIGHT - 200){
                    boss2.setDirection('U');
                }
            }else{
                if(this.boss2.getX() >= this.WIDTH - 10){
                    boss2.setDirection('L');
                }else if(this.boss2.getX() < 10){
                    boss2.setDirection('R');
                }else if(this.boss2.getX() > 10 && boss2Counter <= 2500){
                    boss2.setDirection('L');
                }
                if(boss2Counter > 2500){
                    boss2.setSpeed(7);
                }
            }
            
            if(boss2Counter < 2500){
                this.boss2Gun1.shoot();
            }
            this.boss2Gun2.shoot();
            this.boss2Gun3.shoot();
            this.boss2Gun4.shoot();
            this.boss2Gun5.shoot();
            this.boss2Counter++;
            this.counter = 7801;
        }
        if(counter == 7900){
            this.addObject(dialogueArray[8], 300, this.HEIGHT - 97);
        }
        if(counter == 8300){
            this.removeObject(dialogueArray[8]);
        }
        if(counter >= 8300 && counter < 8400){
            this.addObject(blankScreen, 300, 302);
            this.bombas.setCont(5);
            this.player.setBombs(0);
            this.vidas.setCont(3);
            this.scroller.setScrollImage(background3);
        }
        //Level 3 ###################################################
        if(counter == 8401){
            this.removeObject(blankScreen);
            if(!this.level3Music.isPlaying()){
                this.level3Music.playLoop();
            }
        }
        if(counter == 8600){
            this.addObject(this.enemy31, 50, 50);
            this.addObject(this.enemy31Gun1, 50,50);
            this.addObject(this.enemy31Gun2, 50, 50);
            this.addObject(this.enemy31Gun3, 50, 50);
            
            this.addObject(this.enemy32, 500, 80);
            this.addObject(this.enemy32Gun1, 500,80);
            this.addObject(this.enemy32Gun2, 500, 80);
            this.addObject(this.enemy32Gun3, 500, 80);
            
            this.addObject(this.enemy33, 250, 50);
            this.addObject(this.enemy33Gun1, 250,50);
            this.addObject(this.enemy33Gun2, 250, 50);
            this.addObject(this.enemy33Gun3, 250, 50);
            
            this.addObject(this.enemy34, 350, 50);
            this.addObject(this.enemy34Gun1, 350,50);
            this.addObject(this.enemy34Gun2, 350, 50);
            this.addObject(this.enemy34Gun3, 350, 50);
        }
        if(counter >= 8601 && this.enemy31.getWorld() != null){
            this.enemy31Gun1.shoot();
            this.enemy31Gun2.shoot();
            this.enemy31Gun3.shoot();
        }
        if(counter >= 8601 && this.enemy32.getWorld() != null){
            this.enemy32Gun1.shoot();
            this.enemy32Gun2.shoot();
            this.enemy32Gun3.shoot();
        }
        if(counter >= 8601 && this.enemy33.getWorld() != null){
            this.enemy33Gun1.shoot();
            this.enemy33Gun2.shoot();
            this.enemy33Gun3.shoot();
        }
        if(counter >= 8601 && this.enemy34.getWorld() != null){
            this.enemy34Gun1.shoot();
            this.enemy34Gun2.shoot();
            this.enemy34Gun3.shoot();
        }
        if(counter == 9200){

            this.addObject(this.enemy35, 50, 550);
            this.addObject(this.enemy35Gun1, 50,550);
            this.addObject(this.enemy35Gun2, 50, 550);
            this.addObject(this.enemy35Gun3, 50, 550);
            this.addObject(this.enemy35Gun4, 50, 550);

            this.addObject(this.enemy36, 550, 50);
            this.addObject(this.enemy36Gun1, 550,50);
            this.addObject(this.enemy36Gun2, 550, 50);
            this.addObject(this.enemy36Gun3, 550, 50);
            this.addObject(this.enemy36Gun4, 550, 50);

            this.addObject(this.enemy37, 50, 200);
            this.addObject(this.enemy37Gun1, 50,200);
            this.addObject(this.enemy37Gun2, 50, 200);
            this.addObject(this.enemy37Gun3, 50, 200);
            this.addObject(this.enemy37Gun4, 50, 200);
            
            this.addObject(this.enemy38, 550, 400);
            this.addObject(this.enemy38Gun1, 550,400);
            this.addObject(this.enemy38Gun2, 550, 400);
            this.addObject(this.enemy38Gun3, 550, 400);

        }

        if(counter >= 9201 && this.enemy35.getWorld() != null){
            this.enemy35Gun1.shoot();
            this.enemy35Gun2.shoot();
            this.enemy35Gun3.shoot();
            this.enemy35Gun4.shoot();
        }

        if(counter >= 9201 && this.enemy36.getWorld() != null){
            this.enemy36Gun1.shoot();
            this.enemy36Gun2.shoot();
            this.enemy36Gun3.shoot();
            this.enemy36Gun4.shoot();
        }
 
        if(counter >= 9201 && this.enemy37.getWorld() != null){
            this.enemy37Gun1.shoot();
            this.enemy37Gun2.shoot();
            this.enemy37Gun3.shoot();
            this.enemy37Gun4.shoot();
        }
        if(counter >= 9201 && this.enemy38.getWorld() != null){
            this.enemy38Gun1.shoot();
            this.enemy38Gun2.shoot();
            this.enemy38Gun3.shoot();
        }
        if(counter == 9900){
            this.addObject(this.enemy39, 50, 50);
            this.addObject(this.enemy39Gun1, 50,50);
            this.addObject(this.enemy39Gun2, 50, 50);
            this.addObject(this.enemy39Gun3, 50, 50);

            this.addObject(this.enemy40, 550, 100);
            this.addObject(this.enemy40Gun1, 550,100);
            this.addObject(this.enemy40Gun2,550, 100);
            this.addObject(this.enemy40Gun3, 550, 100);
        }
        if(counter >= 9901 && this.enemy39.getWorld() != null){
            this.enemy39Gun1.shoot();
            this.enemy39Gun2.shoot();
            this.enemy39Gun3.shoot();
        }
        if(counter >= 9901 && this.enemy40.getWorld() != null){
            this.enemy40Gun1.shoot();
            this.enemy40Gun2.shoot();
            this.enemy40Gun3.shoot();
        }
        if(counter == 10200){
            this.enemy39.setDirection('L');
            this.enemy40.setDirection('R');
        }
        if(counter == 10700){
            this.addObject(dialogueArray[9], 300, this.HEIGHT - 97);
        }
        if(counter == 11000){
            this.removeObject(dialogueArray[9]);
            this.addObject(dialogueArray[10], 300, this.HEIGHT - 97);
        }
        if(counter == 11500){
            this.removeObject(dialogueArray[10]);
            this.addObject(dialogueArray[11], 300, this.HEIGHT - 97);
        }
        if(counter == 11900){
            this.removeObject(dialogueArray[11]);
            this.addObject(dialogueArray[12], 300, this.HEIGHT - 97);
        }
        if(counter == 12300){
            this.removeObject(dialogueArray[12]);
        }
        if(counter == 12400){
            if(this.level3Music.isPlaying()){
                this.level3Music.stop();
            }
            this.addObject(this.boss3, 300, 50);
            this.addObject(this.boss3Gun1, 300,50);
            this.addObject(this.boss3Gun2, 300,50);
            this.addObject(this.boss3Gun3, 300,50);
            this.addObject(this.boss3Gun4, 300,50);
            this.addObject(this.boss3Gun5, 300,50);
            this.addObject(this.boss3Gun6, 300,50);
            this.addObject(this.boss3Gun7, 300,50);
            this.addObject(this.boss3Gun8, 300,50);
        }
        if(counter >= 12401 && counter <= 12500 && boss3.getWorld() != null){
            if(boss3Counter <= 500 || boss3Counter >= 600){
                if(this.boss3.getDirection() == 'U'){
                    this.boss3.setDirection('L');
                }
                if(this.boss3.getX() >= this.WIDTH - 100){
                    this.boss3.setDirection('L');
                }else if(this.boss3.getX() < 100){
                    this.boss3.setDirection('R');
                }
            }else if(boss3Counter > 500 && boss3Counter <= 550){
                this.boss3.setDirection('D');
            }else if(boss3Counter > 550){
                this.boss3.setDirection('U');
            }
            
            this.boss3Gun1.shoot();
            this.boss3Gun2.shoot();
            this.boss3Gun3.shoot();
            this.boss3Gun4.shoot();
            this.boss3Gun5.shoot();
            this.boss3Gun6.shoot();
            this.boss3Gun7.shoot();
            this.boss3Gun8.shoot();
            this.boss3Counter++;
            this.counter = 12401;
        }
        if(counter==12500)
        {
            this.counter = this.counter + boss1Counter + boss2Counter + boss3Counter;
           Greenfoot.setWorld(new Instructions(2,this, this.counter, puntos.Points())); 
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
    public int getCont(){
        return this.cont;
    }
}