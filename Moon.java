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

    public void move(){
        this.angle = this.angle + (1* this.getVelocity());
        solarSystem.drawSolarObjectAbout(this.distance,this.angle,getDiameter(),getColour(),planetOfOrbit.getLocation()[0],planetOfOrbit.getLocation()[1]);
    }
    
}