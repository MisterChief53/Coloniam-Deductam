import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Clase Bomb es donde se instanciaran  las bombas y controlaran el numero de estas
* @author Valeria,Diego y Angel
* @version Final
*/
public class Bomb extends Actor
{
    private int x,dir,dir2;
    private double direction;
    private int speed;
    private int cont=0;
    private int timer = 25;//atributo usado para ponerle un reloj a la bomba
    GifImage gif = new GifImage("Explosion-unscreen.gif");//se le asigna el gif que usara al "explotar"
    private GreenfootSound explosion;//atributo para el funcionamiento del sonido

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb(double direction, int speed){//este constructor recibe y asigna direccion y velocidad a la bomba ademas de disminuir el tamaño del gif
        int scalePercent = 50;
        for (GreenfootImage image : gif.getImages())
        {
            int wide = image.getWidth()*scalePercent/400;
            int high = image.getHeight()*scalePercent/400;
            image.scale(wide, high);
        }
        this.direction = direction;
        this.speed = speed;
        this.explosion = new GreenfootSound("explosion.mp3");
        this.explosion.setVolume(25);
    }
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
       public void move(int x,int y)
    {
        setLocation(getX()+x,getY()+y);
    }
    public void act()//el metodo ejecuta el movimiento mientras corre el reloj para cuando llegue a cierto tiempo se vea el sprite de la
    //explosion y para que despues se remueva del mundo
    {
        movement();
        timer--;
        if (timer <= 10) {
          setImage(gif.getCurrentImage());
         // timer--;
        }
        if(timer<=0){
          getWorld().removeObjects(getWorld().getObjects(Projectile.class));
          //Se decrementa la cantidad de bombas antes de borrar el objeto
          this.explosion.play();
          MyWorld w = (MyWorld) getWorld();
          w.bombas.decrementar();
          getWorld().removeObject(this);
        }
    }
     public int sampleMethod(int y)
    {
        return x + y;
    }

}