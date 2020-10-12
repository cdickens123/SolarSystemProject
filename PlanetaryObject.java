public class PlanetaryObject{
    //should this be an interface because I don't ever actually want it to be implemented?

    private  String colour;
    private int diameter;
    private double distance;
    private double angle;

    PlanetaryObject(String colour,int diameter,double distance, double angle){
        //constructor
        this.colour = colour;
        this.diameter = diameter;
        this.distance = distance;
        this.angle = angle;
    }

    // I don't need a setter for the colour or diameter because it shouldn't change
    // need a setter for location
    //need a getter for location

    public double[] getLocation(){
        //returns the location of the object in the form of an array
        return new double[] {this.distance,this.angle};
    }

    public void setLocation(double[] location){
        this.distance = location[0];
        this.angle = location[1];
    }
}