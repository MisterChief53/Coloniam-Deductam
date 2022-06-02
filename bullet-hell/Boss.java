import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private HealthBar[] barArray = new HealthBar[14];
    private MyWorld w;
    private GreenfootSound bossMusic;
    public Boss(char direction, int speed, String sprite, String spriteType, String sound){
        super(direction, speed, sprite, spriteType, 2000);
        this.w = getWorldOfType(MyWorld.class);
        for(int i = 0; i < 14; i++){
            this.barArray[i] = new HealthBar("health" + (i+1) + ".png");
        }
        this.bossMusic = new GreenfootSound(sound);
        this.bossMusic.setVolume(15);
    }
    public void act()
    {
        if(getWorld() != null){
            HealthBar();
        }
        if(!this.bossMusic.isPlaying()){
            this.bossMusic.playLoop();
        }
        super.movement();
        checkCollisions();
        super.applySprite();
    }
    @Override
    public void checkCollisions()
    {
        int auxHealth = super.getHealth();
        World w = getWorld();
        MyWorld w1=(MyWorld)getWorld();
        Actor p=getOneIntersectingObject(Projectile.class);;
        if(p!=null && ((Projectile) p).getProjectileType() == 0){
            List<Projectile> list_e_ = getTouchedObjects(Projectile.class);
            for(Projectile e_ : list_e_){ 
                w1.puntos.incPoints();
                //se decrementa la vida cada vez que intersecta con un proyectil
                auxHealth -= 5;
                super.setHealth(auxHealth);
                if(super.getHealth() <= 0){ //si se acaba la vida, se quita
                    for(int i = 0; i < 14; i ++){
                        if(barArray[i].getWorld() != null){
                            barArray[i].delete();
                        }
                    }
                    e_.getWorld().removeObject(this);
                }
            }
        }else if(getY() > w.getHeight() + 50 || getX() > w.getWidth() + 50 ||
                getX() < (-50) || getY() < (-50) )
        {
            this.bossMusic.stop();
            w.removeObject(this);
        }
    }
    public void HealthBar(){
        if(getWorld() != null){
            if(super.getHealth() == 2000){
                getWorld().addObject(barArray[0], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1900 && super.getHealth() < 2000 && getWorld() != null){
                getWorld().removeObject(barArray[0]);
                getWorld().addObject(barArray[1], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1800 && super.getHealth() <= 1999){
                getWorld().removeObject(barArray[1]);
                getWorld().addObject(barArray[2], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1700 && super.getHealth() <= 1800){
                getWorld().removeObject(barArray[2]);
                getWorld().addObject(barArray[3], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1600 && super.getHealth() <= 1700){
                getWorld().removeObject(barArray[3]);
                getWorld().addObject(barArray[4], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1500 && super.getHealth() <= 1600){
                getWorld().removeObject(barArray[4]);
                getWorld().addObject(barArray[5], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1400 && super.getHealth() <= 1500){
                getWorld().removeObject(barArray[5]);
                getWorld().addObject(barArray[6], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1200 && super.getHealth() <= 1400){
                getWorld().removeObject(barArray[6]);
                getWorld().addObject(barArray[7], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 1000 && super.getHealth() <= 1200){
                getWorld().removeObject(barArray[7]);
                getWorld().addObject(barArray[8], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 800 && super.getHealth() <= 1000){
                getWorld().removeObject(barArray[8]);
                getWorld().addObject(barArray[9], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 600 && super.getHealth() <= 800){
                getWorld().removeObject(barArray[9]);
                getWorld().addObject(barArray[10], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 400 && super.getHealth() <= 600){
                getWorld().removeObject(barArray[10]);
                getWorld().addObject(barArray[11], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 300 && super.getHealth() <= 400){
                getWorld().removeObject(barArray[11]);
                getWorld().addObject(barArray[12], 300, w.HEIGHT - 20);
            }else if(super.getHealth() > 200 && super.getHealth() <= 300){
                getWorld().removeObject(barArray[12]);
                getWorld().addObject(barArray[13], 300, w.HEIGHT - 20);
            }else if(super.getHealth() <= 0){
                getWorld().removeObject(barArray[13]);
            }
        }
    }
}