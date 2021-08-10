public class BankAcc
{
    String acc_no, phone_no, name, email;
    float balance, org_balance;

    public String get_acc_no()
    {
        return acc_no;
    }
    public String get_phone_no()
    {
        return phone_no;
    }
    public float get_balance()
    {
        return balance;
    }
    public String get_name()
    {
        return name;
    }
    public String get_email()
    {
        return email;
    }
    public void set_acc_no(String acc_no)
    {
        this.acc_no = acc_no;
    }
    public void set_phone_no(String phone_no)
    {
        this.phone_no = phone_no;
    }
    public void set_balance(float balance)
    {
        this.balance = balance;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    public void set_email(String email)
    {
        this.email = email;
    }
    public void Deposit_funds(float amount)
    {
        balance= balance+amount;
    }
    public void Withdraw_funds(float amount)
    {
        org_balance = balance;
        balance= balance-amount;
        if(balance<0)
        {
            System.out.println("Transaction couldn't be completed due to insufficient balance");
            balance = org_balance;
        }
    }
}
