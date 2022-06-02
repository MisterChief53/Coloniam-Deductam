import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;


/**
* clase Enemy instancia a los enemigos que funcionaran de manera diferente
* @author Valeria,Diego y Angel
* @version Final
*/
public class Enemy extends Entity
{
    /**
    * Act - do whatever the Enemy wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    private char direction; //L, R, D, U.
    private int speed;
    private int x;
    private int y;
    private int health;
    private GreenfootImage staticSprite;
    private GifImage animatedSprite;
    public Enemy(char direction, int speed, String sprite, String spriteType)//el metodo asigna, el sprite,direccion,velocidad
    {
        super(sprite, spriteType);
        this.direction = direction;
        this.speed = speed;
        this.health = 100;
    }
    public Enemy(char direction, int speed, String sprite, String spriteType, int health){//el metodo asigna, el sprite,direccion,velocidad y salud  a un enemigo
 
        super(sprite, spriteType);
        this.direction = direction;
        this.speed = speed;
        this.health = health;
    }
    public void act()
    {
        movement();
        checkCollisions();
        super.applySprite();//aplica el sprite dado
    }
    public void movement()//hace el movimiento asignado en myWorld, con direction
    {
        move(0,-3);
        switch(this.direction)
        {
            case 'L':
                move(-speed,0);
                break;
            case 'R':
                move(speed,0);
                break;
            case 'U':
                move(0,-speed);
                break;
            case 'D':
                move(0,speed);
                break;
        }
    }

    public void setDirection(char direction)
    {
        this.direction = direction;
    }
    public char getDirection(){
        return this.direction;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void checkRemove()
    {
        World w = getWorld();
        if(getY() > w.getHeight() + 50 || getX() > w.getWidth() + 50 ||
                getX() < (-50) || getY() < (-50) )
        {
            w.removeObject(this);
        }
    }

    public void checkCollisions()//revisa que ningun proyectil del jugador lo toque si es asi lo elimina o verifica si esta fuera de pantalla para eliminarlo
    {
        World w = getWorld();
        MyWorld w1=(MyWorld)getWorld();
        Actor p=getOneIntersectingObject(Projectile.class);
        //Actor proyectile = getOneIntersectingObject(Projectile.class);
        if(p!=null && ((Projectile) p).getProjectileType() == 0){
            List<Projectile> list_e_ = getTouchedObjects(Projectile.class);
            for(Projectile e_ : list_e_){ 
                w1.puntos.incPoints();
                //se decrementa la vida cada vez que intersecta con un proyectil
                this.health -= 5;
                if(this.health <= 0){ //si se acaba la vida, se quita
                    e_.getWorld().removeObject(this);
                }
            }
        }else if(getY() > w.getHeight() + 50 || getX() > w.getWidth() + 50 ||
                getX() < (-50) || getY() < (-50) )
        {
            w.removeObject(this);
        }
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    /*
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }*/
}