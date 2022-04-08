
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    int cont=0;
    int speed;
    private int numSpawners = 2;
    Spawner[] spawners = new Spawner[2];
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public player(){
        speed=5;
        /*
        for(int i = 0; i < this.numSpawners; i++){
            //spawners[i] = new Spawner(5);
            //world.addObject(new Spawner(5), getX()+1, getY()+i);
        }*/
    }
    public int getSpeed(){
        return speed;
    }
    public void act()
    {
        // Add your action code here.
       // atWorldEdge();
        if(cont<1){
            turn(-90);
            cont++;
        }
        movement();
        //shoot();
       
       // checkOutOfBonds();
        /*
        int y=getY();
        int x=getX();
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
            x-=5;
           // move(-1);
        }
         if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
             x+=5;
           // move(1);
        }
         if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
            y-=5;
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
            y+=5;
        }

         setLocation(getX(),y);
         setLocation(x,getY()); */
         
    }
    /*
    public void shoot(){
        if(Greenfoot.isKeyDown("space")){
            for(int i = 0; i < this.numSpawners; i++){
                spawners[i].spawn(0,5);
            }
        }
    }
    */
    public void movement(){
        int x=getX();
        int y=getY();
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
      
            move(-speed,0);
           // move(-1);
        }
         if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
           
             move(speed,0);
           // move(1);
        }
         if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
      
             move(0,-speed);
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
          
            move(0,speed);
        }
        if(Greenfoot.isKeyDown("shift")){
          speed=1;  
        }else{
            speed=5;
        }
       /*
        //bordes raros
            while((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& isAtEdge() ){
            setLocation(50,getY());
        }
        while((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& isAtEdge()){
            setLocation(x-50,getY());
        }
        while((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&& isAtEdge()){
            setLocation(x,y-50);
        }
        while((Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w"))&& isAtEdge()){
            setLocation(x,50);
        }*/
        //Paso de un lado a otro
        while((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& isAtEdge() ){
            setLocation(x+550,y);
        }
        while((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& isAtEdge()){
            setLocation(50,y);
        }
        while((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&& isAtEdge()){
            setLocation(x,50);
        }
        while((Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w"))&& isAtEdge()){
            setLocation(x,y+500);
        }
    }
    public void move(int x,int y){
        setLocation(getX()+x,getY()+y);
    }
}