import java.util.*;
class TeamPlayersGenerics
{
    public static <S, E extends Iterable<S>> void printArray(E elements)
    {
        for ( Object element : elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        List<String> cricket=new ArrayList<String>();
        cricket.add("Shikhar Dhawan");
        cricket.add("Ravindra Jadeja");
        cricket.add("Rohit Sharma");
        cricket.add("Virat Kohli");
        cricket.add("Ajinkya Rahane");
        System.out.println("Cricket Team Players");
        printArray(cricket);

        List<String> football=new ArrayList<String>();
        football.add("Sunil Chhetri");
        football.add("Bhaichung Bhutia");
        football.add("Shabbbir Ali");
        football.add("Gouramangi Singh");
        football.add("Subrata Pal");
        System.out.println("Football Team Players");
        printArray(football);
    }

}
