import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
* Write a description of class Instructions here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Instructions extends World
{
    World toWorld=null;
    int cont=0;
    private GreenfootSound deathMusic = new GreenfootSound("trompeta.mp3");
    private GreenfootSound initialMusic = new GreenfootSound("initialMusic.mp3");
    private int time;
    private int score;
    /**
    * Constructor for objects of class Instructions.
    *
    */
    public Instructions(int value, World inWorld)
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        
        switch(value)
        {
            case 0:
                setMainImage2();
                imageOne();
               // Greenfoot.stop();
                break;//pa despues
            case 1:
                setMainImage();
                imageTwo();
                break;
            case 2:
                setMainImage3();
                imageFinal();
                break;
        }
        toWorld=inWorld;
    }
    public Instructions(int value, World inWorld, int time, int score)
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        this.time = time;
        this.score = score;
        switch(value)
        {
            case 0:
                setMainImage2();
                imageOne();
               // Greenfoot.stop();
                break;//pa despues
            case 1:
                setMainImage();
                imageTwo();
                break;
            case 2:
                setMainImage3();
                imageFinal();
                break;
        }
        toWorld=inWorld;
    }
      private void setMainImage2()
    {
        // create the image for the background
        GreenfootImage main = new GreenfootImage(getWidth(), getHeight());
        main.setColor(Color.BLACK);
        main.fill(); // set a flat black background
        // create images and draw them on the background
        GreenfootImage img = new GreenfootImage("GAME OVER", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 50);
        img = new GreenfootImage("(you are now in UNDERWORLD)", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 90);
        // draw separator lines on the background
        main.setColor(Color.YELLOW);
        main.drawLine(0, 125, 720, 125);
        main.drawLine(0, 420, 720, 420);
        setBackground(main); // set the background image
    }
    private void setMainImage()
    {
        // create the image for the background
        GreenfootImage main = new GreenfootImage(getWidth(), getHeight());
        main.setColor(Color.BLACK);
        main.fill(); // set a flat black background
        // create images and draw them on the background
        GreenfootImage img = new GreenfootImage("INFORMATION", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 50);
        img = new GreenfootImage("(you are now in InfoWorld)", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 90);
        // draw separator lines on the background
        main.setColor(Color.YELLOW);
        main.drawLine(0, 125, 720, 125);
        main.drawLine(0, 420, 720, 420);
        setBackground(main); // set the background image
    }
    private void setMainImage3()//Prepara la pantalla(dar color de fondo, dar color a las letras, hacer que cubra la pantalla el menu,da estilo)
      //, ademas de poner un encabezado con algo de texto
    {
       // Greenfoot.start();
        // create the image for the background
        GreenfootImage main = new GreenfootImage(getWidth(), getHeight());
        main.setColor(Color.BLACK);
        main.fill(); // set a flat black background
        // create images and draw them on the background
        GreenfootImage img = new GreenfootImage("VICTORIA", 54, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 50);
        img = new GreenfootImage("Lo lograste, colonizaste el planeta.", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 150);
        
         img = new GreenfootImage("Gloria al planeta tierra!", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 210);
         img = new GreenfootImage("Gloria a los humanos!", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 270);
        
        img = new GreenfootImage("Tiempo: " + this.time, 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 320);
        img = new GreenfootImage("Puntos: " + this.score, 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 350);
        
        // draw separator lines on the background
        main.setColor(Color.YELLOW);
        main.drawLine(0, 125, 720, 125);
        main.drawLine(0, 420, 720, 420);
        setBackground(main); // set the background image
    }
    private void imageOne()
    {
        // retrieve the background image
        // retrieve the background image
        GreenfootImage main = getBackground();
        this.deathMusic.play();
        // create text images and draw them on the background
        GreenfootImage img = new GreenfootImage("Haz perdido, y tu mision ha sido un fracaso.", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 200);
        img = new GreenfootImage("Puedes rendirte.", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 230);
        img = new GreenfootImage("Pero si quieres regresar al infierno", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 440);
        img = new GreenfootImage("Haz click donde sea para reintentar", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 470);
    }
    private void imageTwo()
    {
        // retrieve the background image
        GreenfootImage main = getBackground();
        this.initialMusic.play();
        // create text images and draw them on the background
        GreenfootImage img = new GreenfootImage("Puedes usar las flechas del teclado o w,a,s,d para moverte", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 200);
        img = new GreenfootImage("para disparar puedes usar el espacio, y para moverte mas lento", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 230);
        img = new GreenfootImage("puedes dejar aplanado la tecla shift.", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 260);
        img = new GreenfootImage("Buena suerte.", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 440);
        img = new GreenfootImage("Haz click donde sea para inciar el juego", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 470);
    }
    private void imageFinal()//ingresa el resto de texto que llevara el menu en diferentes posiciones
    {
        // retrieve the background image
        // retrieve the background image
        GreenfootImage main = getBackground();
        // create text images and draw them on the background
        
        GreenfootImage img = new GreenfootImage("Si quieres regresar al infierno", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 440);
        img = new GreenfootImage("Haz click donde sea", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 470);
        img = new GreenfootImage("Si te dio PTSD", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 500);
        img = new GreenfootImage("Presiona Enter", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 530);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(null) && cont == 0){
           cont++;
           Greenfoot.setWorld(toWorld);
        }
          if (Greenfoot.mouseClicked(null) && cont != 0){
           cont=0;
           //Greenfoot.setWorld(toWorld);
           if(this.deathMusic.isPlaying()){
                this.deathMusic.stop();    
            }
           Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.stop();
        }
    }
}