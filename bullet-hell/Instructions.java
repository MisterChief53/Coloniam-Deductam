import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
* clase Instructions Genera los distintos tipos de menu(inicio, derrota, Victoria)
* @author Valeria,Diego y Angel
* @version Final
*/
public class Instructions extends World
{
    World toWorld=null;
    int cont=0;//sera el menu que mostrara
    private GreenfootSound deathMusic = new GreenfootSound("trompeta.mp3");
    private GreenfootSound initialMusic = new GreenfootSound("initialMusic.mp3");
    private GreenfootSound finalMusic = new GreenfootSound("CancionFinal.mp3");
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
      private void setMainImage2()//Todos los setImage Preparan la pantalla(dar color de fondo, dar color a las letras, hacer que cubra la pantalla el menu,da estilo)
      //, ademas de poner un encabezado con algo de texto
    {
        // create the image for the background
        GreenfootImage main = new GreenfootImage(getWidth(), getHeight());
        main.setColor(Color.BLACK);
        main.fill(); // set a flat black background
        // create images and draw them on the background
        GreenfootImage img = new GreenfootImage("JUEGO TERMINADO", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 50);
        img = new GreenfootImage("(Has fracasado)", 18, Color.YELLOW, Color.BLACK);
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
        GreenfootImage img = new GreenfootImage("INFORMACION", 36, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 50);
        img = new GreenfootImage("(Estos son los controles)", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 90);
        // draw separator lines on the background
        main.setColor(Color.YELLOW);
        main.drawLine(0, 125, 720, 125);
        main.drawLine(0, 420, 720, 420);
        setBackground(main); // set the background image
    }
    private void setMainImage3()
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
    private void imageOne()//Todos los image ingresan el resto de texto que llevara el menu en diferentes posiciones e inicializan la musica
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
    private void imageFinal()
    {
        // retrieve the background image
        // retrieve the background image
        GreenfootImage main = getBackground();
        this.finalMusic.play();
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
    public void act()//verifica que si hay un click el menu haga una transicion hacia el juego como tal
    //y si ingresa enter el juego finalizara
    {
       if (Greenfoot.mouseClicked(null) && cont == 0){
           cont++;
            if(this.initialMusic.isPlaying()){
                this.initialMusic.stop();    
            }
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
             if(this.finalMusic.isPlaying()){
                this.finalMusic.stop();    
            }
            Greenfoot.stop();
        }
    }
}