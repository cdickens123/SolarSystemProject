/**
 * This class provides a Planet object,
 * to be displayed using an instantiation of SolarSystem.
 * The Planet class inherits from PlantaryObject
 * and implements the Movable interface.
 * @author Catherine Dickens
 */
public class Planet extends PlanetaryObject implements Movable{
    //class to represent all planets in the solar system
    //implements movable interface as planets can move

    private double velocity;
    //property to influence the speed of orbit 

    
    /**
     * Creates an instance of a Planet,
     * which can then be displayed in a Solar System object.
    * @param colour the colour of this Planet, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this Planet.
     * @param distance the distance from the sun to this Planet.
     * @param angle the angle (in degrees) that represents how far this Planet is in its orbit around the sun.
     * @param solarSystem the solar system in which this planet exists.
     * @param velocity the speed at which this planet moves.
     */
    Planet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        //constructor
        super(colour,diameter,distance,angle,solarSystem);
        //initialises super
        this.velocity = velocity;
        //extends by intialising velocity property
    }

    /**
     * Returns the velocity of this Planet.
     */
    public double getVelocity(){
        //velocity getter
        return this.velocity;
    }

    /**
     * Moves this Planet in orbit around the Sun.
     * When called repeatedly the Planet will
     * orbit the Sun at it's corresponding velocity.
     */
    public void move(){
        //sets planets orbiting
        this.angle = this.angle + (1* this.getVelocity());
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    }
}