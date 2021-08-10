import java.util.*;
public class College
{
    static String city;
    public void Location()
    {
        System.out.println("Location: "+city);
    }
    public static void main(String[] args)
    {
        College c = new College();
        System.out.print("Kindly enter the city: ");
        Scanner sc = new Scanner(System.in);
        city = sc.next();
        c.Location();
    }
}
