/**
 * This interface provides a blueprint for 
 * objects to be modelled in the SolarSystem that
 * will be able to move and have an associated velocity.
 * @author Catherine Dickens
 */
interface Movable {
    public double getVelocity();
    //getter for the velocity of an object
    public void move();
    //method allowing objects to move position, usually orbit.
}