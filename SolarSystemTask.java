public class SolarSystemTask{
    public static void main(String[] args){
        SolarSystem solarSystem  = new SolarSystem(300,300);
        //creates an instance of solar system

       for (int x=0; x< 360;x++){
           //one full revolution
           solarSystem.drawSolarObject(0,0,50,"#FFFF00");
           //draw the sun in the center.
           solarSystem.drawSolarObject(50,x,25,"BLUE");
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