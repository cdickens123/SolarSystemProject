/**
 * This class provides a comet object,
 * to be displayed using an instantiation of SolarSystem.
 * The Comet class inherits from PlantaryObject
 * and implements the Movable interface.
 * @author Catherine Dickens
 */
public class Comet extends PlanetaryObject implements Movable{

    private double velocity; 

    /**
     * 
     * Creates an instance of a Comet,
     * which can then be displayed in a Solar System object.
    * @param colour the colour of this comet, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this comet.
     * @param distance the distance from the sun to this comet.
     * @param angle the angle (in degrees) that represents the position of this comet in relation to the sun.
     * @param solarSystem the solar system in which this comet exists.
     * @param velocity the speed at which this comet moves.
     */
    Comet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem);
        //constructor chaining, calls constructor in Planetary Object.
        this.velocity = velocity;
    }

    /**
     * Returns the velocity of this Comet.
     */
    public double getVelocity(){
        return this.velocity;
    }

    /**
     * Moves this comet in orbit around the Sun.
     * When called repeatedly the comet will
     * orbit the Sun at it's corresponding velocity.
     */
    public void move(){
        this.distance = distance;
        this.angle = angle * this.getVelocity();
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    }
    
}