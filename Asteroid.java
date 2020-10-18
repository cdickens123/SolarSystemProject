public class Asteroid extends PlanetaryObject implements Movable{

    private double velocity;

    Asteroid(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem);
        this.velocity = velocity;
    }

    private double getVelocity(){
        return this.velocity;
    }

    public void move(
        this.distance = distance;
        this.angle = angle * this.getVelocity();
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    )
    
}