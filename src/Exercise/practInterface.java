package Exercise;

class Account {
    private String accNo;
    private double balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {}

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

// ATM Interface
interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account, double amount) throws Exception;
    double getBalance(Account account); // Fixed method signature
}

// AxisATM Implementation
class AxisATM implements ATM {
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() - (amount + 5) < 5000) {
            throw new Exception("Minimum balance ₹5000 required in Axis Bank.");
        }
        account.setBalance(account.getBalance() - (amount + 5));
        return true;
    }

    public double getBalance(Account account) {
        return account.getBalance();
    }
}

// IciciATM Implementation
class IciciATM implements ATM {
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() - (amount + 10) < 10000) {
            throw new Exception("Minimum balance ₹10000 required in ICICI Bank.");
        }
        account.setBalance(account.getBalance() - (amount + 10));
        return true;
    }

    public double getBalance(Account account) {
        return account.getBalance();
    }
}

// Main Class
public class practInterface {
    public static void main(String[] args) {
        try {
            Account axisAcc = new Account("AXIS123", 24000);
            Account iciciAcc = new Account("ICICI456", 23000);

            ATM axisATM = new AxisATM();
            ATM iciciATM = new IciciATM();

            axisATM.deposit(axisAcc, 2000);
            iciciATM.withdraw(iciciAcc, 6000);

            System.out.println("Axis Bank Balance: ₹" + axisATM.getBalance(axisAcc));
            System.out.println("ICICI Bank Balance: ₹" + iciciATM.getBalance(iciciAcc));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
