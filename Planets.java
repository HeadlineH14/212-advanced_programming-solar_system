public class Planets extends Suns
{
    public int planetDistance()
    {
        int planetDis =sunDistance()+ 100;
        return planetDis; 
    }
    public int planetAngle()
    {
        int planetAng = 0;
        return planetAng;
    }
    public int planetDiamiter()
    {
        int planetDia = sunDiamiter()/2 ;
        return planetDia;
    }
    public String planetColour()
    {
        String planetCol = "BLUE";
        return planetCol;
    }
    public int palnetCenterOfRotationDistance()
    {
        int planetCORD = 0;
        return planetCORD;
    }
    public int planetCenterOfRotatingAngle()
    {
        int planetCORA = 100;
        return planetCORA;
    }

}