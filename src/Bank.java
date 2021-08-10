public class Bank
{
    public String bankName;
    public BankAcc customer;

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }
    public BankAcc getCustomer()
    {
        return customer;
    }
    public void setCustomer(BankAcc customer)
    {
        this.customer = customer;
    }

}