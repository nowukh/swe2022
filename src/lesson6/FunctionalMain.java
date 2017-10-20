package lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalMain {


    public void main(String[] arg){
        Employee me = new Employee(2000), you = new Employee(5000);
        if (EmployeeTest.test(me, (m)->m.salary > 3000)) System.out.println("ok");
        else System.out.println("looser");

        if (EmployeeTest.test(you, (m)->m.salary > 2000)) System.out.println("ok");
        else System.out.println("looser");

        ArrayList<String> list = new ArrayList<String>();
        list.add(null);
        list.add("hika");
        list.add(null);
        list.add("KH");
    }
}