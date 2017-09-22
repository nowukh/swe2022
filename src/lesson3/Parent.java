package lesson3;

public class Parent {
    private  String name = "";

    public String action() {
        String s = "parent 입니다";
        return s;
    }

    public String mutator(String v) {
        name += v;
        return name;
    }

    public String getName() {


        return name;
    }
}

