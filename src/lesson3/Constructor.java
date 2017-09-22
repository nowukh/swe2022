package lesson3;

public class Constructor {

    private String firstName;
    private String lastName;

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
}
