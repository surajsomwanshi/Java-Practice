import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

    public static void main(String[] args) {
        Set<String> linkedHash= new LinkedHashSet<String>();

        linkedHash.add("Sachin");
        System.out.println(linkedHash);
        linkedHash.add("Virat");
        System.out.println(linkedHash);
        linkedHash.add("Dhoni");
        System.out.println(linkedHash);
        linkedHash.add("Virat");
        System.out.println(linkedHash);

        for (String cricketer:linkedHash){
            System.out.println(cricketer);
        }
    }
}
