package models;

public class Balance_Checker {
    long balance;
    boolean check;
    public void fillBalance(long balance) {
        this.balance = balance;
    }

    public Boolean withdraw(long withdraw) {
        long foiz = withdraw/100;
        if (withdraw+foiz<=balance){
            balance = balance-(withdraw+foiz);
            check = true;
        } else {
            System.out.println("Mablag' yetarli emas");
            check = false;
        }
        return check;
    }

    public long getBalance() {
        return balance;
    }



    @Override
    public String toString() {
        return "Balance_Checker{" +
                "balance=" + balance +
                '}';
    }
}
