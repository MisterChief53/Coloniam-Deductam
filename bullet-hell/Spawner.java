import greenfoot.*;
/**
* Clase Spawner controla la generacion de "armas" de los actores
* @author Valeria,Diego y Angel
* @version Final
*/
public class Spawner extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private int spawnRate;//cadencia
    private double direction; //Direccion en la que se dispara
    private int speed;//Velocidad del proyectil
    private int counter = 0;
    private int yOffset;//Posicion y en relacion con el centro del sprite al que se ancla
    private int xOffset;//Posicion x en relacion con el centro del sprite al que se ancla
    private int entityX;//Coordenada x de donde se encuentra entidad a anclarse.
    private int entityY;//Coordenada y de donde se encuentra entidad a anclarse.
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
    //Se instancia un proyectil de tipo enemigo o jugador, con direccion y velocidad 
    //determinados
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
    //Se checa si se pueden remover los spawners, luego se anclan (se acutaliza la ubicacion)
    //y luego si es un spawner anclado al jugador, se dispara. Los sonidos han sido comentados por problemas
    //de rendimiento
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
    //Este metodo es llamado para independientemente del tipo de entidad al que se ancla
    //poder hacer que el spawner dispare. Los sonidos han sido comentados por problemas
    //de rendimiento
    public void shoot(){
        this.counter++;
        if (this.counter > this.spawnRate){
            spawn(this.direction, this.speed);
            counter = 0;
            /*
            if(Greenfoot.getRandomNumber(10)%2==0){
                this.sound.play();
            }*/
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
    //Se checa si hay un objeto en la celta especifica en los offsets de tipo jugador. 
    //Si lo hay, se consigue la posicion de ese objeto y se cambia la posicion del
    //spawner hacia ahi.
    //Sino, se checa si hay un objeto enemigo en esa posicion, y si es encontrado,
    //se cambia a la posicion de ese enemigo. Sino, entonces no hay nada a que anclarse,
    //asi que el spawner se quita. 
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
    //si el spawner se sale de un cierto rango de la pantalla, se elimina.
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