import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Create a new key.
     */
    public Key()
    {
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // Animate the piano key being pressed
        if (Greenfoot.isKeyDown("g"))
        {
            // Key is down
            setImage("white-key-down.png");
        }
        else
        {
            // Key is up
            setImage("white-key.png");
        }
        
    }
    
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}

