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
    /**
    * Constructor for objects of class Instructions.
    *
    */
    public Instructions(int value, World inWorld)
    {
// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        setMainImage();
        switch(value)
        {
        case 0:
            imageOne();
            break;//pa despues
        case 1:
            imageTwo();
            break;
        }
        toWorld=inWorld;
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
    private void imageOne()
    {
// retrieve the background image

    }
    private void imageTwo()
    {
// retrieve the background image
        GreenfootImage main = getBackground();
// create text images and draw them on the background
        GreenfootImage img = new GreenfootImage("You can use the arrow keys or w,a,s,d to move", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 200);
        img = new GreenfootImage("to shoot you can use space and for be slower", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 230);
        img = new GreenfootImage("you can use shift + one of the keys of movement", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 260);
        img = new GreenfootImage("Good luck and Welcome to HELL", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 440);
        img = new GreenfootImage("Click anywhere to begin the game", 18, Color.YELLOW, Color.BLACK);
        main.drawImage(img, (main.getWidth() - img.getWidth()) / 2, 470);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(null) && cont==0){
           
           Greenfoot.setWorld(toWorld);
        }
    }
}