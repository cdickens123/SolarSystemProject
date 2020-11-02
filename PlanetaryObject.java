/**
 * This abstract class provides a blueprint
 * for any object to be modelled in the Solar System.
 * @author Catherine Dickens
 */
public abstract class PlanetaryObject{
    //super class, representing an object in the solar system

    protected String colour;
    protected int diameter;
    protected double distance;
    protected double angle;
    public SolarSystem solarSystem;
    //indicates which solar system a given object belongs

    
    /**
     * Will be called by child classes through constructor chaining
     * to create any object that will be displayed in the Solar System.
    * @param colour the colour of this PlanetaryObject, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     * @param diameter the size of this PlanetaryObject.
     * @param distance the distance from the sun to this PlanetaryObject.
     * @param angle the angle (in degrees) that represents the position of this PlanetaryObject in relation to the sun.
     * @param solarSystem the solar system in which this PlanetaryObject exists.
     */
    PlanetaryObject(String colour,int diameter,double distance, double angle,SolarSystem solarSystem){
        //constructor
        this.colour = colour;
        this.diameter = diameter;
        this.distance = distance;
        this.angle = angle;
        this.solarSystem = solarSystem;
    }

    /**
     * Returns the location of this PlanetaryObject
     * in the form of Polar Coordinates.
     * Returned in an array [distance from object of orbit, angle around object of orbit]
     */
    public double[] getLocation(){
        //returns the location of the object in the form of an array
        return new double[] {this.distance,this.angle};
    }


    /**
     * Returns the diameter of this PlanetaryObject.
     */
    public double getDiameter(){
        //getter for diameter property
        return diameter;
    }

    /**
     * Returns the colour of this PlanetaryObject.
     */
    public String getColour(){
        //getter for colour property
        return colour;
    }

    /**
     * Sets the location of this planetary object in the SolarSystem
     * and draws the object at this location.
     * @param angle the angle (in degrees) that represents the position of this PlanetaryObject in relation to the sun.
     * @param solarSystem the solar system in which this PlanetaryObject exists.
     */
    public void setLocation(double distance, double angle){
        //moves an object to the given location
        this.distance = distance;
        this.angle = angle;
        solarSystem.drawSolarObject(distance,angle,getDiameter(),getColour());
    }
}