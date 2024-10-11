package Utility;

public class Tools {

    public static void Bekle(int sn)
    {
     try {
      Thread.sleep(sn*1000);
     }catch (InterruptedException e){
      throw new RuntimeException(e);
     }

    }
    public static int random(int sinir)
    {
        return (int) Math.random()*sinir;
    }
}
