
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Entity
{
    
      private double direction;
    private int speed;
    int cont=0;
         private int timer=15;
         boolean x;
    int c=0;
   // int speed;
    private int numSpawners = 3;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        this.speed=5;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void act()
    {
        if(cont<1){
            turn(-90);
            cont++;
        }
        World world = getWorld();
        if(Greenfoot.mouseClicked(null) && c<5){
            world.addObject(new Bomb(270, 6), getX()+1, getY()+2);
            c++;
          
        }
        movement();
             
        checkCollisions();
   
      
 
    }
    
    public void movement(){
        int x=getX();
        int y=getY();
        move(0,-3);
        if(Greenfoot.isKeyDown("left") && x > 0 || Greenfoot.isKeyDown("a") && x > 0){
            move(-speed,0);
            // move(-1);
        }
         if(Greenfoot.isKeyDown("right") && x < MyWorld.WIDTH || Greenfoot.isKeyDown("d") &&
             x < MyWorld.WIDTH){
            move(speed,0);
            // move(1);
        }
         if(Greenfoot.isKeyDown("up") && y > 40 || Greenfoot.isKeyDown("w") && y > 40){
            move(0,-speed);
        }
        if(Greenfoot.isKeyDown("down") && y < MyWorld.HEIGHT || Greenfoot.isKeyDown("s") && 
        y < MyWorld.HEIGHT){
            move(0,speed+2);
        }
        if(Greenfoot.isKeyDown("shift")){
            speed=1;  
        }else{
            speed=5;
        }
    }
    public void Guts(boolean x,int r){ //metodo a revisar 
    //    while(timer>0){
            
      //  }
      MyWorld w=(MyWorld)getWorld();
      //if(timer>0){
        //   timer--;
    // }

        if(r==0 && x==true && timer<=0){
             w.vidas.decrementar();
             timer=280;
        }
    }
      public void checkCollisions()
    {
        //int r=0;
        MyWorld w=(MyWorld)getWorld();
        Actor proyectile = getOneIntersectingObject(Projectile.class);
        if(proyectile != null && ((Projectile) proyectile).getProjectileType() == 1)
        {
           // World w = getWorld();
           // w.removeObject(this);
           // w.removeObject(proyectile);
            List<Projectile> list_e_=getTouchedObjects(Projectile.class);
         
              timer--;
          
                
         
        for(Projectile e_:list_e_){
           // World w = getWorld();
            
           // e_.getWorld().removeObject(this);
           e_.getWorld().removeObject(proyectile);
            //setLocation(getX()-10 , getY()-10);
         //Greenfoot.setWorld(new MyWorld());
                 
                //do{
            //  Guts(true,r);
             // r++;
            //}while (timer>0);
              //  timer=15;
            if(timer<=0){
                  w.vidas.decrementar();
                  timer=15;
                }  
              
           // }
            
        }
         if(w.vidas.valor()<=0){
           
             Greenfoot.setWorld(new Instructions(0, w));
             
        }
      
           
    
    }
   
     //r=0;
     //timer=0;
       
}
}