package lesson4;

import com.sun.scenario.animation.shared.TimerReceiver;
import lesson4.sample.Imported;

import java.awt.*;

public class StaticInnerClass {
    private static class Class1{
        Class1(){
            System.out.println(Imported.getText());
        }

    }
    static class Class2{
        Class1(){

        }
    }
    static public void main(String[] arg){
        Class1 class1 = new Class1();
    }
}
