public abstract class PlanetaryObject{
    //super class, representing an object in the solar system
    //an abstract class as is too generic to ever be implemented

    protected String colour;
    protected int diameter;
    protected double distance;
    protected double angle;
    //properites of any object in the solar system.
    //protected as only those subclasses need to access these balues
    public SolarSystem solarSystem;
    //indicates which solar system a given object belongs

    PlanetaryObject(String colour,int diameter,double distance, double angle,SolarSystem solarSystem){
        //constructor
        this.colour = colour;
        this.diameter = diameter;
        this.distance = distance;
        this.angle = angle;
        this.solarSystem = solarSystem;
    }


    public double[] getLocation(){
        //returns the location of the object in the form of an array
        //getter
        return new double[] {this.distance,this.angle};
    }

    public double getDiameter(){
        //getter for diameter property
        return diameter;
    }

    public String getColour(){
        //getter for colour property
        return colour;
    }

    public void setLocation(double distance, double angle){
        //moves an object to the given location
        this.distance = distance;
        this.angle = angle;
        solarSystem.drawSolarObject(distance,angle,getDiameter(),getColour());
    }
}