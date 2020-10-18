public class SolarSystemTask{
    //I'm confused about how to use our classes
    //as well as the existing solar system class it feelsl like it's just doubling up
    //are we meant to alter the solar system class?

    public static void main(String[] args){
        SolarSystem solarSystem  = new SolarSystem(300,300);
        //creates an instance of solar system

       for (int x=0; x< 360;x++){
           //one full revolution
           //colour diameter dsrance angle solar system
           Sun sun = new Sun("#FFFF00",50,0,0,solarSystem);
           sun.setLocation(0,0);
           //creating a sun object. Set the location to the center of the frame
           Planet planet = new Planet("BLUE",25,50,0,solarSystem,5);
           planet.setLocation(planet.getLocation()[0],x);
           //x changes so that the blue planet revolves around the sun.
           //create a blue planet
           solarSystem.finishedDrawing();
           //display the objects
           if (x==359){
               //resets x so the planet continues to move around the sun
               x = 0;
           }
       }
    }
}