import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
private void prepare()
    {
        Mobil mobil = new Mobil();
        addObject(mobil,87,89);
orang orang = new orang();
addObject(orang,384,174);
orang orang2 = new orang();
addObject(orang2,567,376);
orang orang3 = new orang();
addObject(orang3,244,341);
orang orang4 = new orang();
addObject(orang4,663,81);
}
}
