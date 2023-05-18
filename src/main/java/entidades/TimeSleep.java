package entidades;

public class TimeSleep {

    public static void timesleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){}
    }
}
