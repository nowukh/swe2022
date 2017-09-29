package lesson4.network;

import java.util.ArrayList;

public class Network {

    //Member-----------------------------
    public class Member{
        final private String name;
        private ArrayList<Member> friends;

        public Member(String name){ //생성자로 초기화해주는 중.
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void leave(){
            //members.remove(this); 이런 식으로 members를 수정할 권리를 주면 안된다 그건 network의 권리. 캡슐화 깨진다
            unenroll(this);//따라서, network의 캡슐화되어있는 메소드를 불러줘야한다.
        }
        public boolean belongsTo(Network n){
            return n == Network.this;
        }
    }
    //Network-------------------------------------------
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name){ //newMember라는 인스턴스를 반환한다
        //여기서 this는 new Network()를 한 net1이고 newMember의 outer는 net1
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member member){
        members.remove(member);
    }
}
