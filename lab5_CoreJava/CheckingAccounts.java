package JavaObjectOrientedConcepts;

// Create an interface name Bankaccount
interface Bankaccount{
    void deposit(int amount);
    void withdraw(int amount);
    // Create to abstract method to deposit and withraw from accout

}
// create class Checkingaccount impliments Bankaccount

public class CheckingAccounts implements Bankaccount{
    int balance= 10000;

    @Override
    public void deposit(int amount) {
        balance+=amount;
    }
// override both method
    @Override
    public void withdraw(int amount) {
        if(amount<=balance){
            balance -=amount;
        }else{
            System.out.println("You dont have that much ammount in your bank account");
        }
    }

    public static void main(String[] args) {
    CheckingAccounts acn = new CheckingAccounts();
    acn.deposit(5000);
    acn.withdraw(3786);  // call both the methods and check the balance
    System.out.println(acn.balance);
    }
}
