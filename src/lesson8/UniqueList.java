package lesson8;

import java.util.ArrayList;

public class UniqueList {
    static private ArrayList<String> names = new ArrayList<>();
    private String name;

    public UniqueList(String name) throws Exception {
        if(names.contains(name)) throw new Exception(); //이미 있던 이름이면 오류.
        this.name = name;
        names.add(this.name);
    }

    public void setNames(String name) throws Exception{
        if(name == this.name) return; //같은 이름 또 썼으면 그냥 인정.
        if(names.contains(name)) throw new Exception();
        names.remove(this.name); //원래 이름 삭제하고 이름 생성.
        this.name = name;
        names.add(this.name);
    }
}
