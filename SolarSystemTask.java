import java.util.*; // import the ArrayList class

public class SolarSystemTask{
    //driver class

    static ArrayList<Planet> planets = new ArrayList<Planet>(); //array to store all planets modelled
    static ArrayList<Moon> moons = new ArrayList<Moon>(); //array to store all moons modelled
    static ArrayList<Asteroid> asteroids = new ArrayList<Asteroid>(); //array to store all asteroids modelled


    public static void main(String[] args){

        SolarSystem solarSystem  = new SolarSystem(1200,700);
        //creates an instance of solar system

        Sun sun = new Sun("#FFFF00",50,0,0,solarSystem);
        //create a sun object

        Planet mercury = new Planet("RED",10,40,90,solarSystem,2);
        planets.add(mercury);
        Planet venus = new Planet("WHITE",25,60,45,solarSystem,1);
        planets.add(venus);
        Planet earth = new Planet("GREEN",25,90,30,solarSystem,0.5);
        planets.add(earth);
        Planet mars = new Planet("RED",25,140,0,solarSystem,0.5);
        planets.add(mars);
        Planet jupiter = new Planet("BLUE",28,170,190,solarSystem,0.1);
        planets.add(jupiter);
        Planet saturn = new Planet("GREY",25,200,300,solarSystem,0.3);
        planets.add(saturn);
        Planet uranus = new Planet("GREEN",15,230,20,solarSystem,0.2);
        planets.add(uranus);
        Planet neptune = new Planet("BLUE",20,280,150,solarSystem,0.5);
        planets.add(neptune);
        Planet pluto = new Planet("BLUE",7,310,0,solarSystem,1.6);
        planets.add(pluto);
        //create all planets and add them to the array

        Moon earthMoon = new Moon("GREY",10,20, 90,solarSystem, 5, earth);
        moons.add(earthMoon);
        Moon phobos = new Moon("GREY",10,30, 90,solarSystem, 6, mars);
        moons.add(phobos);
        Moon deimos = new Moon("GREY",10,20, 90,solarSystem, 5, mars);
        moons.add(deimos);
        Moon tritan = new Moon("#32a8a4",10,20, 90,solarSystem, 4.5, neptune);
        moons.add(tritan);
        Moon mimas = new Moon("#d9cb71",10,20, 90,solarSystem, 4.5, saturn);
        moons.add(mimas);
        Moon europa = new Moon("#b0f5e5",10,25, 90,solarSystem, 4.1, jupiter);
        moons.add(europa);
        Moon callisto = new Moon("#b0f5e5",10,20, 90,solarSystem, 3, jupiter);
        moons.add(callisto);
        //create all moon objects and add to array

        while (true){

            for (Planet planet: planets){
                planet.move();
            }
            //set all planets off orbiting

            for (Moon moon: moons){
                moon.move();
            }
            //set all moons off orbiting

           sun.setLocation(0,0);
           //set the sun to be in the centre of the frame
           solarSystem.finishedDrawing();
           //display all objects
        }



    }
}