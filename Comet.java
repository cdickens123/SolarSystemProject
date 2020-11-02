public class Comet extends PlanetaryObject implements Movable{

    private double velocity; 

    Comet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem);
        this.velocity = velocity;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public void move(){
        this.distance = distance;
        this.angle = angle * this.getVelocity();
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    }
    
}