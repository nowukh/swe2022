package lesson4;


import lesson4.sample.Imported;


public class ImportTest {
    static public void main(String[] arg){
        System.out.println(lesson4.sample.Imported.getText());
        System.out.println(Imported.getText());
        StaticNestedClass.Class2 class2 = new StaticNestedClass.Class2();
    }
}
