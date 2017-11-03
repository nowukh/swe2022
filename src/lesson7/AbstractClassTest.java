package lesson7;

public class AbstractClassTest {
     static abstract class Person{ // 중첩클래스로 새로 객체 생성해서 부를거 아니고, 익명 클래스로 하려면 static 선언해줘야 한다.
        private String name;
        public Person(){this.name = "";}
        public Person(String name){this.name = name;}
        public final String getName(){return name;} //private으로 노출되지 않는 name을 보여주려고 생성. 그런건데 상속받은 클래스들이 override해서 이 메소드를 마음대로 바꾸면 의도와 완전히 달라지게 된다.

        public abstract int getId(); //추상 클래스는 추상 메소드 설정 가능.
                                    // 인터페이스와 비슷하게 메소드에 구현부가 없다. 하지만 public같이 접근제어자 설정 가능. 인터페이스처럼 상속받아 구현할 때 반드시 메소드를 오버라이드해서 구현해줘야 하는건 같지만, 그때도 접근제어자 써줘야 한다.
    }

    static class Student extends Person{
        private int id;
        public Student(String name, int id){ // 상속받아 superset의 subset을 생성하는 경우, superset의 생성자를 호출할 의무가 있다. 무조건 제일 처음에 호출해야 한다.
            super(name);    // 만약 우리가 super를 안쓰면 부모의 인자 없는 생성자를 호출하는 super();를 자동으로 생성해준다.
            this.id = id;
        }
        @Override
        public int getId() {
            return 0;
        }
    }

    static public void main(String[] arg){
        //익명클래스. 추상클래스는 람다를 받아줄 수 없다.?
        new Person( "kh"){
            @Override
            public int getId() {
                return 0;
            }
        };
    }
}
