public class SolarSystemTask{
    //I'm confused about how to use our classes
    //as well as the existing solar system class it feelsl like it's just doubling up
    //are we meant to alter the solar system class?

    public static void main(String[] args){
        SolarSystem solarSystem  = new SolarSystem(1200,700);
        //creates an instance of solar system
        Sun sun = new Sun("#FFFF00",50,0,0,solarSystem);
        //the modelled velocity is actual velcioty divided by ten. The modelled diameter is actualt dimaeter divide by 200
        Planet mercury = new Planet("RED",10,40,45,solarSystem,4);
        Planet venus = new Planet("WHITE",25,60,190,solarSystem,3);
        Planet earth = new Planet("GREEN",25,110,90,solarSystem,2.5);
        Planet mars = new Planet("RED",25,140,105,solarSystem,1.5);
        Planet jupiter = new Planet("BLUE",28,170,90,solarSystem,0.3);
        Planet saturn = new Planet("GREY",25,200,190,solarSystem,0.7);
        Planet uranus = new Planet("GREEN",15,230,90,solarSystem,0.5);
        Planet neptune = new Planet("BLUE",20,280,90,solarSystem,0.8);
        Planet pluto = new Planet("BLUE",7,310,90,solarSystem,0.9);


        int x =0;
        while (true){
           System.out.println(x);
           //one full revolution
           venus.move(venus.getLocation()[0],x);
           mercury.move(mercury.getLocation()[0],x);
           earth.move(earth.getLocation()[0],x);
           mars.move(mars.getLocation()[0],x);
           jupiter.move(jupiter.getLocation()[0],x);
           saturn.move(saturn.getLocation()[0],x);
           uranus.move(uranus.getLocation()[0],x);
           neptune.move(neptune.getLocation()[0],x);
           pluto.move(pluto.getLocation()[0],x);
           sun.setLocation(0,0);
           solarSystem.finishedDrawing();
           x++;
        }



    }
}