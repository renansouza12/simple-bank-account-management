package challenger;

public class Bank{
    public static void main(String[] args) {
        BankUserDetail user = new BankUserDetail();
        
        BankMenu menu = new BankMenu(user.balance);
    }
}