import java.util.*;
import java.math.*;
interface MyCam{
    void Snap();
    void record();
    private void greet(){
        System.out.println("Very Good morning Aarjav:)");
    }
    default void recordQual(){
        greet();
        System.out.println("Recording in 4K Quality");
    }
}
interface WiFi{
    String[] getNet(); 
    void connection(String network);  
}
class My_Phone{
    void callNum(BigInteger contact){
        System.out.println("Calling "+contact);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends My_Phone implements WiFi,MyCam{
    public void Snap(){
        System.out.println("Taking snap");
    }
    public void record(){
        System.out.println("Recording snap");
    }
    public String[] getNet(){
        System.out.println("Getting list of networks");
        String[] net_list={"Aarjav Galaxy M32","ABT S21","OPPO A24","VITBPL"};
        return net_list;
    }
    public void connection(String network){
        System.out.println("Connecting to "+network);
    }
}
public class TIP{
    public static void main(String[] args){
        MySmartPhone ms = new MySmartPhone();
        ms.recordQual();
        String[] ar = ms.getNet();
        for (String item: ar){
            System.out.println(item);
        }
    }
}