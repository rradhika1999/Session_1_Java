import java.util.*;
public class Robot extends Exception
{
    Scanner sc = new Scanner(System.in);
    String move,movement;
    static int flag = 0;
    char step;
    public String getMovements()
    {
        System.out.print("Enter the movement of the Robot: ");
        move = sc.next();
        movement = move.toUpperCase();
        return movement;
    }
    public int monitorMovement(String movement) throws RuntimeException
    {
        for(int i=0;i<movement.length();i++)
        {
            step = movement.charAt(i);
            if(step == 'D' || step == 'R' || step == 'L')
            {
                throw new RuntimeException("Robot is not moving in a straight line!");
            }
            else
            {
                flag++;
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Robot r = new Robot();
        String input = r.getMovements();
        try
        {
            int receive_code = r.monitorMovement(input);
            if(receive_code == input.length())
            {
                System.out.println("Robot's movement is just fine");
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}