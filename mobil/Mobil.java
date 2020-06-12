import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobil extends Actor
{
    /**
     * Act - do whatever the Mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score=0;
    private int kecepatan = 3;
    public void act() 
    {
        getWorld().showText("Score = "+score, 50, 10);
        Belok();
        move(kecepatan);
        Tabrak();
    }    
    public void Belok()
    {
        if(Greenfoot.isKeyDown("A"))turn(-5);
        if(Greenfoot.isKeyDown("D"))turn(5);
    }
    public void Tabrak()
    {
        if(isTouching(orang.class))
        {
            removeTouching(orang.class);
            int x = Greenfoot.getRandomNumber(1000);
            int y = Greenfoot.getRandomNumber(600);
            orang baru = new orang ();
            getWorld().addObject(baru, x, y);
            score = score + 1;
            kecepatan = kecepatan +1;
            if(kecepatan >10)
            {
                kecepatan = 10;
            }
        }
    }
}
