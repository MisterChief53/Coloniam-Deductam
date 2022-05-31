import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity extends Collision
{
    private GreenfootImage staticSprite;
    private GifImage animatedSprite;
    private String spriteType;
    public Entity(String sprite, String spriteType){
        this.spriteType = spriteType;
        if(this.spriteType == "gif"){
            this.animatedSprite = new GifImage(sprite);
        }else{
            this.staticSprite = new GreenfootImage(sprite);
        }
    }
    /**
     * Act - do whatever the Entity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /*
        if(this.spriteType == "gif"){
            setImage(this.animatedSprite.getCurrentImage());
        }else{
            setImage(this.staticSprite);
        }*/
    }
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }
    public abstract void movement();
    public void applySprite(){
        if(this.spriteType == "gif"){
            setImage(this.animatedSprite.getCurrentImage());
        }else{
            setImage(this.staticSprite);
        }
    }
    public String getSpriteType(){
        return this.spriteType;
    }
    public GifImage getAnimatedSprite(){
        return this.animatedSprite;
    }
    public GreenfootImage getStaticSprite(){
        return this.staticSprite;
    }
}
