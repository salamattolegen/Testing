package Utilities;

public class MyMethods {
    public static void MyWait (int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
