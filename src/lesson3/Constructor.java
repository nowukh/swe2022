package lesson3;

import java.util.ArrayList;

public class Constructor {

    private final String firstName;
    private final String lastName;
    private String seperator; //초기화
    private ArrayList<String> friendsName;

    {
        seperator = " ";
        friendsName = new ArrayList<>();
        friendsName.add("철수");
    }

    public Constructor(){
        this("길동", "홍");
    }

    public Constructor(String fName){
        this(fName, "정");

    }

    public Constructor(String fName, String lName ){
        firstName = fName;
        lastName = lName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public ArrayList<String> getFriendsName(){
        return friendsName;
    }
}
