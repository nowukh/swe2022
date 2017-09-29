package lesson4;
import lesson4.sample.Imported;

public class StaticNestedClass {
    private static class Class1{
        Class1(){
            System.out.println(Imported.getText());
        }
    }
    static class Class2{
        Class2(){
        }
    }
    static public void main(String[] arg){
        Class1 class1 = new Class1();
    }
}
