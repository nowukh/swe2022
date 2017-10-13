package lesson5;

public class Main {
    static public void main(String[] arg){
        Customer customer = new Customer();
        Banker banker = new Banker();
        System.out.println(customer.deposit(banker, Currency.WON, 20));
        System.out.println(customer.deposit(banker, Currency.WON, 200));
        ////

        Employee me = new Employee(100), you = new Employee(200);
        System.out.println(me.compareTo(you));
    }
}
