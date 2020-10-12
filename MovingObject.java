public class MovingObject extends PlanetaryObject{

    private double velocity;

    MovingObject(String colour,int diameter,double distance, double angle, double velocity){
        //constructor
        //i'm confused about the inheritance of constructors
        this.colour = colour;
        this.diameter = diameter;
        this.distance = distance;
        this.angle = angle;
        this.velocity = velocity;
    }

    private double getVelocity(){
        //private because this is only needed within the class to aid movement
        return this.velocity;
    }

    public void move(){
        //unclear whether this is orbiting yet so left blank
    }


    
}