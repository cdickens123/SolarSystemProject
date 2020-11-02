/**
 * This class provides a Sun object,
 * to be displayed using an instantiation of SolarSystem.
 * The Sun class inherits from PlanetaryObject
 * @author Catherine Dickens
 */

public class Sun extends PlanetaryObject{
    //class to represent the Sun
    //parent class is the abstract class PlanetaryObject

    /**
     * 
     * Creates an instance of a Sun,
     * which can then be displayed in a Solar System object.
    * @param colour the colour of this Sun, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this Sun.
     * @param distance the distance from the centre of the solar System window to this Sun. Should be 0 for a solar system containing a single central sun.
     * @param angle the angle (in degrees) that represents the position of this comet in relation to the sun. Should be 0 for a solar system containing a single central sun.
     * @param solarSystem the solar system in which this Sun exists.
     */
    Sun(String colour,int diameter,double distance, double angle,SolarSystem solarSystem){
        super(colour,diameter,distance,angle,solarSystem);
    }

}