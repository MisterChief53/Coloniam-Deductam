import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
* Clase Projectile instancia y elimina a los 2 tipos posibles de proyectil
* @author Valeria,Diego y Angel
* @version Final
*/
public class Projectile extends Actor
{
    // instance variables - replace the example below with your own
    private int x,dir,dir2;
    private double direction;
    private int speed;
    private int projectileType; // 0 for player, 1 for enemy
    private GreenfootImage sprite;
    /**
    * Constructor for objects of class Proyectile


    */
    public Projectile(double direction, int speed, int proyectileType)
   //ademas de asignar los sprites correspondies a si es de enemigo o de jugador
    {
        this.direction = direction;
        this.speed = speed;
        this.projectileType = proyectileType;
        //dependiendo del tipo de proyectil se usa diferente sprite.
        if(this.projectileType == 0){
            this.sprite = new GreenfootImage("playerBullet.png");
        }else{
            this.sprite = new GreenfootImage("enemyBullet.rotated.png");
        }
    }
    //Se deciden la direccion del proyectil. Muy basico. 
    public void movement()//metodo que se prepara a realizar el movimiento a raiz de la direccion y velocidad leida en el contructor de bomba
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

    public void move(int x,int y)//metodo que ejecuta el movimiento
    {
        setLocation(getX()+x,getY()+y);
    }

    public void act()//solo mueve al proyectil y pone el sprite en pantalla
    {
        movement();
        setImage(sprite);
    }
    /**
    * An example of a method - replace this comment with your own
    *
    * @param y a sample parameter for a method
    * @return the sum of x and y
    */
    public int sampleMethod(int y)
    {
        return x + y;
    }
    //Si el proyectil sale de un cierto rango de la pantalla, se elimina.
    public void checkRemove()//verifica si esta fuera de pantalla para eliminarlo
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 30 || getX() > w.getWidth() + 30 || getX() < (-30) || 
            getY() < (-30) )
        {
            w.removeObject(this);
        }
    }
    //If we use this, the proyectiles are prematurely removed, so I use a method from
    //Enemy class
    /*
    public void checkCollisions()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null && this.proyectileType == 0)
        {
            World w = getWorld();
            //w.removeObject(enemy);
            w.removeObject(this);
        }
        else
        {
            checkRemove();
        }
    }
    */
    
    public int getProjectileType(){//da el tipo de proyectil
        return this.projectileType;
    }
}