package lesson3;



public class ClassBase0 {
    static public void main(String[] arg){
        Parent parent = new Child();

        System.out.println( parent.action() );

        parent.mutator("abc");
        System.out.println(parent.getName());

    }

}
