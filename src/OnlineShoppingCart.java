import  java.util.*;
public class OnlineShoppingCart extends Exception
{
    static int choice;
    int selection, total_amt, amt, no_of_items, no_of_sofa = 5, no_of_table = 5, no_of_spices = 5, no_of_oranges = 10, no_of_Bluetooth_Speaker = 5, no_of_television = 5,total = 0;
    int price_of_sofa = 50000, price_of_table = 25000, price_of_spice = 250, price_of_orange = 15, price_of_Bluetooth_Speaker = 7000, price_of_television = 90000;
    public void ContinueShopping(int amt) throws Exception {
        total_amt += amt;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter YES if you wish to continue shopping");
        String answer = s.nextLine();
        if (answer.equals("YES")) {
            System.out.println("Taking u to display class");
            Display();
        } else {
            System.out.println("Amount: " + total_amt);
        }
    }
    public void DisplayChoice(int choice) throws Exception
    {
        Scanner s = new Scanner(System.in);
        switch (choice)
        {
            case 1:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Sofa");
                System.out.println("2. Table");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                amt = ProcessTheAmountForFurniture(selection);
                ContinueShopping(amt);
                break;
            case 2:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Spices");
                System.out.println("2. Oranges");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                amt =ProcessTheAmountForGroceries(selection);
                ContinueShopping(amt);
                break;
            case 3:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Bluetooth Speaker");
                System.out.println("2. Television");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                amt = ProcessTheAmountForElectronics(selection);
                ContinueShopping(amt);
                break;
            default:
                System.out.println("Kindly choose a number form the menu provided");

        }
    }
    public int ProcessTheAmountForFurniture(int selection)throws Exception
    {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_sofa)
            {
                no_of_sofa = no_of_sofa - no_of_items;
                total += price_of_sofa*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_table)
            {
                no_of_table = no_of_table - no_of_items;
                total += price_of_table*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
    public int ProcessTheAmountForGroceries(int selection) throws Exception
    {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_spices)
            {
                no_of_spices = no_of_spices - no_of_items;
                total += price_of_spice*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_oranges)
            {
                no_of_oranges = no_of_oranges - no_of_items;
                total += price_of_orange*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
    public int ProcessTheAmountForElectronics(int selection) throws Exception
    {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_Bluetooth_Speaker)
            {
                no_of_Bluetooth_Speaker = no_of_Bluetooth_Speaker - no_of_items;
                total += price_of_Bluetooth_Speaker*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_television)
            {
                no_of_television = no_of_television- no_of_items;
                total += price_of_television*no_of_items;
            }
            else
            {
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
    public void Display() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CATEGORIES: ");
        System.out.println("1. Furniture");
        System.out.println("2. Groceries");
        System.out.println("3. Electronics");
        System.out.println("Choose a category by entering the number: ");
        choice = sc.nextInt();
        DisplayChoice(choice);
    }
    public static void main(String[] args) throws Exception
    {
        OnlineShoppingCart o = new OnlineShoppingCart();
        o.Display();
    }
}
