public class PlanetaryObject{
    //should this class be private because I OnLy wAnT It to be inherited from?
    //can u inherit from a private class?
    //should this be an interface because I don't ever actually want it to be implemented?

    protected String colour;
    protected int diameter;
    protected double distance;
    protected double angle;
    public SolarSystem solarSystem;

    PlanetaryObject(String colour,int diameter,double distance, double angle,SolarSystem solarSystem){
        //constructor
        this.colour = colour;
        this.diameter = diameter;
        this.distance = distance;
        this.angle = angle;
        this.solarSystem = solarSystem;
       // solarSystem.drawSolarObject(distance,angle,diameter,colour);
    }

    // I don't need a setter for the colour or diameter because it shouldn't change
    // need a setter for location
    //need a getter for location

    public double[] getLocation(){
        //returns the location of the object in the form of an array
        return new double[] {this.distance,this.angle};
    }

    public double getDiameter(){
        return diameter;
    }
    public String getColour(){
        return colour;
    }

    public void setLocation(double distance,double angle){
        this.distance = distance;
        this.angle = angle;
        solarSystem.drawSolarObject(distance,angle,getDiameter(),getColour());
    }
}