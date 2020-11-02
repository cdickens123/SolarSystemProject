/**
 * This class provides a Moon object,
 * to be displayed using an instantiation of SolarSystem.
 * The Moon class inherits from PlanetaryObject
 * and implements the Movable interface.
 * @author Catherine Dickens
 */
public class Moon extends PlanetaryObject implements Movable{

    private double velocity;
    public Planet planetOfOrbit;

    
    /**
     * Creates an instance of a Moon,
     * which can then be displayed in a Solar System object.
    * @param colour the colour of this moon, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this moon.
     * @param distance the distance from this moon's planet of orbit to the moon.
     * @param angle the angle (in degrees) that represents how far this moon is in orbit around its planet of orbit.
     * @param solarSystem the solar system in which this moon exists.
     * @param velocity the speed at which this moon moves.
     * @param planetOfOrbit the Planet object around which this moon orbits.
     */
    Moon(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity, Planet planetOfOrbit){
        super(colour,diameter,distance,angle,solarSystem);
        //calls constructor on PlanetaryObject class
        this.velocity = velocity;
        this.planetOfOrbit = planetOfOrbit;
    }

    
    /**
     * Returns the velocity of this Moon.
     */
    public double getVelocity(){
        return this.velocity;
    }

    /**
     * Moves this moon in orbit around another PlanetaryObject.
     * When called repeatedly the moon will
     * orbit the object at its corresponding velocity.
     */
    public void move(){
        this.angle = this.angle + (1* this.getVelocity());
        solarSystem.drawSolarObjectAbout(this.distance,this.angle,getDiameter(),getColour(),planetOfOrbit.getLocation()[0],planetOfOrbit.getLocation()[1]);
    }
    
}