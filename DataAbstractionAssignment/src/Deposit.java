import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        // Default Constructor
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        // // Effects: Allows variables to be returned as strings
        return ("Deposit of: $" + amount + " Date: " + date + " into account: " + account);
        }
    }

