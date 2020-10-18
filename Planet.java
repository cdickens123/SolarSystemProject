public class Planet extends PlanetaryObject implements Movable{

    private double velocity; 

    Planet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem);
        this.velocity = velocity;
    }

    public double getVelocity(){
        return this.velocity;
    }

    public void move(double distance,double angle){
        this.distance = distance;
        this.angle = angle * this.getVelocity();
        solarSystem.drawSolarObject(this.distance,this.angle,getDiameter(),getColour());
    }
}