package lesson3;

public class ClassBase1 {
    static public void main(String[] arg){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("광현");
        Constructor c3 = new Constructor("연주", "이");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c1.getFriendsName());

        NoCont noCont = new NoCont();
        System.out.println(noCont.getFirstName(c2));
        System.out.println(c2.firstName);
    }
}
