public class TestMain
{

    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        b.set_acc_no("1567843212");
        b.set_name("Radhika");
        b.set_email("rradhkia1999@gmail.com");
        b.set_phone_no("8796665439");
        b.set_balance(10000);
        System.out.println(b.get_acc_no());
        System.out.println(b.get_name());
        System.out.println(b.get_email());
        System.out.println(b.get_phone_no());
        b.Withdraw_funds(4500);
        System.out.println(b.get_balance());
        b.Deposit_funds(6000);
        System.out.println(b.get_balance());
        b.Withdraw_funds(20000);
        System.out.println(b.get_balance());

        Bank obj = new Bank();
        obj.setBankName("ICICI");
        obj.setCustomer(b);
        obj.getCustomer().Deposit_funds(5000);
        System.out.println(obj.getCustomer().get_balance());
        obj.getCustomer().Withdraw_funds(500);
        System.out.println(obj.getCustomer().get_balance());
    }
}