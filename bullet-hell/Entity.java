import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Clase Entity es la clase padre de Enemy y boss, pues con esto podran ser incluidos en el sistema de colisiones
* @author Valeria,Diego y Angel
* @version Final
*/
//Clase padre de Enemigo y Jugador para que el sistema de colisiones sea facilmente aplicable a sus clases hija
public abstract class Entity extends Collision
{
    private GreenfootImage staticSprite;//atributos para asignar sprites
    private GifImage animatedSprite;
    private String spriteType;
    public Entity(String sprite, String spriteType){//metodo para asignar sprites
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
    public void applySprite(){//metodo para aplicar el sprite
        if(this.spriteType == "gif"){
            setImage(this.animatedSprite.getCurrentImage());
        }else{
            setImage(this.staticSprite);
        }
    }
    public String getSpriteType(){//metodos para obtener el sprite de distintos formatos
        return this.spriteType;
    }
    public GifImage getAnimatedSprite(){
        return this.animatedSprite;
    }
    public GreenfootImage getStaticSprite(){
        return this.staticSprite;
    }
}