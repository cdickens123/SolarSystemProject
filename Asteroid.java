/**
 * This class provides an Asteroid object to be displayed in the Solar System.
 * Inherits from Planet.
 * @author Catherine Dickens
 */

public class Asteroid extends Planet{

    private double velocity; 
    
    /**
     * Creates an instance of an asteroid, that
     * can then be displayed in the Solar System.
     * 
     * @param colour the colour of this asteroid, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this asteroid.
     * @param distance the distance from the sun to this asteroid.
     * @param angle the angle (in degrees) that represents how far this asteroid is in orbit around the sun.
     * @param solarSystem the solar system in which this asteroid exists.
     * @param velocity the speed at which this asteroid moves.
     */
    Asteroid(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem,velocity);
        //constructor chaining, calls constructor in Planet.
        this.velocity = velocity;
    }

}