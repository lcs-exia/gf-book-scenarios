import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * These can be used anywhere in the class below.
     */
    private boolean keyAlreadyDown;
    // Will contain the key and sound file thatthis instance of the class will play
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        // No key has been pressed
        keyAlreadyDown = false;
        
        // Set the instance variab;es using the paramteres
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // Animate the piano key being pressed
        // Condition 1 - is the "g" key being pressed
        // Condition 2 - was NOT already down
        if (((Greenfoot.isKeyDown(key)) && !keyAlreadyDown))
        {
            // Key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        // Stop showing the key being pressed
        // Condition 1 - The key was down the last act() fired
        // Condition 2 - The "g" has been released (no longer being pressed)
        if ( (keyAlreadyDown == true) && (!Greenfoot.isKeyDown (key))) 
        {
            // Key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
    }

    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }
}

