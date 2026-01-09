public class SolarMain
{ 
    
    public static void main(String[] args){
    //integers for the objects to use 
    int i = 0; 
    int planetAng = 0;
    int moonAngle = 0;
    int moonCora = 0;
    //making the frame for the objects to exist in 
    SolarSystem milkyWay = new SolarSystem(600 ,600);
    Suns sun = new Suns();
    Planets earth = new Planets();
    planetAng = earth.planetAngle();
    Moons moon = new Moons();
    moonAngle = moon.MoonAngle();
    moonCora = moon.MoonCenterOfRotationAngle();

    //looping the making of the objects with increasing integers 
    while(i<1){

    //Suns.makeSun();
    milkyWay.drawSolarObject(sun.sunDistance(),sun.sunAngle(),sun.sunDiamiter(),sun.sunColour());
    milkyWay.drawSolarObjectAbout(earth.planetDistance(),planetAng ,earth.planetDiamiter(),earth.planetColour(),earth.palnetCenterOfRotationDistance(),earth.planetCenterOfRotatingAngle());
    milkyWay.drawSolarObjectAbout(moon.MoonDistance(),moonAngle , moon.MoonDiamiter(),moon.MoonColour(),moon.MoonCenterOfRotationDistance(),moonCora);
    
    //uses this to re draw and make it so they appear to move 
    milkyWay.finishedDrawing();
    planetAng = planetAng +1;
    moonAngle = moonAngle +1;
    moonCora = moonCora +4;
    }
}

}