public class Planet extends PlanetaryObject implements Movable{
    //class to represent all planets in the solar system
    //implements movable interface as planets can move

    private double velocity;
    //property to influence the speed of orbit 

    Planet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        //constructor
        super(colour,diameter,distance,angle,solarSystem);
        //initialises super
        this.velocity = velocity;
        //extends by intialising velocity property
    }

    public double getVelocity(){
        //velocity getter
        return this.velocity;
    }

    public void move(){
        //sets planets orbiting
        this.angle = this.angle + (1* this.getVelocity());
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    }
}