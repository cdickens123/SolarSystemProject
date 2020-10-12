

public class SolarSystemTask{
    public static void main(String[] args){
        SolarSystem solarSystem  = new SolarSystem(300,300);

       for (int x=0; x< 360;x++){
           solarSystem.drawSolarObject(0,0,50,"#FFFF00");
           solarSystem.drawSolarObject(50,x,25,"BLUE");
           solarSystem.finishedDrawing();
           if (x==359){
               x = 0;
           }
       }
    }
}