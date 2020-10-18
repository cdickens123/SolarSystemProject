public class Planet extends PlanetaryObject implements Movable{

    private double velocity; 

    Planet(String colour,int diameter,double distance, double angle,SolarSystem solarSystem, double velocity){
        super(colour,diameter,distance,angle,solarSystem);
        this.velocity = velocity;
    }

    private double getVelocity(){
        return this.velocity;
    }

    public void move(){

    }
}