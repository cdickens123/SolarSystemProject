public class Moon extends PlanetaryObject implements Movable{

    private double velocity;
    public Planet planetOfOrbit;

    Moon(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity, Planet planetOfOrbit){
        super(colour,diameter,distance,angle,solarSystem);
        this.velocity = velocity;
        this.planetOfOrbit = planetOfOrbit;
    }

    public double getVelocity(){
        return this.velocity;
    }
    //we need the angle and distance of the point about which this orbits

    public void move(double distance,double angle){
        this.distance = distance;
        this.angle = angle * this.getVelocity();
        solarSystem.drawSolarObjectAbout(this.distance,this.angle,getDiameter(),getColour(),planetOfOrbit.getLocation()[0],planetOfOrbit.getLocation()[1]);
    }
    
}