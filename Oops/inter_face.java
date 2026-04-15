interface payment {
    void pay();
}
class upi implements payment {
    public void pay() {
        System.out.println("UPI paytm karooooooooooo");
    }
}
class atm implements payment {
    public void pay() {
        System.out.println("ATM Withdrawal");
    }
}

public class inter_face {
    public static void main (String args[]) {
        payment p;
        p = new upi();
        p.pay();
        p = new atm();
        p.pay();
    
    }
}