public class Bank {
    private int balance = 10000;
    public void withdrawl(int amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Amount is greater than balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawal success. remaining balance "+balance);
        }
    }
}
