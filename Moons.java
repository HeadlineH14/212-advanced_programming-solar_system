public class Moons extends Planets
{
    public int MoonDistance()
    {
        int moonDis = planetDistance() + 10;
        return moonDis;
    }
    public int MoonAngle()
    {
        int moonAng = 0;
        return moonAng;
    }
    public int MoonDiamiter()
    {
        int moonDia = planetDiamiter()/2;
        return moonDia;
    }
    public String MoonColour()
    {
        String moonCol = "WHITE";
        return moonCol;
    }
    public int MoonCenterOfRotationDistance()
    {
        int moonCORD = 40;
        return moonCORD;
    } 
    public int MoonCenterOfRotationAngle()
    {
        int moonCORA = 0;
        return moonCORA;
    }
}