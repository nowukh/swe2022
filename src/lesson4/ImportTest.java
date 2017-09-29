package lesson4;


import lesson4.sample.Imported;


public class ImportTest {
    static public void main{
        System.out.println(lesson4.sample.Imported.getText());
        System.out.println(Imported.getText());
        StaticInnerClass.Class2 class2 = new StaticInnerClass.Class2();
    }
}
